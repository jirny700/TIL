package opentutorials.method;

public class MethodDemo2 {
    public static void numbering(){
        int i=0;
        while(i<10){
            System.out.println(i);
            i++;
        }
    }
    public static void main(String[] args){//위에서 정의된 메소드를 5번 호출하면 출력이 쉬워짐(재활용성).유지 보수의 용이성.
        numbering();
        numbering();
        numbering();
        numbering();
        numbering();
        numbering();

    }

}
