package main;



import java.math.BigInteger;

public class Factorial {
   static BigInteger factorial(BigInteger number)
   {
       if (number.equals(BigInteger.ONE))
       {
           return BigInteger.ONE;
       }
       return number.multiply(factorial(number.subtract(BigInteger.ONE)));
   }

    public static void main(String[] args) {
        System.out.println(factorial(BigInteger.valueOf(15)));
    }

}
