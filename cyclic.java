
public abstract class cyclic extends WhiteDevices {
	public int hours=0;
	public int setcyclicperminute;
	   public void setcyclicperminute() {
	        this.setcyclicperminute=1200;
	        System.out.println("yclic number set to 1200 : ");
	    } 
	 public  abstract String name();
	    public  double cost(int b) {
	    	return 10*hours;
	    }
		public String type() {
			return "big";
		}
		
}
