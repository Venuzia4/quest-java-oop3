public class Eagle extends Bird  implements Fly{

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = true;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }


    @Override
    public void takeOff(){

            System.out.printf(this.getName() +" take off the sky");

        
    }

    
    /* (non-Javadoc)
     * @see Fly#ascend(int)
     */
   

    @Override
    public int  ascend(int meters){
        if(isFlying()){
        this.altitude = Math.max(this.altitude - meters, 0);
        System.out.printf("%s flies upward, altitude: %d%n", this.getName(), this.altitude);
    }
    return this.altitude;
}
  

    @Override
    public   int descend(int meters){
        if (this.flying) {
            this.altitude = Math.min(this.altitude + meters, 325);
            System.out.printf("%s flies upward, altitude: %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }
    

    @Override
    public void glide(){

        System.out.println("glides into the air.");
        

    }

    @Override
    public void land() {

        System.out.println(this.getName()+" lands on the grounds");
        
    }


    





}
