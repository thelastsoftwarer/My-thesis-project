public class lightbulb extends lamp {
    private boolean isOpen = false;

    public boolean open() {
        if (!isOpen) {
            System.out.println("Lightbulb opened.");
            isOpen = true;
            return true;
        } else {
            System.out.println("Lightbulb is already open.");
            return false;
        }
    }

    public boolean close() {
        if (isOpen) {
            System.out.println("Lightbulb closed.");
            isOpen = false;
            return true;
        } else {
            System.out.println("Lightbulb is already closed.");
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

    public String type() {
    	return "Small Lighter";
    }
    public String name() {
    	return "Lightbulb";
    }
}
