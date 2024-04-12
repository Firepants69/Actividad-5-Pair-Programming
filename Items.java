import javax.swing.*;

import java.util.*;
class Items {
	
	boolean isFind;
    ArrayList<Data> items;
   
   //constructor
    public Items ( ) {
    	
        items = new ArrayList<Data>();
    }
	 
   
    public void addRecord( ) {
    	
	   String name = JOptionPane.showInputDialog("Enter name");
	   String add = JOptionPane.showInputDialog("Enter address");
       String phoneNumber = JOptionPane.showInputDialog("Enter phone no");
     
        Data person = new Data(name, add, phoneNumber);
        
        items.add(person);
   }    
   
   //method to search for an item in an arraylist
    public int searchItem( ArrayList<Data> items,String inputSearch){
        for(int i = 0;i<items.size();i++){
            if(items.get(i).name.equals(inputSearch)){
                isFind = true;
                items.get(i).print();
                return i;
            }
        }
            return -1;
    }

    public void searchRecord ()
    {
        isFind = false;

        if(items.isEmpty()==false){
            
            String inputSearch = JOptionPane.showInputDialog("Enter Name To Search ");
            searchItem(items, inputSearch);        

            if(!isFind){            	 
                JOptionPane.showMessageDialog(null, "Record Not found");
            } 
        } // end for
       
        else{ 
            JOptionPane.showMessageDialog(null, "....SOrry ther is No any record ....");
        }  
    	
    } // end searchPerson

  //Delete the specific person from the record
    
    public void deleteRecord () {
    	isFind = false;
    	if(!items.isEmpty()){
    		
    	    String inputSearch = JOptionPane.showInputDialog("Enter Name To Delete ");
         	
            items.remove(searchItem(items, inputSearch));
            
            if(!(isFind==true)){
                
            JOptionPane.showMessageDialog(null, "Record Not found");
            }
   	
        
    	}
    	else{
    		
    		JOptionPane.showMessageDialog(null, "....SOrry ther is No any record ....");
    	}
      }
    
 // TO display all the records   
    
    public void allRecord(){
    	
    	if(items.size()==0){
    		
    		JOptionPane.showMessageDialog(null, "....SOrry No record is Found....");
    	}

        {
            int index =0;
            for (var person : items)
            {
                JOptionPane.showMessageDialog(null, " Record No:"+(++index) +"\n\nName: " + person.name + "\name Address: " + person.address + "\name phone no: " + person.phoneNumber);
            }
        }
        
        }
    
   // Modify records. 
    public void modifyRecord(){
    	isFind = false;
        if(items.isEmpty()==false){
    		
    	String inputSearch = JOptionPane.showInputDialog("Enter Name To Modify ");
    	var modifyItem = items.get(searchItem(items,inputSearch));
        modifyItem.name = JOptionPane.showInputDialog("Enter new Name Last one is : " + modifyItem.name);
        modifyItem.address = JOptionPane.showInputDialog("Enter new address Last one is : "+   modifyItem.address);
        modifyItem.phoneNumber = JOptionPane.showInputDialog("Enter new phone no. last one   is : "+modifyItem.phoneNumber);
        
    	
    	if(!isFind){
    		
    		 JOptionPane.showMessageDialog(null, "Record Not found");
    	}
    	
    	}
    	else{
    		JOptionPane.showMessageDialog(null, "....SOrry ther is No any record ....");
    		
    	}
    	
        }
    
    }//end of class