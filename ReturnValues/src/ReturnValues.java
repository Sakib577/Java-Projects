public class ReturnValues {
    static int mymethod(int x, int y){

        return x + 5 + y;
    }
    public static void main(String[] args) {
        System.out.println(mymethod(3, 5));
        int z=mymethod(32,5);
        System.out.println(z);

    }
}