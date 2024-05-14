
public class Fluorescent_Lamp extends lamp {
	
		
	   private boolean isOpen = false;
	    public boolean open() {
	        if (!isOpen) {
	            System.out.println("Fluorescent Lamp opened.");
	            isOpen = true;
	            return true;
	        } else {
	            System.out.println("Fluorescent Lamp already open.");
	            return false;
	        }
	    }
	    public boolean close() {
	        if (isOpen) {
	            System.out.println("Fluorescent Lamp closed.");
	            isOpen = false;
	            return true;
	        } else {
	            System.out.println("Fluorescent Lamp is already closed.");
	            return false;
	        }
	    }
	   
	   public double cost(int b){ 
		   if (b==0)
		   return 0 ;
		   else {
			   return cost();
		   }
	   }
	    
	   public String name() {  
	        return "White Fluorescent Lamp";    
	   } 
	   
	  
	   public String type()
	    {
			return "Long type";
		}
	

}
