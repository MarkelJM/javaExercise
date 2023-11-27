import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GestionBiblioteca {
    public static void main(String[] args) {










    }

    private final String URL = "jdbc:mysql://localhost:3306/LibraryDB";
    private final String USER = "root";
    private final String PASSWORD = "tu_contraseña";
    private Connection connect() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public void insertAuthor(String name, String nationality) {
        String sql = "INSERT INTO Author (name, nationality) VALUES (?, ?)";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, nationality);
            pstmt.executeUpdate();
            System.out.println("Author inserted successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void insertBook(String title, int publicationYear, int authorId) {
        String sql = "INSERT INTO Book (title, publicationYear, authorId) VALUES (?, ?, ?)";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, title);
            pstmt.setInt(2, publicationYear);
            pstmt.setInt(3, authorId);
            pstmt.executeUpdate();
            System.out.println("Book inserted successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void listBooks() {
        String sql = "SELECT b.title, b.publicationYear, a.name FROM Book b INNER JOIN Author a ON b.authorId = a.authorId";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                String title = rs.getString("title");
                int year = rs.getInt("publicationYear");
                String authorName = rs.getString("name");
                System.out.println(title + " (" + year + ") - " + authorName);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateBookPublicationYear(int bookId, int newYear) {
        String sql = "UPDATE Book SET publicationYear = ? WHERE bookId = ?";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, newYear);
            pstmt.setInt(2, bookId);
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Book updated successfully.");
            } else {
                System.out.println("No book found with the provided ID.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteAuthorAndBooks(int authorId) {
        Connection conn = null;
        PreparedStatement pstmt1 = null;
        PreparedStatement pstmt2 = null;
        String sqlDeleteBooks = "DELETE FROM Book WHERE authorId = ?";
        String sqlDeleteAuthor = "DELETE FROM Author WHERE authorId = ?";

        try {
            conn = connect();
            conn.setAutoCommit(false);

            pstmt1 = conn.prepareStatement(sqlDeleteBooks);
            pstmt1.setInt(1, authorId);
            pstmt1.executeUpdate();

            pstmt2 = conn.prepareStatement(sqlDeleteAuthor);
            pstmt2.setInt(1, authorId);
            pstmt2.executeUpdate();

            conn.commit();
            System.out.println("Author and related books deleted successfully.");
        } catch (SQLException e) {
            try {
                if (conn != null) {
                    conn.rollback();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            System.out.println(e.getMessage());
        } finally {
            try {
                if (pstmt1 != null) pstmt1.close();
                if (pstmt2 != null) pstmt2.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void listBooksByYear(int year) {
        String sql = "SELECT title FROM Book WHERE publicationYear = ? ORDER BY title ASC";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, year);
            try (ResultSet rs = pstmt.executeQuery()) {
                List<String> books = new ArrayList<>();
                while (rs.next()) {
                    books.add(rs.getString("title"));
                }
                System.out.println("Books published in " + year + ": " + String.join(", ", books));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
