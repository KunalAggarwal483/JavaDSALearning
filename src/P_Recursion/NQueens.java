package P_Recursion;
import java.util.*;

import readwrite.FastReader;

public class NQueens {

    static int ways = 0;

    public static void placeNQueens(int[][] result, int n, int r, int c){
        // System.out.println(" Value of n is : " + n);

        if(r == result.length -1){

            result[r][c] = 1;
        
            for(int i = 0; i< result.length; ++i){
                for(int j = 0; j< result.length; ++j){
                    if(result[i][j] == 1) System.out.print(" Q ");
                    else System.out.print(" . ");
                }
                System.out.println();
            }
            System.out.println();
           
            result[r][c] = 0;
            return;
        }


        result[r][c] = 1;
        
        // for(int i = 0; i< result.length; ++i){
        //         for(int j = 0; j< result.length; ++j){
        //             if(result[i][j] == 1) System.out.print(" Q ");
        //             else System.out.print(" . ");
        //         }
        //         System.out.println();
        //     }
        //     System.out.println();


        // for(int i = r+1; i< n; ++i) result[i][c] = -1;

        // for(int i = c+1; i<n; ++i) result[r][i] = -1;

        // for(int i = r+1, j = c+1; i<n && j<n; ++i, ++j)
        //     result[i][j] = -1;

        // for(int i = r-1, j = c-1; i>=0 && j>=0; --i, --j)
        //     result[i][j] = -1;
        
        for(int i = 0; i< result.length; ++i){

            // System.out.println("Checking row " + (r+1) + " and col " + i);
            //check cells above
            int upper = r;
            while(upper >= 0){
                if(result[upper][i] == 1){
                    break;
                }
                upper--;
            }
            if(upper != -1) continue;

            // check cells diagonally up right

            upper = r;
            int colRight = i+1;
            while(upper >=0 && colRight < result.length){
                if(result[upper][colRight] == 1){
                    break;
                }
                upper--;
                colRight++;
            }

            if(upper >= 0 && colRight < result.length) continue;

            // check cells diagonally up left

            upper = r;
            int colLeft = i-1;
            while(upper >=0 && colLeft >= 0){
                if(result[upper][colLeft] == 1){
                    break;
                }
                upper--;
                colLeft--;
            }
            if(upper >= 0 && colLeft >= 0) continue;

            // System.out.println("Making a recursion call for row " + (r+1) + " and col " + i);
            placeNQueens(result, n-1, r+1, i);

            // for(int row = 0; row< result.length; ++row){
            //     for(int col  = 0; col< result.length; ++col){
            //         if(result[row][col] == 1) System.out.print(" Q ");
            //         else System.out.print(" . ");
            //     }
            //     System.out.println();
            // }
            // System.out.println();

        }

        result[r][c] = 0;

    }

    public static void main(String args[]){

        int n = 9;
        int[][] board = new int[n][n];

        FastReader sc = new FastReader();

        for(int i = 0; i<n; ++i){
        placeNQueens(board, n, 0, i);
        }
    }
    
}
