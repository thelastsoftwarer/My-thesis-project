public class Refrigerator extends Cooler {

   
    private String mode = "Normal"; 
    private int temperature;
    private final int minTemperature = 0;
    private final int maxTemperature = 32;
    private boolean isOpen = false;
    private int fanSpeed; 
    private boolean automaticMode; 
    private int timer; 

    public Refrigerator(String a) {
    this.mode=a;   
    }
    public Refrigerator( ) {
        }

    public double cost() {
        return hours * 2; 
    }


    public void setTemperature(int degree) {
        if (degree >= this.minTemperature && degree <= this.maxTemperature) {
            this.temperature = degree;
            System.out.println("Refrigerator set to " + this.temperature + " degrees.");
        } else {
            System.out.println("Temperature must be between " + this.minTemperature + " and " + this.maxTemperature + " degrees.");
        }
    }
 public void setTemperaturemin() {
        this.temperature = this.minTemperature;
        System.out.println("Refrigerator temperature set to minimum temperature: " + this.minTemperature + " degrees.");
    }

    public void setTemperaturemax() {
        this.temperature = this.maxTemperature;
        System.out.println("Refrigerator temperature set to m temperature: " + this.maxTemperature + " degrees.");
    }

    public void setFanSpeed(int speed) {
        this.fanSpeed = speed;
        System.out.println("Fan speed set to " + fanSpeed);
    }

    public void setAutomaticMode(boolean mode) {
        this.automaticMode = mode;
        System.out.println("Automatic mode " + (this.automaticMode ? "enabled." : "disabled."));
    }

    public void setTimer(int minutes) {
        this.timer = minutes;
        System.out.println("Timer set to " + this.timer + " minutes.");
    }
    public void increaseTemperature() {
        if (this.temperature < this.maxTemperature) {
            this.temperature++;
            System.out.println("Temperature increased to " + this.temperature + " degrees.");
        } else {
            System.out.println("Maximum temperature reached.");
        }
    }

    public void decreaseTemperature() {
        if (this.temperature > minTemperature) {
            this.temperature--;
            System.out.println("Temperature decreased to " + this.temperature + " degrees.");
        } else {
            System.out.println("Minimum temperature reached.");
        }
    }
    public void increaseFanSpeed() {
        if (this.fanSpeed < 3) {
            this.fanSpeed++;
            System.out.println("Fan speed increased to level " + this.fanSpeed + ".");
        } else {
            System.out.println("Maximum fan speed reached.");
        }
    }

    public void decreaseFanSpeed() {
        if (fanSpeed > 0) {
            fanSpeed--;
            System.out.println("Fan speed decreased to level " + this.fanSpeed + ".");
        } else {
            System.out.println("Minimum fan speed reached.");
        }
    }
  
    public int getTemperature() {
        return this.temperature;
    }

    public int getMinTemperature() {
        return this.minTemperature;
    }

    public int getMaxTemperature() {
        return this.maxTemperature;
    }

    public int getFanSpeed() {
        return this.fanSpeed;
    }

    public boolean isAutomaticMode() {
        return this.automaticMode;
    }

    public int getTimer() {
        return this.timer;
    }

    public boolean open() {
        if (!isOpen) {
            System.out.println("Refrigerator opened.");
            isOpen = true;
            return true;
        } else {
            System.out.println("Refrigerator is already open.");
            return false;
        }
    }

    public boolean close() {
        if (isOpen) {
            System.out.println("Refrigerator closed.");
            isOpen = false;
            return true;
        } else {
            System.out.println("Refrigerator is already closed.");
            return false;
        }
    }

    public void setMode(String mode) {
        this.mode = mode;
        if (mode.equals("v")) {
            System.out.println("Vegetable mode activated. Temperature set to 10°C.");
            this.temperature=10;
        } else if (mode.equals("m")) {
            System.out.println("Meat mode activated. Temperature set to 4°C.");
            this.temperature=4;

        } else if (mode.equals("d")) {
            System.out.println("Drinks mode activated. Temperature set to 6°C.");
            this.temperature=6;

        } else {
            System.out.println("Normal mode activated.");
            this.temperature=12;

        }
    }
    public void setFanSpeed() {
        this.fanSpeed = 1;
        System.out.println("Fan speed set to default level " + this.fanSpeed + ".");
    }

    public String type(String b) {
        return "Big";
    }

    public String name() {
        return "Refrigerator";
    }
    public String getmode() {
        return this.mode;
    }
}
