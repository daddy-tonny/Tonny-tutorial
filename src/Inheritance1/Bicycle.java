package Inheritance1;

public class Bicycle {
   protected int speed;
 protected int gear;

public Bicycle( int startspeed,int startgear){
    speed= startspeed;
    gear = startgear;   
}

public int getGear() {
    return gear;
}

 public void setgear(int newValue){
    gear= newValue;
 }
public void applyBrake(int decrement){
speed -= decrement;


}
public void speedup(int increment){
speed += increment;

}

}
