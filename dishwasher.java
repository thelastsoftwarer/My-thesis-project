
public class dishwasher extends cyclic {
    private String mode = "Normal"; 
    private int setcyclicperminute;
    private boolean isOpen = false; 
    private boolean automaticMode; 
    private int timer;
    public boolean open() {
        if (!isOpen) {
            System.out.println("Dishwasher opened.");
            isOpen = true;
            return true;
        } else {
            System.out.println("Dishwasher is already open.");
            return false;
        }
    }
    
    public boolean isAutomaticMode() {
        return this.automaticMode;
    }
    public double cost() {
        return hours * 2; 
    }
    public void setAutomaticMode(boolean mode) {
        this.automaticMode = mode;
        System.out.println("Automatic mode " + (this.automaticMode ? "enabled." : "disabled."));
        this.setcyclicperminute=1200;
    }
    public void setMode(String mode) {
        this.mode = mode;
        if (mode.equals("l")) {
            System.out.println("Long mode activated. Cyclic set to 1400.");
            this.setcyclicperminute=1400;
        } else if (mode.equalsIgnoreCase("n")) {
            System.out.println("Normal mode activated. Cyclic set to 1200.");
            this.setcyclicperminute = 1200;
        }
        else if (mode.equalsIgnoreCase("s")) {
            System.out.println("Short mode activated. Cyclic set to 1000.");
            this.setcyclicperminute = 1000;
        }
        	else {
            System.out.println("Normal mode activated.");
            this.setcyclicperminute=1200;

        }
    }
    public boolean close() {
        if (isOpen) {
            System.out.println("Dishwasher closed.");
            isOpen = false;
            return true;
        } else {
            System.out.println("Dishwasher is already closed.");
            return false;
        }
    }
    public void setTimer(int minutes) {
        this.timer = minutes;
        System.out.println("Timer set to " + this.timer + " minutes.");
    }
    public void setcyclicperminutemax() {
        this.setcyclicperminute=2000;
        System.out.println("Dishwasher cyclic number set to 2000 : ");
    } 
    
    public void setcyclicperminute() {
        this.setcyclicperminute=800;
        System.out.println("Dishwasher cyclic number set to 800 : ");
    }
    public void getcyclicperminutemin() {
        System.out.println("Dishwasher cyclic number: "+ this.setcyclicperminute);
    }
    public String name() {
        return "Dishwasher";
    }
    public String getmode() {
        return this.mode;
    }
    public String type(String b) {
        return "Big";
    }
    public void getTimer() {
        System.out.println("Timer set to " + this.timer + " minutes.");
    }
}
