public class ForEachloop {
    public static void main(String[] args) {
        /*There is also a "for-each" loop, which is used exclusively to loop through elements in an array:*/

        /*for (type variableName : arrayName) {
            // code block to be executed
        }*/
        String [] students= {"Abdullah", "Enam", "Sadik", "Sakib", "Sazid", "Jafor", "Sohan"};
        for (String i : students) {
            System.out.println(i);
        }
    }
}