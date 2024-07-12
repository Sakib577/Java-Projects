public class NestedLoop {
    public static void main(String[] args) {

        /*It is also possible to place a loop inside another loop. This is called a nested loop.
        The "inner loop" will be executed one time for each iteration of the "outer loop":*/

        // outer loop
        for (int i = 1; i <= 2; i++)
        {
            System.out.println("Outer:" + i); //Executes 2 times
            //inner loop
            for (int j = 1; j <= 3; j++)
            {
                System.out.println("Inner" + j);//executes 6 times(2*3)
            }
            
        }
    }
}