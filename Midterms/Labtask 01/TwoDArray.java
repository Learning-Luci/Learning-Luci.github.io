//Yohann S. Espino ITE102
import java.util.Scanner;
//Declaration of Class with method, and making scanner
public class TwoDArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //To redo the entire program
        char again;
        do { 
            //Declare the array declaration and prompt the user to enter 9 elements for the 3x3 array.
            int [][]nums = new int[3][3];
            System.out.println("Enter 9 Elements.....");
            for(int r = 0; r < nums.length; r++) {
                for(int c =0; c < nums.length; c++)  {
                    nums[r][c] = input.nextInt(); 
                }
            }
            //Responsible for the output of the table, row sum, column sum, and diagonal sum.
            System.out.println("\nHere are the Numbers and the required outputs:");
            System.out.println(" ");
            System.out.println("                          " + "Row Sum");
            int []colSum = new int[3]; 
            for(int r = 0; r < nums.length; r++) {
                int rowSum = 0; 
                for(int c = 0; c < nums.length; c++) {
                    System.out.printf("%5d", nums[r][c]);
                    rowSum += nums[r][c];  
                    colSum[c] += nums[r][c]; 
                }
                System.out.printf("%15d\n", rowSum); 
             }
            System.out.printf("%n%-12s", "Column sum:");
            for(int c = 0; c < nums.length; c++) {
                System.out.printf("%5d", colSum[c]);
            }
            System.out.println();
            
            int dia1 = 0, dia2 = 0; 
            for(int i = 0; i < nums.length; i++) {
                dia1 += nums[i][i];
                dia2 += nums[i][nums.length - 1 - i];
            }
            System.out.println("Diagonal sum 1: " + dia1);
            System.out.println("Diagonal sum 2: " + dia2);

            //Prompt the use if they want to redo the program.
            System.out.print("\nTry Again [y|n]: ");
            again = input.next().charAt(0);
        } while (again == 'y' || again == 'Y'); 
        System.out.println("Goodbye!");
    }
}