import java.util.Scanner;

public class basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take size of array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        // Create array
        int arr[] = new int[n];

        // Take array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Bubble Sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
