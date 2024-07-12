public class Scope {
    public static void main(String[] args) {
        //In Java, variables are only accessible inside the region they are created.
        // This is called scope.

        // Method scope
        // Variables declared directly inside a method are available anywhere in the
        // method following the line of code in which they were declared:

        //code here cannot use x

        int x = 100;

        //code here can use x

        System.out.println(x);

        //In Java, variables are only accessible inside the region they are created. This is called scope.

        //Block scope
        //A block of code refers to all of the code between curly braces {}.
        //
        //Variables declared inside blocks of code are only accessible by the code
        // between the curly braces, which follows the line in which the variable was declared
        //code here can not use y
        { //This is a block of code.
            //code here can not use y
            int y= 50;

            System.out.println(y);

        } //This is a block of code.
        //code here can not use y
    }
}