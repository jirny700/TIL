package opentutorials.method;

public class MethodDemo4 {
    public static void numbering(int init, int limit) {
        int i = init;
        while (i < limit) {
            System.out.println(i);
            i++;
        }
    }

    public static void main(String[] args) {
        numbering(1, 5);
    }
}
