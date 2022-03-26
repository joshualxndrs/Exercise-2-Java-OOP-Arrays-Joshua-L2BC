import java.util.Scanner;

public class num3StudentGrade {

    public static void main(String[] args) {

        // IMPORT JAVA SCANNER - for user input //
        Scanner sc = new Scanner(System.in);

        // INPUT PROMPTS //
        int StudentNum;
        System.out.println("Please input number of Students in the class(integer): ");
        StudentNum = sc.nextInt();
        // **if number of students is less than 1** //
        while (StudentNum < 1) {
            System.out.println("Number of Students should be more than 1: ");
            StudentNum = sc.nextInt();
        }

        // DECLARE VARIABLES //
        int x = 0;
        double[] grades;
        grades = new double[StudentNum];
        double avg = 0;
        double min = grades[0] + 100;
        double max = grades[0];
        double total = 0;

        // INPUT GRADES //
        while (x < StudentNum) {
            System.out.printf("Enter the grade for student " + "(" + (x + 1) + ")" + ": ");
            int grade = sc.nextInt();

            if (grade >= 0 && grade <= 100) {
                grades[x] = grade;
                total = total + grade;
                x++;
            } else {
                System.out.println("Grade must be between 0 and 100");
            }
        }

        // CALC MEAN or AVG //
        for (int i = 0; i < grades.length; i++) {
            avg += grades[i];
            if (grades[i] > max)
                max = grades[i];
            if (grades[i] < min)
                min = grades[i];
        }
        avg /= grades.length;

        // DISPLAY OUTPUT //
        System.out.printf("Mean is: %.2f\n", avg);
        System.out.println("Minimum is (lowest): " + min);
        System.out.println("Maximum is(highest): " + max);

        sc.close();
    }
}