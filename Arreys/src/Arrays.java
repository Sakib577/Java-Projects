public class Arrays {
    public static void main(String[] args) {

        String[] cars = {"Volvo", "Bmw", "Ford", "Mazda"};
        System.out.println(cars[2]);

        cars[1] = "Tesla";
        System.out.println(cars[1]);

        System.out.println(cars.length);

        for (int i=0; i < cars.length; i++)
        {
            System.out.println(cars[i]);
        }

        /*There is also a "for-each" loop, which is used exclusively to loop through elements in arrays*/

        for (String i: cars)
        {
            System.out.println(i);
        }
    }
}