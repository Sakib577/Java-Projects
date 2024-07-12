public class Main {//Created a class named Main

    /*A Class is like an object constructor, or a "blueprint" for creating objects.*/

    /*Remember from the Java Syntax chapter that a class should always start with an
    uppercase first letter, and that the name of the java file should match the
    class name.*/

    final int x = 5;
    int y=15;
    /*If you don't want the ability to override existing values, declare the attribute as final:*/
    //You can specify as many attributes as you want
    String fname = "Abdullah As";
    String lname = "Sakib";

    int age;


    /*Java Class Attributes
    In the previous chapter, we used the term "variable" for x in the example (as shown below).
    It is actually an attribute of the class. Or you could say that class attributes are variables within a class:

    */

    //When we use an attribute in a class, We can call it a variable for that class.


    public static void main(String[] args) {
        /*To create an object of Main, specify the class name, followed by the
        object name, and use the keyword new*/
        Main myobj1 = new Main();// object 1
        Main myobj2 = new Main();// object 2
        System.out.println(myobj1.x);
        System.out.println(myobj2.x);/*Accessing Attributes*/

        /*You can access attributes by creating an object of the class, and by using the dot syntax (.)*/

        /*Modifying Attributes*/
        myobj2.y = 18; // y is now 18 only for the object named myobj2

        System.out.println(myobj1.y);
        System.out.println(myobj2.y);
        //If you create multiple objects of one class, you can change the attribute values in one object,
        //without affecting the attribute values in the other

        //myobj2.x = 25;        The final keyword is useful when you want a variable to always store the same value,
        // like PI (3.14159...), or to be exact constants.
        //The final keyword is called a "modifier"
        System.out.println(myobj1.x);
        System.out.println(myobj2.x);

        myobj1.fname = "Sifat";
        myobj1.lname = "Hasan";

        myobj1.age= myobj1.x + myobj1.y;
        myobj2.age= myobj2.x + myobj2.y;

        System.out.println("Name: " + myobj1.fname +" "+ myobj1.lname);
        System.out.println("Age: " + myobj1.age);

        System.out.println("Name: " + myobj2.fname +" "+ myobj2.lname);
        System.out.println("Age: " + myobj2.age);

    }
}