package udemyclass.section8;

public class MotorBike {

    MotorBike(int speed){
        this.speed=speed;
    }

    private int speed;
    void setSpeed(int speed){
        if(speed > 0)
        this.speed = speed;
    }
    int getSpeed(){
        return this.speed;
    }
    void start(){

        System.out.println("bike start!!");
    }
    public void increaseSpeed(int howMuch){
        setSpeed(this.speed + howMuch);
    }
    public void decreaseSpeed(int howMuch){
        setSpeed(this.speed - howMuch);
    }
}

