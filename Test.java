import javax.swing.*;
class Test {

   public static void main (String args[])
   {
        Items itObj = new Items();
        String input;
        int sInt;
    while (true)
    {
       
       input = JOptionPane.showInputDialog("Enter 1 To Add Record  \n Enter 2 To Search Record \n Enter 3 To Delete Record \n Enter 4 To Modify Record \n Enter 5 To Display All Records \n Enter 6 to Exit");
       sInt = Integer.parseInt(input);
      
       
        switch (sInt) {
        
            case 1:
                   itObj.addRecord();
                   break;
                   
            case 2:
                   itObj.searchRecord();
                   break;
                   
            case 3:
                   itObj.deleteRecord();
                   break;
                   
            case 4:
            	
                itObj.modifyRecord();
                break;
                
            case 5:
                
                itObj.allRecord();
                break;
                
            case 6:
                   System.exit(0);
        }
    }//end while
   }// end of main
}// end of class