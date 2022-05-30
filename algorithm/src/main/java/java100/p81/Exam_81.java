package java100.p81;
//랜덤숫자생서과 최댓값, 최솟값 알고리즘을 다 같이 사용하기

public class Exam_81 {
    public static void main(String[] args) {

        //[1]정수배열 선언
        int[] ar = new int[10];

        //[2]반복문을 돌면서 랜덤으로 10개 정수 값을 세팅->Math.random()
        for (int i = 0; i < ar.length; i++) {
            ar[i] = (int)(Math.random()*10);//무작위로 숫자 더블타입을 반환
            System.out.print(ar[i]);
        }
        //[3]최댓값 최솟값의 초기화
        int max = ar[0], min = ar[0];


        //[4]반복문을 돌면서 비교
        for (int i = 0; i < ar.length; i++) {
            if(max<ar[i]){
                max = ar[i];
            }
        }

        for (int i = 0; i < ar.length; i++) {
            if(min>ar[i]){
                min = ar[i];
            }
        }

        //[5]출력
        System.out.println("---------------------");
        System.out.println("ar배열내의 최솟값 : "+ min);
        System.out.println("ar배열내의 최댓값 : "+ max);
    }
}
