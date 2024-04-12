import javax.swing.*;

import java.util.*;
class Items {
	
	 boolean t1 , t2,t3;
   ArrayList<Data> items;
   
   //constructor
    public Items ( ) {
    	
        items = new ArrayList<Data>();
    }
	 
   
    public void addRecord( ) {
    	
	   String n = JOptionPane.showInputDialog("Enter name");
	   String add = JOptionPane.showInputDialog("Enter address");
       String pNum = JOptionPane.showInputDialog("Enter phone no");
     
        Data p = new Data(n, add, pNum);
   
         items.add(p);
   }
   
   
    public void searchRecord ()
    {
     if(items.isEmpty()==false){
    	 
    	String var = JOptionPane.showInputDialog("Enter Name To Search ");
    	 
       for (int i=0; i< items.size(); i++) 
       {
    	   
         Data p = (Data)items.get(i);
             if ( var.equals(p.n) ) 
             { 
            	     t1=true;
            	 
                      p.print();         
                }  
           
      } // end for
       
          if(!(t1==true)){
            	 
            	 JOptionPane.showMessageDialog(null, "Record Not found");
          }  
          
     }
          else{
        	  	
          		JOptionPane.showMessageDialog(null, "....SOrry ther is No any record ....");
          }
          
          
    	
    } // end searchPerson

  //Delete the specific person from the record
    
    public void deleteRecord () {
    	
    	if(!(items.isEmpty())){
    		
    	String var = JOptionPane.showInputDialog("Enter Name To Delete ");
         	
        for (int i=0; i< items.size(); i++)
        {
            Data p = (Data)items.get(i);
            
                if ( var.equals(p.n) )
                {
                	t3=true;
                    items.remove(i);
                    JOptionPane.showInputDialog("Record is Deleted ");
                }
            }
        if(!(t3==true)){
    		
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
    	
       for (int i=0; i< items.size(); i++)
         {
             Data p = (Data)items.get(i);
             
             JOptionPane.showMessageDialog(null, " Record No:"+(i+1) +"\n\nName: " + p.n + "\n Address: " + p.a + "\n phone no: " + p.pNum);
                 
             }
         }
    
   // Modify records. 
    public void modifyRecord(){
    	if(items.isEmpty()==false){
    		
    	String var = JOptionPane.showInputDialog("Enter Name To Modify ");
    	for (int i=0; i< items.size(); i++)
        {
            Data p = (Data)items.get(i);
            
                if ( var.equals(p.n) )
                {
                	 t2=true;
                	 p.print();
                	
                    items.remove(i);
                    
                    String name = JOptionPane.showInputDialog("Enter new Name Last one is : " + p.n);
             	     String add = JOptionPane.showInputDialog("Enter new address Last one is : "+p.a);
                    String pNum = JOptionPane.showInputDialog("Enter new phone no. last one is : "+p.pNum);
                  
                     Data p1 = new Data(name, add, pNum);
                     items.add(p1);
                     p1.print();
                }
            }
    	
    	if(!(t2==true)){
    		
    		 JOptionPane.showMessageDialog(null, "Record Not found");
    	}
    	
    	}
    	else{
    		JOptionPane.showMessageDialog(null, "....SOrry ther is No any record ....");
    		
    	}
    	
        }
    
    }//end of class