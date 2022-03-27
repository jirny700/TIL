package lecture220326;

public class DoWhile {
    public static void main(String[] args) {
        int i=1;
        do{
            System.out.println(i);
            i++;
        }while(i<1);
    }
}
//do / while 사용법: do/ while 문은 탈출 조건식 이 false를 반환할 때 do / while문을 종료하게 된다
//변수의 초기화
//do {
//탈출 조건식이 참일 경우 실행되는 코드;
//변수의 증감식;
//}while (탈출 조건식);