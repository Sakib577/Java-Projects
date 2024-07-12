public class IfElseMethods {
    static void checkage(int age){
        if (age>18){
            System.out.println("Access granted. You're old enough.");
        } else {
            System.out.println("Access denied. You're not old enough.");
        }
    }
    public static void main(String[] args) {
        checkage(22);
    }
}