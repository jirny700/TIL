package java100.p21;

public class Exam_21 {
    public static void main(String[] args) {
        //변수선언
        int kor=80,eng=90,math=100;
        int total_score;
        total_score=kor+eng+math;

        //if조건문만 사용하기
        if (kor>=80)
            System.out.println("당신의 국어점수는 b학점입니다");

        //if~else조건문 사용하기
        if (eng>=90){
            System.out.println("영어점수는 a학점입니다");
        }else{
            System.out.println("a학점이 아닙니다");
        }

        //if~else if~else조건문 사용하기
        if(total_score>=270) {
            System.out.println("당신의 토탈점수는"+total_score+"입니다. 잘했어요");
        }
        else if(total_score>=240){
            System.out.println("당신의 점수는"+total_score+"입니다");
        }
        else if(total_score>=210) {
            System.out.println("노력하세요");
        }
        else {
            System.out.println("...더 공부하세요");
        }
        }
    }

