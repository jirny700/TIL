package lecture220326;

public class InfiniteLoopBreak {
    public static void main(String[] args) {
        int i = 1;
        while(true){
            if(i==11) break;
            System.out.println(i);
            i++;
        }
    }
}
