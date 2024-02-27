import java.util.Arrays;
import java.util.Scanner;

public class Strong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] result = removeDuplicates(arr);
      
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
        System.out.println();
        scanner.close();
    }

    public static int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int j = 0;
        for (int i = 0; i < n-1; i++) {
            if (arr[i] != arr[i+1]) {
                result[j++] = arr[i];
            }
        }
        result[j++] = arr[n-1];
        return Arrays.copyOf(result, j);
    }
    
}