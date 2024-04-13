package org.example;
import java.util.Scanner;

public class Main {
    /**
     * Here we just choose a tasks that we need.
     * To realize it I used switch case.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_task = sc.nextInt();
        switch (num_of_task) {
            case 1:
                task_1();
                break;
            case 2:
                task_2();
                break;
            case 3:
                task_3();
                break;
            case 4:
                task_4();
                break;
            case 5:
                task_5();
                break;
            case 6:
                task_6();
                break;
            case 7:
                task_7();
                break;
            case 8:
                task_8();
                break;
            case 9:
                task_9();
                break;
            case 10:
                task_10();
                break;
        }
    }
    /**
     * In this task we accept input values from user.
     * Next with a loop we fill our array and path them on findMin function.
     */
    public static void task_1() {

        long startTime = System.nanoTime();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a size of array:");
        int size = sc.nextInt();

        System.out.println("Enter elements of array:");
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("minimum value of array: " + findMin(size, arr));

        int min = arr[0];
        for (int i = 0; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;
        System.out.println("Time: " + duration + " ms");
    }
    /**
     * This function find minimum value.
     * It checks if next value is bigger than curren, if not current value stays.
     */
    public static int findMin(int size, int[] arr) {
        int min = arr[0];
        for (int i = 0; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    /**
     * In this task we fill array and with a loop plussing all values in one variable total.
     * Then just deviating it by size and it is important hold it in double type for accuracy.
     */
    public static void task_2(){
        long startTime = System.nanoTime();
        double total = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a size of array:");
        int size = sc.nextInt();

        System.out.println("Enter elements of array:");
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++){
            total += arr[i];
        }
        double result = total / size;

        System.out.println("Average: " + result);

        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;
        System.out.println("Time: " + duration + " ms");
    }
    /**
     * All logic of this task in PrimeOrNComposite() here we just accept values and call it.
     */
    public static void task_3(){
        long startTime = System.nanoTime();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        if (PrimeOrNComposite(n, 2)){
            System.out.println("Prime");
        }else{
            System.out.println("Composite");
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;
        System.out.println("Time: " + duration + " ms");
    }
    /**
     * Here we with if statement check if our number deviating by other number except 1 and itself.
     * We use recursion for checking all number until number itself.
     */
    public static boolean PrimeOrNComposite(int n, int i){
        if (n == i){
            return true;
        }
        if (n % i == 0){
            return false;
        }
        if (n <= 2){
            return false;
        }
        return PrimeOrNComposite(n, i + 1);
    }
    /**
     * Here we also just accept values and calling recursion function.
     */
    public static void task_4(){
        long startTime = System.nanoTime();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        System.out.println(factorial(n));

        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;
        System.out.println("Time: " + duration + " ms");
    }
    /**
     * In this function we use recursion.
     * Firstly before each calling we check if n == 0 because we have to be ensured when recursion should be stopped.
     * Recall just contains itself and next iteration in reversed queue.
     */
    public static int factorial(int n){
        if (n == 0){
            return 1;
        }
        return n * factorial(n - 1);
    }
    /**
     * Just accept and calling recursion function.
     */
    public static void task_5(){
        long startTime = System.nanoTime();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        System.out.println(fib(n));

        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;
        System.out.println("Time: " + duration + " ms");
    }
    /**
     * In task, we already know a formula to define a last number of fibonachi.
     */
    public static int fib(int n){
        if (n <= 1){
            return n;
        }else{
            return fib(n - 1) + fib(n - 2);
        }
    }
    /**
     * Just accept and calling recursion function.
     */
    public static void task_6(){
        long startTime = System.nanoTime();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println("Enter degree of number");
        int d = sc.nextInt();

        System.out.println(findDegree(n, d));
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;
        System.out.println("Time: " + duration + " ms");
    }
    /**
     * If degree number became equal to 0 we return 1 and stop recursion.
     * Until d == 0 we recall function and each iteration smaller on 1 and then just multiple all them.
     */
    public static int findDegree(int n, int d){
        if (d == 0){
            return 1;
        }
        return n * findDegree(n, d - 1);
    }
    /**
     * Just accept and calling recursion function.
     */
    public static void task_7(){
        long startTime = System.nanoTime();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a size of array:");
        int size = sc.nextInt();

        System.out.println("Enter elements of array:");
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        reverseArr(arr, size - 1);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;
        System.out.println("Time: " + duration + " ms");
    }
    /**
     * Recall function with -1 parameter and if i >= 0 we're outputting a value in reverse order.
     */
    public static void reverseArr(int[] arr, int i){
        if (i >= 0){
            System.out.print(arr[i] + " ");
            reverseArr(arr, i - 1);
        }
    }
    /**
     * Just accept and calling recursion function.If return True we output "Yes" else "No".
     */
    public static void task_8(){
        long startTime = System.nanoTime();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        if (isNumeric(input)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");

        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;
        System.out.println("Time: " + duration + " ms");
    }
    /**
     * Here we use isDigit for define digits.
     * In second "if" we check only one digit.
     * We recall function if string contains more than 1 digit.
     */
    public static boolean isNumeric(String str) {
        if (str == null) {
            return false;
        }
        if (str.length() == 1) {
            return Character.isDigit(str.charAt(0));
        }
        return Character.isDigit(str.charAt(0)) && isNumeric(str.substring(1));
    }
    /**
     * Just accept and calling recursion function.
     */
    public static void task_9(){
        long startTime = System.nanoTime();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a first number:");
        int n = sc.nextInt();

        System.out.print("Enter a second number:");
        int k = sc.nextInt();

        System.out.println(binomialCoefficient(n, k));
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;
        System.out.println("Time: " + duration + " ms");
    }
    /**
     * By given formula and recursion we define binomial coefficient.
     */
    public static int binomialCoefficient(int n, int k){
        if (k == 0 || k == n) {
            return 1;
        } else {
            return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
        }
    }
    /**
     * Just accept and calling recursion function.
     */
    public static void task_10(){
        long startTime = System.nanoTime();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a first number:");
        int a = sc.nextInt();

        System.out.print("Enter a second number:");
        int b = sc.nextInt();

        System.out.println(gcd(a, b));
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;
        System.out.println("Time: " + duration + " ms");
    }
    /**
     * By given formula and recursion we define binomial coefficient.
     */
    public static int gcd(int a, int b){
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
