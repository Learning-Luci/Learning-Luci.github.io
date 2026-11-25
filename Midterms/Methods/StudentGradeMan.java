import java.util.Scanner;

public class StudentGradeMan {
    public static float getAverage(float a, float b, float c) {
        float gradeavg = (a + b + c)/3;
        return gradeavg;
        
    }
    public static String getRemark(float gradeavg) {
        String remark;
        if (gradeavg >= 60) {
            remark = "Passed";
        } else {
            remark = "Failed";
        }
        return remark;
    }

    public static void displayResult(float a, float b, float c) {
        System.out.printf("Average: %.2f", getAverage(a, b, c));
        System.out.println();
        System.out.println("Remarks: " + getRemark(getAverage(a, b, c)));
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        System.out.println("Enter grades...");
        System.out.print("  Grade for a : ");
        float a = sc.nextFloat();
        System.out.print("  Grade for b : ");
        float b = sc.nextFloat();
        System.out.print("  Grade for c : ");
        float c = sc.nextFloat();
        System.out.println();
        displayResult(a, b, c);
    }

}