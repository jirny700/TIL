package java100.p17;

import org.w3c.dom.ls.LSOutput;

public class Exam_17_1 {
    public static void main(String[] args) {

        //정수선언
        int a = 12345;
        String str = "12345";
        System.out.println(str.length()); //5 //문자열의 자릿수는 length를 통해 출력함
        //System.out.println(a.length());//에러남.

        //정수->문자열로 변환->자릿수 구하기
        String stra = String.valueOf(a);
        System.out.println(stra.length());//5

        //문자열+정수형=?
        System.out.println(12345+1);//12346
        System.out.println(str+1);//123451

        //문자열->정수로변환
        int b=Integer.valueOf(str);
        System.out.println(b+1);//12346
    }
}