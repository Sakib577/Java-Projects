public class IfElse {
    public static void main(String[] args) {

        int x, y;
        x =18;
        y =9;

        if ( x == 2*y )
        {
            System.out.println("Correct value");
        }
        else{
            System.out.println("Incorrect value");
        }

        int time = 20;
        if (time<10)
        {
            System.out.println("good morning");
        } else if (time<18) {
            System.out.println("good day");
        }
        else {
            System.out.println("good evening");
        }

        /*a short-hand if else, which is known as the ternary operator because it consists of three operands.

        It can be used to replace multiple lines of code with a single line, and is most often used to replace simple if else statements:*/

        //Example
        int ridoy;
        ridoy = 22;

        /*if (ridoy > 21)
        {
            System.out.println("You are allowed to get married.");
        } else {
            System.out.println("You are not allowed to get married");
        }
*/
        //We can use the short hand if else instead of writting the full statement.

        String result = (ridoy > 21) ? "You are allowed to get married." : "You are not allowed to get married.";
        System.out.println(result);

        //or

        System.out.println((ridoy>21) ? "You are allowed to get married." : "You are not allowed to get married.");
    }
}