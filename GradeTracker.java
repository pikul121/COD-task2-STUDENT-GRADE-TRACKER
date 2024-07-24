import java.util.Scanner;

public class GradeTracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Grade Tracker!");

        // Input grades for different subjects or assignments
        System.out.print("Enter the number of subjects or assignments: ");
        int numSubjects = scanner.nextInt();

        int[] grades = new int[numSubjects];
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter grade for subject/assignment " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
        }

        // Calculate average grade
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        double averageGrade = sum / numSubjects;

        // Display overall grade
        System.out.printf("Overall grade: %.2f\n", averageGrade);

        // Determine and display letter grade based on standard grading scale
        String letterGrade = determineLetterGrade(averageGrade);
        System.out.println("Letter grade: " + letterGrade);

        // Additional information (e.g., GPA) can be added here if needed

        scanner.close();
    }

    // Method to determine letter grade based on a standard grading scale
    private static String determineLetterGrade(double averageGrade) {
        if (averageGrade >= 90) {
            return "A";
        } else if (averageGrade >= 80) {
            return "B";
        } else if (averageGrade >= 70) {
            return "C";
        } else if (averageGrade >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
