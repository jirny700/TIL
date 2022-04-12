package udemyclass.section8;

public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike ducati = new MotorBike(50);
        MotorBike honda = new MotorBike(50);

        ducati.start();
        honda.start();
       // ducati.speed = 100; 사용 불가함. 모터바이크 클래스의 스피드가 캡슐화(private)되어 있기 때문에.
       // honda.speed = 0;

        ducati.setSpeed(100);
        int ducatiSpeed = ducati.getSpeed(); //속도를 100씩 올리기
        //get ducati speed
        ducatiSpeed = ducatiSpeed+100;
        //increase it by 100
        ducati.setSpeed(ducatiSpeed);
        //set it to ducati
        System.out.println(ducati.getSpeed());

        honda.setSpeed(80);
        System.out.println(honda.getSpeed());

    }
}
//캡슐화의 장점
//1.잘못된 데이터의 접근을 막을 수 있다. ex. 셋스피드 메소드에 -100을 넣는 행위