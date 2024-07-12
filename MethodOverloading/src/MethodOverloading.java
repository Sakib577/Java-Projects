public class MethodOverloading {
    static int plusmethod(int x, int y){
        return x + y;
    }
    static double plusmethod(double x, double y){
        return x + y;
    }
    public static void main(String[] args) {
        System.out.println(plusmethod(5.5,6.1));
        System.out.println(plusmethod(34,36));
        System.out.println(plusmethod(21.2,2));
    }
}