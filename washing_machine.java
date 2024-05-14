
public class washing_machine extends cyclic {
	  private String mode = "Normal"; 
	    private int setcyclicperminute;
	    private int temperature;
	    private boolean isOpen = false; 
	    private boolean automaticMode; 
	    private int timer;
	    public boolean open() {
	        if (!isOpen) {
	            System.out.println("Washing Machine opened.");
	            isOpen = true;
	            return true;
	        } else {
	            System.out.println("Washing machine cyclic is already open.");
	            return false;
	        }
	    }
	    
	    public boolean isAutomaticMode() {
	        return this.automaticMode;
	    }
	    public double cost() {
	        return hours * 2 * (1+this.temperature*0.1); 
	    }
	    public void setAutomaticMode(boolean mode) {
	        this.automaticMode = mode;
	        System.out.println("Automatic mode " + (this.automaticMode ? "enabled." : "disabled."));
	        this.setcyclicperminute=1200;
	        this.temperature=70;
	    }
	    public void setMode(String mode) {
	        this.mode = mode;
	        if (mode.equals("c")) {
	            System.out.println("Cotton mode activated. Cyclic set to 1400.");
	            this.setcyclicperminute=1400;
		        this.temperature=70;

	        } else if (mode.equalsIgnoreCase("w")) {
	            System.out.println("Wooly mode activated. Cyclic set to 1800.");
		        this.temperature=90;
	        }
	        else if (mode.equalsIgnoreCase("s")) {
	            System.out.println("Simple mode activated. Cyclic set to 1000.");
		        this.temperature=50;
	        }
	        	else {
	            System.out.println("Normal mode activated.");
	            this.setcyclicperminute=12;

	        }
	    }
	    public boolean close() {
	        if (isOpen) {
	            System.out.println("Washing machine cyclic closed.");
	            isOpen = false;
	            return true;
	        } else {
	            System.out.println("Washing machine cyclic is already closed.");
	            return false;
	        }
	    }
	    public void setTimer(int minutes) {
	        this.timer = minutes;
	        System.out.println("Timer set to " + this.timer + " minutes.");
	    }
	    public void setcyclicperminutemax() {
	        this.setcyclicperminute=2200;
	        System.out.println("Washing machine cyclic number set to 2000 : ");
	    } 
	    
	    public void setcyclicperminute() {
	        this.setcyclicperminute=900;
	        System.out.println("Washing machine  number set to 800 : ");
	    }
	    public void getcyclicperminutemin() {
	        System.out.println("Washing machine cyclic number: "+ this.setcyclicperminute);
	    }
	    public String name() {
	        return "Washing Machine";
	    }
	    public String getmode() {
	        return this.mode;
	    }
	    public String type(String b) {
	        return "Big";
	    }
	    public int getTemperature() {
	    	return this.temperature;
	    }
	    public void getTimer() {
	        System.out.println("Timer set to " + this.timer + " minutes.");
	    }
	}

