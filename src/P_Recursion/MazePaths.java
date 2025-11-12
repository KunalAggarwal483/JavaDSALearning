package P_Recursion;

import java.util.*;

public class MazePaths {

    public static int countPaths(int n, int m){

        if(n == 1 || m == 1){
            return 1;
        }

        int left = countPaths(n, m-1);
        int up = countPaths(n-1, m);

        return left + up;
    }

    public static ArrayList<String> getPaths(int n , int m, String pathsSoFar){

        if(n == 1 && m == 1){
            ArrayList<String> base = new ArrayList<>();
            base.add(pathsSoFar);
            return base;
        }

        ArrayList<String> paths = new ArrayList<>();

        if(m > 1)
        paths.addAll(getPaths(n, m-1, pathsSoFar + "R"));
        if(n > 1)
        paths.addAll(getPaths(n-1, m, pathsSoFar + "D"));

        return paths;

    }

    public static void main(String[] args) {
        int n = 3; // number of rows
        int m = 3; // number of columns
        System.out.println("Number of paths in a " + n + "x" + m + " maze: " + countPaths(n, m));

        ArrayList<String> allPaths = getPaths(n, m, "");
        System.out.println("All possible paths:");
        for(String path : allPaths){
            System.out.println(path);
        }
    }
    
}
