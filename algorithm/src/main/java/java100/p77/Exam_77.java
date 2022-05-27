package java100.p77;

abstract class Car{
    abstract void run();
}
class Ambulance extends Car {
    void run(){
        System.out.println("앰뷸런스 지나가요 삐뽀삐뽀");
    }
}
class Cultivator extends Car {
    void run(){
        System.out.println("경운기 지나기요 덜컹덜컹");
    }
}
class SportsCar extends Car {
    void run(){
        System.out.println("스포츠카 지나가요 씽");
    }
}

public class Exam_77 {
    public static void main(String[] args) {
        //[1]객체생성: 배열 길이가 3인 Car객체 배열 선언
        //[2]
        // Car[] cars = new Car[3];
        // System.out.println(cars[0]);//null-->각 배열에는 아직 null값만 존재.
        //cars = new Car[]{new Ambulance(), new Cultivator(), new SportsCar()};//cars배열 초기화

        //[3]2번 방법 말고-->자식 클래스로 객체 생성-->타입은 부모타입으로-->이렇게 생성된 객체들로 바로 배열 초기화.-->다형성
        Car[] cars = {new Ambulance(), new Cultivator(), new SportsCar()};
        
        //[4]반복문을 돌면서 각 객체의 run()메서드 호출
        for (int i = 0; i < cars.length; i++) {
            cars[i].run();
        }
        //[4]향상된 for문
        for(Car obj : cars){
            obj.run();
        }
    }
}
