package main;

public class Recursion1 {
        static int sum(int number)
        {
            if(number == 1)
            {
                return 1;
            }
            return number + sum(--number);
        }

    public static void main(String[] args) {
        sum(4);
    }
}
