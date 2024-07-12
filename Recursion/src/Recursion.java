public class Recursion {
    public static void main(String[] args) {

        int result = sum(10);
        System.out.println(result);
    }

    //Using recursion to add all of the numbers up to 10.
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);//this means k+ sum(k=k-1)
        } else {
            return 0;

            /*Halting Condition
        Just as loops can run into the problem of infinite looping, recursive functions can run into the problem of infinite recursion.
        Infinite recursion is when the function never stops calling itself. Every recursive function should have a halting condition,
        which is the condition where the function stops calling itself. In this example, the halting condition is when
        the parameter k becomes 0.*/
        }
    }
}