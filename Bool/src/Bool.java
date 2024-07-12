public class Bool {
    public static void main(String[] args) {
        boolean isjavafun = true;
        boolean isporkafood = false;
        System.out.println(isjavafun);
        System.out.println(isporkafood);

        //Boolean Expressions is useful to build logic, and find answers.
        int x, y;
        x = 10;
        y = 8;

        System.out.println(x > y);

        int age, votingAge;
        age = 21;
        votingAge = 18;

        if (age >= votingAge) {
            System.out.println("You're old enough to vote.");
        } else {
            System.out.println("You're not old enough to vote.");
        }
    }
}