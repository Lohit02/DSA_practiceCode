import java.util.Arrays;
import java.util.Scanner;

public class MinimumSwaps {
    public static int minSwapsToBeautiful(int[] arr) {
        int n = arr.length;

        // Check if the array is already beautiful
        if (isSortedAscending(arr) || isSortedDescending(arr)) {
            return 0;
        }

        // Create an array of pairs (element, index)
        int[][] indexedArr = new int[n][2];
        for (int i = 0; i < n; i++) {
            indexedArr[i][0] = arr[i];
            indexedArr[i][1] = i;
        }

        // Sort the indexed array by element
        Arrays.sort(indexedArr, (a, b) -> Integer.compare(a[0], b[0]));

        // Initialize swap count
        int swapCount = 0;

        // Create a boolean array to mark visited elements
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            // If the element is already at the correct position or visited, skip
            if (visited[i] || indexedArr[i][1] == i) {
                continue;
            }

            int cycleSize = 0;
            int j = i;

            while (!visited[j]) {
                visited[j] = true;
                j = indexedArr[j][1];
                cycleSize++;
            }

            if (cycleSize > 0) {
                // Minimum swaps needed to form a cycle
                swapCount += (cycleSize - 1);
            }
        }

        return swapCount;
    }

    public static boolean isSortedAscending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSortedDescending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Output
        int result = minSwapsToBeautiful(arr);
        System.out.println(result);
    }
}

