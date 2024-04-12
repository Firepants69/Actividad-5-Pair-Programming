import javax.swing.*;

class Data {
        String n;
        String a;
        String pNum;
//parameterized constructor
    public Data(String n, String a, String p) {
    	
         this.n = n;
		 this.a = a;
		 this.pNum = p;
       }
    
//method for displaying person record on GUI 
    
    public void print( ) {
          JOptionPane.showMessageDialog(null, "Name: " + n + "\n Address: " +a + "\n phone no: " + pNum);
    }
   
}