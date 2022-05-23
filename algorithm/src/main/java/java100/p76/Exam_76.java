package java100.p76;
//추상클래스와 상속을 사용하여 다형성 예제를 만들어보시오.

abstract class Car{
    abstract void run();
}
class Ambulance extends Car{
    void run(){
        System.out.println("앰뷸런스 지나가요 삐뽀삐뽀");
    }
}
class Cultivator extends Car{
    void run(){
        System.out.println("경운기 지나기요 덜컹덜컹");
    }
}
class SportsCar extends Car{
    void run(){
        System.out.println("스포츠카 지나가요 씽");
    }
}

public class Exam_76 {
    public static void main(String[] args) {
      Car c1 =  new Ambulance();
      Car c2 = new Cultivator();
      Car c3 = new SportsCar();

      c1.run();
      c2.run();
      c3.run();
    }
}
