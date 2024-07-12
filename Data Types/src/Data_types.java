public class Data_types {
    public static void main(String[] args) {

        String Heading = "Learning Data types";
        String CharacterName = "Rafid";
        int CharacterAge = 60;
        double gpa = 3.4;
        char grade = 'B';
        boolean isMale = true;
        //boolean is a varibale which stores only true or false data.

        System.out.println(Heading);
        System.out.println("There once was a man named " + CharacterName);
        System.out.println("He was " + CharacterAge + " years old.\nHe really liked the name " + CharacterName
                + " but he didn't like being " + CharacterAge + ".");
        System.out.println("His gpa was " + gpa + ".");
        System.out.println("His grade was " + grade + ".");
        System.out.println("Is it true that his gender is male? Ans: " + isMale);

        /* We can also write a type of data inside a function without declaring a variable.*/
        System.out.println("His son's age is " + 40 +".");

        /*We can also perform mathematical calculations inside the println() method*/

        System.out.print(3+"\n");
        //final variables: in easy word.. Constant.   We cannot change after we declare a constant.
        //If we do that we'll face an error

        final int mynum= 64;
        System.out.println(mynum);
    }
}