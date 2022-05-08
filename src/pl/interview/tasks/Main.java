package pl.interview.tasks;

public class Main {

    /**
     Created by xciechan
     on 2022-05-06

     The application finds the sum of all numbers which are equal to the sum of the factorial of their digits.
     without numbers: 1, 2, they are not sums
     */

    public static void main(String[] args) {
        int[] factorial = new int[10];
        int sumOfAllCuriousNumber = 0;
        int rangeOfSearch = 1000000;

        factorial[0] = 1;
        for (int i = 1; i<factorial.length; i++){
            factorial[i] = factorial[i-1] * i;
        }

        for (int i=10; i < rangeOfSearch; i++){
            sumOfAllCuriousNumber += findCuriousNumber(factorial, i);
        }
        System.out.println("Sum of all numbers is equal: " + sumOfAllCuriousNumber + " (range: " + rangeOfSearch + ")");

    }

    public static int findCuriousNumber (int[] factorial, int number){
        int curiousNumber = number;
        int sumOfFactorialDigitsOfNumber = 0;

        while (number>0){
            sumOfFactorialDigitsOfNumber += factorial[number % 10];
            number /= 10;
        }

        if(curiousNumber == sumOfFactorialDigitsOfNumber) {
            System.out.println("Curious number is: " + curiousNumber);
            return curiousNumber;
        }
        else
            return 0;

    }

}
