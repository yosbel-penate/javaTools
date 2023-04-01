import java.util.Scanner;

public class App {
    static Scanner input = new Scanner (System.in);
    public static void main(String[] args) throws Exception {
        int selectedAlgorim=100;
        do{
            System.out.println("------------------Toolbox----------------------------");
            System.out.println("Escoger el algoritmo requerido. \n 1- Basic Calculator. \n 2- Factorial of number.\n 3- Fibonacci series of number. \n 4- Find out whether the given String is Palindrome or not.\n 5- Calculate Permutation of 2 numbers. \n 6- Calculate combination of 2 numbers.\n 7- Reverse the letters present in the given String.\n 8- Convert given decimal number to binary.\n 9- Convert to base 16 number the given integer.\n 10- Convert a number of seconds in the formar minutes-seconds.\n 11- Given integer number, say if is prime or not. \n 0- Exit.");
            System.out.println("Enter de number of the algorim: ");
            selectedAlgorim = input.nextInt();

            switch (selectedAlgorim) {
                case 1:
                    calculatorInterface();
                    break;
                case 2:
                    factorialInterface();
                    break;
                case 3:
                    fibonacciInterface();
                    break;
                case 4:
                    palindromeInterface();
                    break;
                case 5:
                    permutationInterface();
                    break;
                case 6:
                    combinationInterface();
                    break;
                case 7:
                    reverseInterface();
                    break;
                case 8:
                    convertInterface();
                    break;
                case 9:
                    convertToBase16Interface();
                    break;
                case 10:
                    convertToMinutesAndSecondsInterface();
                    break;
                case 11:
                    primeInterface();
                    break;

                default:
                    break;
            }
        }while(selectedAlgorim != 0);
    }
    private static void primeInterface() {
        System.out.println("Enter the prime number:");
        int number = input.nextInt();
        boolean isPrime = prime(number);
        if (isPrime) {
            System.out.println("The number is prime.");
        } else {
            System.out.println("The number is not prime.");
        }
    }
    public static boolean prime(int number) {
        /*Code here*/
        return false;
    }
    private static void convertToMinutesAndSecondsInterface() {

        System.out.println("Enter the seconds:");
        int number = input.nextInt();

        String result = convertToMinutesAndSeconds(number);
        System.out.println(number+" seconds = "+result);
    }
    public static String convertToMinutesAndSeconds(int number) {
        /*Code here
            input: 5395
            output: 5395 seconds = 89 minutes, 55 seconds
        */
        int minutes = number / 60 ;
        int seconds = number % 60;
        String cadena =  Integer.toString(minutes) + " minutes, " + Integer.toString(seconds) + " seconds" ;             
          
       return cadena; 
    }
    private static void convertToBase16Interface() {
        System.out.println("Enter the number A:");
        int number = input.nextInt();

        String result = convertToBase16(number);
        System.out.println("The base 16 number of: "+number+" is: "+result);
    }
    public static String convertToBase16(int number) {
        /*Code here*/
        return null;
    }
    private static void convertInterface() {
        System.out.println("Enter the number A:");
        int number = input.nextInt();

        String result = convertToBinary(number);
        System.out.println("The binary number of: "+number+" is: "+result);
    }
    public static String convertToBinary(int number) {
        /*Code here*/
        return null;
    }
    private static void reverseInterface() {
        System.out.println("Enter the string:");
        String word = input.next();
        String result = reverse(word);
        System.out.println("The reverse letters of: "+word+" is "+result);
    }
    public static String reverse(String word) {
        /*Code here*/
        return null;
    }
    private static void combinationInterface() {
        System.out.println("Enter the number A:");
        int numberA = input.nextInt();

        System.out.println("Enter the number B:");
        int numberB = input.nextInt();

        int result = combination(numberA, numberB);
        System.out.println("The combination of the numbers: "+numberA+" and "+numberB+" is: "+result);
    }
    public static int combination(int numberA, int numberB) {
        /*Code here*/
        return 0;
    }
    private static void permutationInterface() {
        System.out.println("Enter the number A:");
        int numberA = input.nextInt();

        System.out.println("Enter the number B:");
        int numberB = input.nextInt();

        int result = permutation(numberA, numberB);
        System.out.println("The permutation of the numbers: "+numberA+" and "+numberB+" is: "+result);
    }
    public static int permutation(int numberA, int numberB) {
        /*Code here*/
        return 0;
    }
    private static void palindromeInterface() {
        System.out.println("Enter the string:");
        String word = input.next();
        boolean isPalindrome = palindrome(word);
        if (isPalindrome) {
            System.out.println("The string: "+word+" is palindrome.");
        } else {
            System.out.println("The string: "+word+" is not palindrome.");
        }
    }
    public static boolean palindrome(String word) {
        /*Code here*/
        return false;
    }
    private static void fibonacciInterface() {
        System.out.println("Enter the number:");
        int number = input.nextInt();

        String result = fibonacci(number);
        System.out.println("The fibonacci serie of the number "+number+" is: "+result);
    }
    public static String fibonacci(int number) {
        String result="0 1 1 2 3";
        /*Code here*/
        return result;
    }
    private static void factorialInterface() {
            System.out.println("Enter the number:");
            int number = input.nextInt();
        
            int result = factorial(number);
            System.out.println("The factorial of the number "+number+" is "+result);
        }
        
        public static int factorial(int number) {
            if (number == 0) {
                return 1;
            } else {
                int factorial = 1;
                for (int i = 1; i <= number; i++) {
                    factorial *= i;
                }
                return factorial;
            }
        }
        
    private static void calculatorInterface(){
        System.out.println("Enter the number A:");
        double numberA = input.nextDouble();

        System.out.println("Enter the number B:");
        double numberB = input.nextDouble();

        String operation = "+";
        System.out.println("Enter the operation:");
        operation = input.next();

        double result = basicCalculator(operation, numberA, numberB);
        System.out.println(numberA+" "+operation+" "+numberB+" = "+result);
    }
    public static double basicCalculator(String operation, double numberA, double numberB){
        return 0;
    }
}
