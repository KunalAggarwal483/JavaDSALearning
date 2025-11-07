package readwrite;
import java.io.*;
import java.util.*;

public class FastReader {
    
    // For fast input output
    BufferedReader br;
    StringTokenizer st;
    public FastReader()
    { try {br = new BufferedReader(
    new FileReader("src/input.txt"));
    PrintStream out = new PrintStream(new FileOutputStream("src/output.txt"));
    System.setOut(out);}
    catch(Exception e) { br = new BufferedReader(new InputStreamReader(System.in));}
    }
    public String next()
    {
    while (st == null || !st.hasMoreElements()) {
    try {st = new StringTokenizer(br.readLine());}
    catch (IOException e) {
    e.printStackTrace();}
    }
    return st.nextToken();
    }
    public int nextInt() { return Integer.parseInt(next()); }
    public long nextLong() { return Long.parseLong(next()); }
    public double nextDouble() {return Double.parseDouble(next()); }
    public String nextLine()
    {
    String str = "";
    try {
    str = br.readLine();
    }
    catch (IOException e) {
    e.printStackTrace();
    }
    return str;
    }
    // end of fast i/o code
}
