package main;

public class Recursion {
    static void countDown(int number)
    {
        if(number<=0)
        {
            return;     // ---> break cannot be used as it can only be used in loops.
        }
        System.out.println(number);
        --number;
        countDown(number);
    }

    public static void main(String[] args) {
        /*Recursion recursion = new Recursion();               --> if not using static with method
        recursion.countDown(4);*/
        countDown(4);

    }
}
