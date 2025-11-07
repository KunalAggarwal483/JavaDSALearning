package P_Recursion;

import readwrite.FastReader;

public class Patterns {


    public static void triangle(int row , int col){

        if(row == 0) return;

        if(col > row){
            System.out.println();
            triangle(row - 1 , 1);
            return;
        }

        System.out.print("* ");
        triangle(row, col + 1);

    }


    public static void main(String[] args) {
        int n = 5;

        FastReader sc = new FastReader();
        triangle(n , 1);
    }
    
}
