package java100.p79;
//정수로 이루어진 배열에서 가장 큰 값을 구하는 최댓값 알고리즘을 구현해보시오
//->배열내 정수값에서 최댓값을 구하기

public class Exam_79 {
    public static void main(String[] args) {
        //[1]배열선언
        int[] ar = {4, 13, 150, 17, -2};

        //[2]참고. max.min.함수
        System.out.println(Math.max(4,10));//10
        System.out.println(Math.min(3,1));//1

        //[3]일단 배열내 첫번째 원소의 값이 제일 크다고 가정하고 초기화
        //int max = Integer.MIN_VALUE;
        int max = ar[0];

        //[4]반복문 돌면서 비교하여 출력-->이떄, 비교는 2번쨰부터 비교하면 되니 int i=1로 시작.
        System.out.println("현재 배열 내 가장 큰 값은 : "+max);
        for (int i = 1; i < ar.length; i++) {
            if (max < ar[i]) {
                max = ar[i];
            }
        }
        System.out.println("현재 배열 내 가장 큰 값은 : " +max);
    }
}

