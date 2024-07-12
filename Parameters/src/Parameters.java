public class Parameters {
    /*When a parameter is passed to the method, it is called an argument. So, from the example above: fname is a parameter, while Liam, Jenny and Anja are arguments.*/
    static void mymethods(String fname, int age)
    {
        System.out.println(fname + " is " + age);
    }
    public static void main(String[] args) {
        mymethods("Sazid",22);
        mymethods("Arman",21);
        mymethods("Nibir",21);
        mymethods("Enam",21);
        mymethods("Tauhid",21);
        mymethods("Sadik",21);
        mymethods("Sohan",22);
    }
}