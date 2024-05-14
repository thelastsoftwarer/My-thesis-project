public  class oven extends heater {
    private int temperature;
    private final int minTemperature = 0;
    private final int maxTemperature = 300;
    private boolean isOpen = false;
    private int fanSpeed; 
    private boolean automaticMode; 
    private int timer; 

    public boolean open() {
        if (!isOpen) {
            System.out.println("Oven opened.");
            isOpen = true;
            return true;
        } else {
            System.out.println("Oven is already open.");
            return false;
        }
    }

    public boolean close() {
        if (isOpen) {
            System.out.println("Oven closed.");
            this.isOpen = false;
            return true;
        } else {
            System.out.println("Oven is already closed.");
            return false;
        }
    }

    public void setTemperature(int degree) {
        if (degree >= this.minTemperature && degree <= this.maxTemperature) {
            temperature = degree;
            System.out.println("Oven temperature set to " + temperature + " degrees.");
        } else {
            System.out.println("Temperature must be between " + minTemperature + " and " + maxTemperature + " degrees.");
        }
    }

    public void increaseTemperature() {
        if (this.temperature < this.maxTemperature) {
            this.temperature=+10;
            System.out.println("Temperature increased to " + this.temperature + " degrees.");
        } else {
            System.out.println("Maximum temperature reached.");
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


    public void decreaseTemperature() {
        if (this.temperature > this.minTemperature) {
            this.temperature=-10;
            System.out.println("Temperature decreased to " + this.temperature + " degrees.");
        } else {
            System.out.println("Minimum temperature reached.");
        }
    }

    public void setFanSpeed(int speed) {
        this.fanSpeed = speed;
        System.out.println("Fan speed set to " + this.fanSpeed);
    }
    public void setFanSpeed(int speed, boolean turboMode) {
        if (turboMode) {
            this.fanSpeed = speed * 2; 
            System.out.println("Fan speed set to turbo level " + this.fanSpeed + ".");
        } else {
            this.fanSpeed = speed;
            System.out.println("Fan speed set to level " + this.fanSpeed + ".");
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
    public double cost(int hours) {
        return hours * 2; 
    }

    public void decreaseFanSpeed() {
        if (this.fanSpeed > 0) {
            this.fanSpeed--;
            System.out.println("Fan speed decreased to level " + this.fanSpeed + ".");
        } else {
            System.out.println("Minimum fan speed reached.");
        }
    }

    public void setAutomaticMode(boolean mode) {
        automaticMode = mode;
        System.out.println("Automatic mode " + (automaticMode ? "enabled." : "disabled."));
    }

    public void setTimer(int minutes) {
        this.timer = minutes;
        System.out.println("Timer set to " + this.timer + " minutes.");
    }
    public String type() {
        return "Big";
    }
    public String name() {
    	return 	"Oven";
    	
    }
    public void setTemperaturemin() {
        this.temperature = this.minTemperature;
        System.out.println("Oven temperature set to minimum temperature: " + this.minTemperature + " degrees.");
    }

    public void setTemperaturemax() {
        this.temperature = this.maxTemperature;
        System.out.println("Oven temperature set to m temperature: " + this.maxTemperature + " degrees.");
    }
}
