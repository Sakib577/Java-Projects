public class Strings {
    public static void main(String[] args){
        String txt = "Hello boi";
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        System.out.println("The length of the txt string is: " + txt.length());
        System.out.println(txt.indexOf("boi")); //locate outputs the starting position in the string.

        String firstname= "John";
        String lastname = "doe";
        System.out.println(firstname + " "  + lastname);// string concatenation.
        System.out.println(firstname.concat(lastname));//method for concatenation.

        /*  \'	'	Single quote
            \"	"	Double quote
            \\	\	Backslash 
            \n	New Line	
            \r	Carriage Return	
            \t	Tab	
            \b	Backspace	
            \f	Form Feed	
        */
        /*The difference between \r (carriage return) and \n (line feed) lies in how they affect the cursor's position in text:

            \r (Carriage Return):
            Moves the cursor to the beginning of the current line.
            Does not advance to the next line.
            Historically used on typewriters to return the carriage (the printing mechanism) to the beginning of the line for the next character.
            \n (Line Feed):
            Advances the cursor to the beginning of the next line.
            Does not move the cursor horizontally on the line.
            Primarily used on Unix-based systems to signal a new line.
            Here's a visualization to help:

            Before:     This is line 1
            Cursor:         ^

            After \r:   This is line 1<— Cursor
                    (still on line 1)

            After \n:   This is line 1
                    This is line 2<— Cursor
                    (moved to next line)
            Some additional points:

            Windows systems traditionally used the combination \r\n: This sequence combines the carriage return to the beginning of the line with the line feed to move to the next line.
            Mac systems traditionally used only \n: This was consistent with Unix systems.
            Modern systems can handle both formats: Most software today can interpret both \r and \n and display text correctly. However, knowing the difference can be helpful in situations like:
            Troubleshooting text files with incorrect line endings.
            Working with legacy systems that have specific requirements for line endings.
         */

         String txt2 = "It's alright, It\'s alright. We are the famous\"software boys\" from Bogura.";
         String txt3 = "It's alright, It\'s alright. We\t are the famous\"software\b boys\" from Bogura.";
         System.out.println(txt2);
         System.out.println("\f");//used for visual seperation.
         System.out.println(txt3);
    }
}