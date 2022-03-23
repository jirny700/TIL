package opentutorials.method;

public class MethodDemo1 {
    public static void numbering(){
        //numbering 메소드의 정의,메소드 이름() 뒤에 중괄호{}가 나오면 정의

        int i=0;
        while(i<10){
            System.out.println(i);
            i++;
        }
    } public static void main(String[] args){
        //numbering 메소드의 호출, 메소드 이름()뒤에 아무것도 없으면 호출
        numbering();
    }
}

