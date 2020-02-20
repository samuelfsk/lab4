
public class Television {
    private final String MANUFACTURER;
    private final int SCREEN_SIZE ;
    private boolean powerOn;
    private int channel;
    private int volume;
    /**
     * parameterized constructor creates Television
     * @param a Manufactuerer's name
     * @param b screen size
     */
    public Television(String a, int b) {
    	MANUFACTURER="a";
    	SCREEN_SIZE= b ;
    	volume=20;
    	channel=2;
    	powerOn=false;
    	
    }
    public int getVolume() {
    	return volume;
    }
    public int getChannel() {
    	return channel;
    }
    public int getScreenSize() {
    	return SCREEN_SIZE;
    }
    public String getManufacturer(){
    	return MANUFACTURER;
    	
    }
    public void setChannel(int a) {
       channel=a;    	
    }
    public void Power() {
    	powerOn = !powerOn;
    }

}
