package java100.p22;

public class Exam_22 {
    public static void main(String[] args) {
        //1.변수선언
        int age = 10;

        //2.사용자입력 예외처리
        if (age > 10 && age < 20) {
            System.out.println("10이라고 연령대를 다시 입력해주세요. 프로그램을 종료합니다");
            System.exit(0);
        } else if (age > 20 && age < 30) {
            System.out.println("20이라고 연령대를 다시 입력해주세요. 프로그램을 종료합니다");
            System.exit(0);
        } else if (age > 30 && age < 40) {
            System.out.println("30이라고 연령대를 다시 입력해주세요. 프로그램을 종료합니다");
            System.exit(0);
        } else if (age > 40 && age < 50) {
            System.out.println("40이라고 연령대를 다시 입력해주세요. 프로그램을 종료합니다");
            System.exit(0);
        }  else if (age > 50 && age < 60) {
            System.out.println("50이라고 연령대를 다시 입력해주세요. 프로그램을 종료합니다");
            System.exit(0);
        } else{
            if(age<10){
                System.out.println("최소 10 이상의 수로 입력해주세요");
                System.exit(0);
            }
        }




        //3.switch 조건문
        //변수 조건은 정수형이어야 한다. byte, short, int-->그러나 long타입은 안됨. -->char타입은 가능 ex. 'a'
        //break,default 빼먹지 않도록 주의!

        switch (age) {
            case 10:
                System.out.println(age + "대 입니다. 참고서 코너는 a구역 입니다");
                break;

            case 20:
                System.out.println(age + "대 입니다. 취업서적 코너는 b구역 입니다");
                break;

            case 30:
                System.out.println(age + "대 입니다. 자기계발 코너는 c구역 입니다");
                break;

            case 40:
                System.out.println(age + "대 입니다. 재테크 서적코너는 d구역 입니다");
                break;

            case 50:
                System.out.println(age + "대 입니다. 재취업서적 코너는 e구역 입니다");
                break;

            default:
                System.out.println("60대 이상입니다. 건강코너는 f구역입니다");
                break;
        }
    }
}
