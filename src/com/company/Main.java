package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 6, 8, 9, 10};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mảng trước khi chèn:");
        showArray(arr);
        System.out.println("Nhập số cần chèn:");
        int number = scanner.nextInt();
        System.out.println("Nhập vị trí cần chèn:");
        int index = scanner.nextInt();
        int newArray[] = addNewElementToArray(index, arr, number);
        System.out.println("Mảng sau khi chèn:");
        showArray(newArray);
    }

    public static void showArray(int[] array) {
        for (int element : array) {
            System.out.println(element);
        }
    }

    public static int[] addNewElementToArray(int index, int[] arr, int number) {
        int newArray[] = new int[arr.length + 1];
        for (int i = 0; i < newArray.length; i++) {
            if (i < index) {
                newArray[i] = arr[i];
            } else if (i == index) {
                newArray[i] = number;
            } else {
                newArray[i] = arr[i - 1];
            }
        }
        return newArray;
    }

}
