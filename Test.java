import javax.swing.*;

class Test {

    public static void main(String args[]) {
        Items itemList = new Items();
        String input;
        int option;
        while (true) {

            input = JOptionPane.showInputDialog(
                    null,
                    "Enter 1 To Add Record" +
                            "\n Enter 2 To Search Record " +
                            "\n Enter 3 To Delete Record " +
                            "\n Enter 4 To Modify Record " +
                            "\n Enter 5 To Display All Records" +
                            "\n Enter 6 to Exit",
                    "Actividad 5 Pair Programming",
                    JOptionPane.QUESTION_MESSAGE);
            try {
                option = Integer.parseInt(input);
                if (option <= 0 || option > 6) {
                    throw new Exception("");
                }
                switch (option) {

                    case 1:
                        itemList.addRecord();
                        break;

                    case 2:
                        itemList.searchRecord();
                        break;

                    case 3:
                        itemList.deleteRecord();
                        break;

                    case 4:

                        itemList.modifyRecord();
                        break;

                    case 5:

                        itemList.allRecord();
                        break;

                    case 6:
                        System.exit(0);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Enter a valid option [1,2,3,4,5,6]");
            }

        } // end while
    }// end of main
}// end of class