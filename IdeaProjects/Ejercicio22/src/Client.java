public class Client {

    String name;
    String address;
    String phone;

    Client(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String modifyName(String newName) {
        this.name = newName;
        return name;
    }

    public String modifyAddress(String spot) {
        this.address = spot;
        return address;
    }

    public String modifyPhone(String number) {
        this.phone = number;
        return phone;
    }

    public void showData(){
        System.out.println(name);
        System.out.println(address);
        System.out.println(phone);

    }
}
