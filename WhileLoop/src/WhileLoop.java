public class WhileLoop {
    public static void main(String[] args) {
        int i = 0;
        /*The while loop loops through a block of code as long as a specified condition is true*/
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        int j = 0;
        /*do/while loop. The loop will always be executed at least once, even if the condition is false, because the code block is executed before the condition is tested*/
        do {
            System.out.println(j);
            j++;
        }
        while (j < 5);

    }
}