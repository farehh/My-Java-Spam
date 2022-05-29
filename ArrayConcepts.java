import java.util.Scanner;
import java.util.Arrays;


public class ArrayConcepts {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];

            //happenings
    //compile time    // runtime

//Dynamic memory Allocation: Memory is allocated at runtime.

        //int [][] mdarr = new int [3][];
                                // defining rows is mandatory
        
        int[][] mdarr = {
            {1,2,3}, //0th index
            {4,5,6}, // 1st index
            {7,8,9} // 2nd index

        };

        int[][] arr2D = new int [3][3];
        //length of array = no of rows.

        for (int rows = 0; rows < arr2D.length; rows++) {
            for (int col = 0; col < arr2D[rows].length;col++) {
                arr2D[rows][col] = input.nextInt();
            }
        }
    
    }               
    
}
