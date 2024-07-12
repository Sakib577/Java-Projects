public class Drawing {
    public static void main(String[] args) {
        System.out.println("   /|");
        System.out.println("  / |");
        System.out.println(" /  |\n/___|");
        /*This show us how java's println method executes every line of code differently one after another 
        without using \n for new line. But we can use \n for new line in the println method.*/

        /*Added later... println function automatically adds a new line after every code. but if we want it to  work like c's printf function then java also has a method for that.  and it is just "print" */
        System.out.print("   /|");
        System.out.print("  / |");
        System.out.print(" /  |");
        System.out.print("/___|");
    }
}