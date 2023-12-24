import java.util.Scanner;

public class OrchardGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        String ashokRow = scanner.nextLine();
        String anandRow = scanner.nextLine();

        // Output
        String result = determineWinner(ashokRow, anandRow);
        System.out.println(result);
    }

    public static String determineWinner(String ashokRow, String anandRow) {
        // Check for invalid input
        if (!isValidInput(ashokRow) || !isValidInput(anandRow)) {
            return "Invalid input";
        }

        // Count possibilities for each row
        int ashokPossibilities = countPossibilities(ashokRow);
        int anandPossibilities = countPossibilities(anandRow);

        // Compare possibilities and declare the winner
        if (ashokPossibilities > anandPossibilities) {
            return "Ashok";
        } else if (anandPossibilities > ashokPossibilities) {
            return "Anand";
        } else {
            return "Draw";
        }
    }

    public static int countPossibilities(String row) {
        int possibilities = 0;
        int n = row.length();

        for (int i = 0; i < n - 2; i++) {
            char firstTree = row.charAt(i);
            char secondTree = row.charAt(i + 1);
            char thirdTree = row.charAt(i + 2);

            // Check if no two adjacent trees are the same
            if (firstTree != secondTree && secondTree != thirdTree && firstTree != thirdTree) {
                possibilities++;
            }
        }

        return possibilities;
    }

    public static boolean isValidInput(String row) {
        // Check if the row contains only 'M' and 'L' characters
        return row.matches("[ML]+");
    }
}

