import java.util.Random;

class Calculator {

    Calculator(){

    }

    int add(int a , int b){
        return a + b;
    }

    int subtract(int a , int b){
        return a - b;
    }

    int multiply(int a , int b){
        return a * b;
    }

    int divide(int a , int b){
        return a / b;
    }


    /*
    Returns the n'th number in the fibonacci sequence
    https://en.wikipedia.org/wiki/Fibonacci_number
    Example below
    n = x
    0 = 0
    1 = 1
    2 = 1
    3 = 2
    4 = 3
    5 = 5
    .
    .
    .
    etc
     */
    int fibonacciNumberFinder(int n){
        if(n == 0) {
            return 0;
        }
        int fib = 1;
        int minus1 = 1;
        int minus2 = 0;
        for(int i = 1; i < n; i++) {
            fib = minus1 + minus2;
            minus2 = minus1;
            minus1 = fib;
        }
        return fib;
    }


    /*
    Returns binary value of the given int number
    The binary number will be stored as a string
    if int a = 0 then this method returns: 0
    if int a = 10 then this method returns: 1010
    if int a = 16 then this method returns: 10000
     */
    String intToBinaryNumber(int n){
        return Integer.toBinaryString(n);
    }

    /*
    Create a completely unique String identifier for a given string
    Each createdID must contain the string n in its unaltered Form
    if String n = "Jason"
    then the created ID could be = Jasonklfgn3jknnvksdfm - Because it contains the unaltered String n and is unique
    if you run this function twice with the same String input, it must return 2 unique String IDs
     */
    String createUniqueID(String n){
        Random random = new Random();
        String ending = null;
        for (int i = 0; i < 10; i++) {
            ending += (char) (random.nextInt(26) + 'a');
        }
        return n + ending;
        
    }


}
