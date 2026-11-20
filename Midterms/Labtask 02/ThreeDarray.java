//Yohann S. Espino
//Class and Scanner Declaration
import java.util.Scanner;
public class ThreeDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Array Declarations
        float [][][] grades = new float[2][3][3];
        String[] subjectNames = {"Java", "Database", "Networking"};
        //Student Grade input, Student average and Section average calculator and printer
        for (int l = 0; l < 2; l++) {
            System.out.println("Section " + (l + 1));
            System.out.println("---------------------");
            float SectionTotal = 0;
            for (int r = 0; r < 3; r++) {
                System.out.println("Student " + (r + 1));
                float studentTotal = 0;
                for (int c = 0; c < 3; c++) {
                    float GradeAverage = 0;
                    System.out.print("Enter " + subjectNames[c] + ": ");
                    grades [l][r][c] = sc.nextFloat();
                    studentTotal += grades[l][r][c];
                }
                float StudentAverage = studentTotal / 3;
                System.out.printf("Student Average: %.2f%n", StudentAverage);
                SectionTotal += StudentAverage;
                System.out.println();
            }
            float SectionAverage = SectionTotal / 3;
            System.out.printf("Section Average: %.2f%n", SectionAverage);
            System.out.println();
        }
    }
}
