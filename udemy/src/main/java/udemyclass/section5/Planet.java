package udemyclass.section5;

public class Planet {
    static void revolve(){
        System.out.println("revolve");
    }
    static Planet earth = new Planet();
    static Planet mars = new Planet();
    static Planet venus = new Planet();

    public static void main(String[] args) {
        earth.revolve();
        mars.revolve();
        venus.revolve();
    }

}
