public class Variables {
    public static void main(String[] args) {

        String Heading = "Learning Variables";
        String CharacterName = "Rafid";
        int CharacterAge = 60;
        System.out.println(Heading);
        System.out.println("There once was a man named " + CharacterName);
        System.out.println("He was " + CharacterAge + " years old.\nHe really liked the name " + CharacterName
                + " but he didn't like being " + CharacterAge + ".");
    //variables in java have to be declared in specified data types just like c.
        
        float f1 = 56.75f;
        double d1 = 4.326e3d;
        System.out.println(f1 + "\n" + d1);
    //we can use 'e' as exponent of 10 in a floating point number.

    /*Widening Casting (automatically) - converting a smaller type to a larger type size
    byte -> short -> char -> int -> long -> float -> double */
    /*Narrowing Casting (manually) - converting a larger type to a smaller size type
    double -> float -> long -> int -> char -> short -> byte */

        double f1d = f1;
        float f1di = (float) f1d;

    System.out.println(f1d +"\n"+ f1di);
    }
}