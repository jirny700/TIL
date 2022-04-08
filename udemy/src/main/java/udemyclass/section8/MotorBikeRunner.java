package udemyclass.section8;

public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike ducati = new MotorBike();
        MotorBike honda = new MotorBike();

        ducati.start();
        honda.start();
       // ducati.speed = 100; 사용 불가함. 모터바이크 클래스의 스피드가 캡슐화(private)되어 있기 때문에.
       // honda.speed = 0;

        ducati.setSpeed(100);
        System.out.println(ducati.getSpeed());

        honda.setSpeed(80);
        System.out.println(honda.getSpeed());

    }
}
