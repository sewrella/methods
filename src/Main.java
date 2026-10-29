import java.util.Scanner;
 public class Main{
    public static String calculateGrade(int score) {
        if (score <0 || score >100){
            return "Invalid score! Enter a score between 0 and 100.";
        } else if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's score (0-100): ");
        int score = scanner.nextInt();

        System.out.println("Grade: " + calculateGrade(score));

        scanner.close();
    }
}