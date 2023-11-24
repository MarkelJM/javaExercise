import java.util.*;

public class Student {
    String name;
    String id;
    Set<Asignatura> setAsignatura = new HashSet<Asignatura>();

    Student(String name, String id){
        this.name = name;
        this.id = id;
    }

    public void addAsignatura(Asignatura subject){
        setAsignatura.add(subject);
    }
    public void removeAsignatura(Asignatura subject){
        setAsignatura.remove(subject);
    }
    public void showAsignatura(){
        for(Asignatura subject: setAsignatura){
            subject.showSubjectName();

        }
    }
}
