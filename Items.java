import javax.swing.*;

import java.util.*;

class Items {

    ArrayList<Data> items;

    // constructor
    public Items() {

        items = new ArrayList<Data>();
    }

    public void addRecord() {

        String name = JOptionPane.showInputDialog("Enter name");
        String add = JOptionPane.showInputDialog("Enter address");
        String phoneNumber = JOptionPane.showInputDialog("Enter phone no");

        Data person = new Data(name, add, phoneNumber);

        items.add(person);
    }

    // method to search for an item in an arraylist
    public ArrayList<Data> searchItem(String inputSearch) {
        ArrayList<Data> newItems = new ArrayList<Data>();
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).name.equals(inputSearch)) {
                newItems.add(items.get(i));
            }
        }
        if (newItems.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Record Not found");
            return newItems;
        }
        return newItems;
    }

    public void searchRecord() {

        if (items.isEmpty() == false) {

            var items = searchItem(JOptionPane.showInputDialog("Enter Name To Search "));
            for (Data item : items) {
                item.print();
            }
        } // end for

        else {
            JOptionPane.showMessageDialog(null, "....SOrry ther is No any record ....");
        }

    } // end searchPerson

    // Delete the specific person from the record

    public void deleteRecord() {
        if (!items.isEmpty()) {
            var dataToDelete = searchItem(JOptionPane.showInputDialog("Enter Name To Delete "));

            for (Data person : dataToDelete) {
                int option = JOptionPane.showConfirmDialog(null,
                        "Name: " + person.name + "\n" +
                                "name Address:" + person.address + "\n" +
                                "name phone no:" + person.phoneNumber,
                        "delete this element?",
                        JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    items.remove(person);
                }
            }

        } else {

            JOptionPane.showMessageDialog(null, "....SOrry ther is No any record ....");
        }
    }

    // TO display all the records

    public void allRecord() {

        if (items.size() == 0) {

            JOptionPane.showMessageDialog(null, "....SOrry No record is Found....");
        }

        {
            int index = 0;
            for (var person : items) {
                JOptionPane.showMessageDialog(null, " Record No:" + (++index) + "\n\nName: " + person.name
                        + "\name Address: " + person.address + "\name phone no: " + person.phoneNumber);
            }
        }

    }

    // Modify records.
    public void modifyRecord() {
        if (items.isEmpty() == false) {

            var modifyItems = searchItem(JOptionPane.showInputDialog("Enter Name To Modify "));

            for (Data modifyItem : modifyItems) {
                int option = JOptionPane.showConfirmDialog(null,
                        "Name: " + modifyItem.name + "\n" +
                                "name Address:" + modifyItem.address + "\n" +
                                "name phone no:" + modifyItem.phoneNumber,
                        "edit this element?",
                        JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    modifyItem.name = JOptionPane.showInputDialog("Enter new Name Last one is : " + modifyItem.name);
                    modifyItem.address = JOptionPane
                            .showInputDialog("Enter new address Last one is : " + modifyItem.address);
                    modifyItem.phoneNumber = JOptionPane
                            .showInputDialog("Enter new phone no. last one   is : " + modifyItem.phoneNumber);

                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "....SOrry ther is No any record ....");

        }

    }

}// end of class
