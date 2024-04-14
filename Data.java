import javax.swing.*;

class Data {
    String name;
    String address;
    String phoneNumber;

    // parameterized constructor
    public Data(String name, String address, String phoneNumber) {

        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // method for displaying person record on GUI

    public void print() {
        JOptionPane.showMessageDialog(null,
                "Name: " + name + "\name Address: " + address + "\name phoneNumber no: " + phoneNumber);
    }

}