import java.util.Scanner;

public class SimpleGradingSystem {

    public static void main(String[] args) {
        String[] subjects = {"Java", "C++", "Linux", "HTML", "DBMS"};
        
        Scanner scanner = new Scanner(System.in);

        int totalMarks = 0;

        for (int i = 0; i < subjects.length; i++) {
            System.out.print("Enter marks for " + subjects[i] + ": ");
            int marks = scanner.nextInt();  
            totalMarks += marks;  
        }

        double averagePercentage = (totalMarks / 500.0) * 100;  

        String grade;
        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B+";
        } else if (averagePercentage >= 60) {
            grade = "B";
        } else if (averagePercentage >= 50) {
            grade = "C";
        } else {
            grade = "D";
        }

        
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);
    }
}

