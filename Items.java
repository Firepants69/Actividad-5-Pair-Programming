import javax.swing.*;

import java.util.*;

class Items {

    private ArrayList<Data> items;

    // constructor
    public Items() {

        items = new ArrayList<Data>();
    }

    public void addRecord() {

        String name = JOptionPane.showInputDialog("Enter name");
        String add = JOptionPane.showInputDialog("Enter address");
        String phoneNumber = JOptionPane.showInputDialog("Enter phone no");

        Data itemToAdd = new Data(name, add, phoneNumber);

        items.add(itemToAdd);
    }

    // method to search for an item in an arraylist
    private ArrayList<Data> filterByName(String inputSearch) {
        ArrayList<Data> foundItems = new ArrayList<Data>();
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).name.equals(inputSearch)) {
                foundItems.add(items.get(i));
            }
        }
        if (foundItems.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Record Not found");
            return foundItems;
        }
        return foundItems;
    }

    public void searchRecord() {

        if (items.isEmpty() == false) {

            ArrayList<Data> itemsToShow = filterByName(JOptionPane.showInputDialog("Enter Name To Search "));
            for (Data item : itemsToShow) {
                item.print();
            }
        } // end for

        else {
            JOptionPane.showMessageDialog(null, "....Sorry there is No any record ....");
        }

    } // end searchPerson

    // Delete the specific itemToAdd from the record

    public void deleteRecord() {
        if (!items.isEmpty()) {
            ArrayList<Data> itemsToDelete = filterByName(JOptionPane.showInputDialog("Enter Name To Delete "));

            for (Data itemToDelete : itemsToDelete) {
                int option = JOptionPane.showConfirmDialog(null,
                        "Name: " + itemToDelete.name + "\n" +
                                "name Address:" + itemToDelete.address + "\n" +
                                "name phone no:" + itemToDelete.phoneNumber,
                        "delete this element?",
                        JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    items.remove(itemToDelete);
                }
            }

        } else {

            JOptionPane.showMessageDialog(null, "....Sorry there is No any record ....");
        }
    }

    // TO display all the records

    public void allRecord() {

        if (items.size() == 0) {

            JOptionPane.showMessageDialog(null, "....Sorry No record is Found....");
        }

        {
            int index = 0;
            for (Data itemToAdd : items) {
                JOptionPane.showMessageDialog(null, " Record No:" + (++index) + "\n\nName: " + itemToAdd.name
                        + "\nName Address: " + itemToAdd.address + "\nName phone no: " + itemToAdd.phoneNumber);
            }
        }

    }

    // Modify records.
    public void modifyRecord() {
        if (items.isEmpty() == false) {

            ArrayList<Data> itemsToModify = filterByName(JOptionPane.showInputDialog("Enter Name To Modify "));

            for (Data itemToModify : itemsToModify) {
                int option = JOptionPane.showConfirmDialog(null,
                        "Name: " + itemToModify.name + "\n" +
                                "name Address:" + itemToModify.address + "\n" +
                                "name phone no:" + itemToModify.phoneNumber,
                        "edit this element?",
                        JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    itemToModify.name = JOptionPane
                            .showInputDialog("Enter new Name Last one is : " + itemToModify.name);
                    itemToModify.address = JOptionPane
                            .showInputDialog("Enter new address Last one is : " + itemToModify.address);
                    itemToModify.phoneNumber = JOptionPane
                            .showInputDialog("Enter new phone no. last one   is : " + itemToModify.phoneNumber);

                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "....Sorry there is No any record ....");

        }

    }

}// end of class
