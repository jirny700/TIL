package java100.p40;
//사용자 입력을 받아 2차원 배열을 생성하고 값을 입력하는 코드를 구현하시오.
//이때, 중첩 반복문을 사용하여 출력도 같이 해보시오.
import java.util.Scanner;

public class Exam_40 {
    public static void main(String[] args) {
        //[1]사용자 입력을 위한 객체 선언
        Scanner sc=new Scanner(System.in);

        //[2]2차원 배열의 행과 열 선언-->사용자 입력으로 처리
        System.out.print("행의 갯수를 입력하고 enter치세요=");
        int R = sc.nextInt();
        System.out.print("열의 갯수를 입력하고 enter치세요=");
        int C = sc.nextInt();

        //[3]char 2차원 배열 선언-->사용자로부터 R,C를 입력받아-->gameMap[R][C]생성.
        char[][] gameMap = new char[R][C];
        //[4]사용자 입력을 받아서 저장할 String 배열 선언->이때, 크기를 R로 해주도록 한다.
        //이유? 어차피 사용자가 입력하는 값은 안쪽 for문을 돌면서 2차원 배열에 입력하기 때문이다.
        String[] strAr = new String[R];

        //[5]2차원 배열 요소-->사용자가 입력하는 값으로 세팅
        for (int i = 0; i < R; i++) {
            System.out.print((i+1)+"번쨰 행에 입력할 문자 3개를 차례대로 입력하고 enter치세요.=");
            strAr[i] = sc.next();
            for (int j = 0; j < C; j++) {
                gameMap[i][j]=strAr[i].charAt(j);//j인덱스에 있는 값을 하나씩 가져와서 gameMap좌표에 셋팅
            }
        }
        //[6]2차원 배열에 들어있는 값 출력하기
        System.out.println(strAr);//참조값출력
        System.out.println(strAr[0]);//kor
        System.out.println(strAr[1]);//usa

        for (int i = 0; i < R ; i++) {
            for (int j = 0; j < C; j++) {
                System.out.println(gameMap[i][j]);
            }
        }
    }
}
