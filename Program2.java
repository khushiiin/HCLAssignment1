package Assignment1;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[50];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("0. Exit");
            System.out.println("1. Insertion");
            System.out.println("2. Deletion");
            System.out.println("3. Linear Search");
            System.out.println("4. Binary Search");
            System.out.println("5. Maximum value");
            System.out.println("6. Count Even/Odd");
            System.out.println("7. Insertion Sort");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter element to insert: ");
                    arr[n++] = sc.nextInt();
                    System.out.println("Element inserted");
                    break;

                case 2:
                    System.out.print("Enter element to delete: ");
                    int del = sc.nextInt();
                    int index = -1;

                    for (int i = 0; i < n; i++) {
                        if (arr[i] == del) {
                            index = i;
                            break;
                        }
                    }

                    if (index == -1) {
                        System.out.println("Element not found");
                    } else {
                        for (int i = index; i < n - 1; i++) {
                            arr[i] = arr[i + 1];
                        }
                        n--;
                        System.out.println("Element deleted");
                    }
                    break;

                case 3:
                    System.out.print("Enter element to search: ");
                    int num = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < n; i++) {
                        if (arr[i] == num) {
                            System.out.println("Element found at index " + i);
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Element not found");
                    break;

                case 4:
                    System.out.print("Enter element to search: ");
                    num = sc.nextInt();

                    int start = 0, end = n - 1;
                    found = false;

                    while (start <= end) {
                        int mid = (start + end) / 2;

                        if (arr[mid] == num) {
                            System.out.println("Element found at index " + mid);
                            found = true;
                            break;
                        } else if (arr[mid] < num) {
                            start = mid + 1;
                        } else {
                            end = mid - 1;
                        }
                    }

                    if (!found)
                        System.out.println("Element not found");
                    break;

                case 5:
                    int max = arr[0];
                    for (int i = 1; i < n; i++) {
                        if (arr[i] > max)
                            max = arr[i];
                    }
                    System.out.println("Maximum value: " + max);
                    break;

                case 6:
                    int even = 0, odd = 0;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] % 2 == 0) even++;
                        else odd++;
                    }
                    System.out.println("Even: " + even + ", Odd: " + odd);
                    break;

                case 7:
                    for (int i = 1; i < n; i++) {
                        int temp = arr[i];
                        int j = i - 1;
                        while (j >= 0 && arr[j] > temp) {
                            arr[j + 1] = arr[j];
                            j--;
                        }
                        arr[j + 1] = temp;
                    }
                    System.out.println("Array sorted");
                    break;

                case 0:
                    System.out.println("Exited");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

            System.out.print("Array Updated: ");
            for (int i = 0; i < n; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
        } while (choice != 0);

        sc.close();
    }
}
