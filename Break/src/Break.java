public class Break {
    public static void main(String[] args) {

        for (int i = 0; i < 9; i++) {

            System.out.println(i);
            if (i == 4) {
                break;
            }
        }
        /*The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.

        This example skips the value of 4:*/
        for (int i = 0; i < 9; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }

        int i = 0;
        while (i < 9) {
            System.out.println(i);
            i++;
            if (i == 4) {
                break;
            }
        }

        int j = 0;
        while (j < 9) {
            if (j == 4) {
                j++;
                continue;}

            {
                System.out.println(j);
                j++;
            }

        }
    }
}