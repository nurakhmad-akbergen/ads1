package org.example;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_task = sc.nextInt();
        switch (num_of_task) {
            case 1:
                task_1();
                break;
            case 2:
                task_2();
            case 3:
                task_3();
            case 4:
                task4();

        }
    }

    public static void task_1() {
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
    }

    public static int findMin(int size, int[] arr) {
        int min = arr[0];
        for (int i = 0; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void task_2(){
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
    }

    public static void task_3(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        if (PrimeOrNComposite(n, 2)){
            System.out.println("Prime");
        }else{
            System.out.println("Composite");
        }

    }

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

    public static void task4(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        System.out.println(factorial(n));
    }

    public static int factorial(int n){
        if (n == 0){
            return 1;
        }


        return n * factorial(n - 1);
    }

}

