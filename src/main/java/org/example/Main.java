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

    }
}


