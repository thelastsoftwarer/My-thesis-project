
public abstract class lamp extends Lighting {
	   public int hours=0;
	   protected int brightness=2;
	   protected int minbrightness=1;
	   protected int maxbrightness=5;
	    public abstract  String name();
	    public double cost() {
	        double costPerHour;
	        if (brightness == 1) {
	            costPerHour = 1;
	        } else if (brightness == 2) {
	            costPerHour = 2.0;
	        } else {
	            costPerHour = 4;
	        }
	        return (int) (hours * costPerHour); 
	    }
	    public void setBrightnessmin() {
			  brightness=minbrightness;
		        System.out.println("Fluorescent Lamp set to minimum brightness: " + minbrightness + " level.");
		    }		
		   public void setBrightnessmax() {
				  brightness=maxbrightness;
		        System.out.println("Fluorescent Lamp set to maximum brightness: " + maxbrightness + " level.");
		    }		
		   public void setBrightness(int b) {
				  brightness=b;
		        System.out.println("Fluorescent Lamp set to brightness: " + maxbrightness + " level.");
		    }	
		   public void setBrightness() {
				  brightness=2;
		        System.out.println("Fluorescent Lamp set to maximum brightness: " + brightness + " level.");
		    }		
}
