package udemyclass.section4;

public class Return {
    static int sumOfThreeNumbers(int angle1,int angle2){
        int angle3=180-(angle1+angle2);
        return angle3;
    }

    public static void main(String[] args) {
        System.out.println(sumOfThreeNumbers(40,30));
    }
}
