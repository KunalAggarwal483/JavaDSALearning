package P_Arrays;

public class SetMatrixZeros {

    public static void setZeroes(int[][] matrix){
        int col0 = 1;

        for(int i =1; i< matrix.length; ++i){
            for(int j = 0; j<matrix[0].length; ++j){

                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;

                    if(j == 0)
                        col0 = 0;
                    else
                        matrix[0][j] = 0;
            
                }
            }
        }

        for(int i = matrix.length -1; i>=0; --i){
            for(int j = matrix[0].length -1; j>0; --j){

                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        if(col0 == 0){
            for(int i=0; i< matrix.length; ++i){
                if(matrix[i][0] != 0)
                    matrix[i][0] = 0;
            }
        }

        //print the matrix first
        for(int[] row : matrix){
            for(int val : row){
                System.out.print(val + " ");
            }
            System.out.println();
        }   
    }

    public static void main(String[] args) {

        int[][] matrix = {
            {1,1,1,1},
            {1,1,1,1},
            {1,1,0,1},
            {1,1,1,1}
        };

        setZeroes(matrix);
        
    }
    
}
