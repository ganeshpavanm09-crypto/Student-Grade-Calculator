import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("      STUDENT GRADE CALCULATOR (v2.0)     ");
        System.out.println("==========================================");

        // 1. Input: Number of Subjects
        int numSubjects = 0;
        while (numSubjects <= 0) {
            System.out.print("Enter total number of subjects: ");
            try {
                numSubjects = Integer.parseInt(scanner.nextLine().trim());
                if (numSubjects <= 0) {
                    System.out.println("[-] Please enter a positive number greater than 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("[-] Invalid input. Please enter a valid integer.");
            }
        }

        // 2. Accumulation & Defensive Input Validation
        int totalMarks = 0;
        for (int i = 1; i <= numSubjects; i++) {
            int mark = -1;
            while (mark < 0 || mark > 100) {
                System.out.printf("Enter marks for Subject %d (0 - 100): ", i);
                try {
                    mark = Integer.parseInt(scanner.nextLine().trim());
                    if (mark < 0 || mark > 100) {
                        System.out.println("[-] Error: Marks must be strictly between 0 and 100.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("[-] Error: Please enter numeric marks only.");
                }
            }
            totalMarks += mark;
        }

        // 3. Precise Arithmetic Calculation (Avoiding Integer Truncation)
        double averagePercentage = (double) totalMarks / numSubjects;

        // 4. Classification (Ordered Logic Ladder)
        char grade;
        String status;

        if (averagePercentage >= 90.0) {
            grade = 'A';
            status = "Distinction";
        } else if (averagePercentage >= 80.0) {
            grade = 'B';
            status = "First Class";
        } else if (averagePercentage >= 70.0) {
            grade = 'C';
            status = "Second Class";
        } else if (averagePercentage >= 60.0) {
            grade = 'D';
            status = "Pass";
        } else {
            grade = 'F';
            status = "Fail";
        }

        // 5. Output Presentation Layer
        System.out.println("\n============== PERFORMANCE REPORT ==============");
        System.out.printf("Total Subjects     : %d\n", numSubjects);
        System.out.printf("Total Marks Scored : %d / %d\n", totalMarks, (numSubjects * 100));
        System.out.printf("Average Percentage : %.2f%%\n", averagePercentage);
        System.out.printf("Assigned Grade     : %c (%s)\n", grade, status);
        System.out.println("================================================");

        scanner.close();
    }
}