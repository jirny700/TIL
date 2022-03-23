package opentutorials.method;

public class MethodDemo3 {

        public static void numbering(int limit) {
            //메소드 정의시, 데이터타입과 변수 정의(매개변수,파라미터). 호출의 괄호안의 5가 변수로 들어옴.
            int i = 0;
            while (i < limit) {
                System.out.println(i);
                i++;
            }
        }

        public static void main(String[] args) {
            numbering(5);//인자,아규먼트
        }
    }

