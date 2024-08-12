package Inheritance1;

public class MountainBike extends Bicycle{
    public int seatheight;

    public MountainBike( int startseatheight, int startspeed,int startgear )
    {

        super(startspeed,startgear);
seatheight=startseatheight;

    }

   public void setseatheight(int newseatvalue){ 
   seatheight = newseatvalue;
} 
}
