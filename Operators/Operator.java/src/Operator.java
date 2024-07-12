public class Operator {
    public static void main(String[] args)
    {

        int sum1 = 100 + 50;
        int sum2 = sum1 + 50;
        int sum3 = sum2 + sum1;
        System.out.println(sum1 + "\n" + sum2 + "\n" + sum3);
        /*
        =	x = 5	x = 5	
        +=	x += 3	x = x + 3	
        -=	x -= 3	x = x - 3	
        *=	x *= 3	x = x * 3	
        /=	x /= 3	x = x / 3	
        %=	x %= 3	x = x % 3     // % (modulus) operator means remainder বা ভাগশেষ
        &=	x &= 3	x = x & 3	
        |=	x |= 3	x = x | 3	
        ^=	x ^= 3	x = x ^ 3	
        >>=	x >>= 3	x = x >> 3	
        <<=	x <<= 3	x = x << 3	
        */

        int x = 5;
        x += 3;
        System.out.println(x);

        x -= 3;
        System.out.println(x);

        x *= 2;
        System.out.println(x);

        x /= 2;
        System.out.println(x);

        x %= 2;
        System.out.println(x);

        /*Let's break it down.

                    & is bitwise and operator.   && is logical and operator.

        The binary value of 10 is 1010

        The binary value of 12 is 1100

        Here is something you should have in mind before we start the operation:

        1 and 0 => 0
        0 and 1 => 0
        1 and 1 => 1
        0 and 0 => 0
        So let's carry out the operation.

        The first character for 10 is 1 and the first character for 12 is also 1 so:

        1 and 1 = 1.

        We move on to the second characters – 0 for 10 and 1 for 12:

        1 and 0 = 0.

        For the third characters – 1 for 10 and 0 for 12:

        1 and 0 = 0.

        For the fourth characters – 0 for 10 and 0 for 12:

        0 and 0 = 0.

        Now let's combine all the returned characters. We would have 1000.

        The binary value 1000 in base 10 is 8 and that is why our operation returned 8. */ 

        x &= 12;
        System.out.println(x);

        x += 6;
        System.out.println(x);

        /* | is bitwise or operator.  || is logical or operator */

        x ^= 2;
        System.out.println(x);

        System.out.println(x > 3 && x < 5);// returns true because 4 is greater than 3 AND 5 is less than 10
    }
}
