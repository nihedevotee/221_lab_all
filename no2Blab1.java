import java.io.*;
//import java.util.StringTokenizer;

public class no2Blab1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        //StringTokenizer st = new StringTokenizer(br.readLine());
        int t=Integer.parseInt(br.readLine());
        
        for (int i = 0; i < t; i++) {
            String cal=br.readLine();
            String[] part= cal.split(" ");
            int a = Integer.parseInt(part[1]);
            int b = Integer.parseInt(part[part.length-1]);
            String symbol = part[2];

            if (symbol.equals("+")){
                double x = (double) a + b;
                pw.println(x);
            }
            else if (symbol.equals("-")){
                double x = (double) a - b;
                pw.println(x);
            }
            else if (symbol.equals("*")){
                double x = (double) a * b;
                pw.println(x);
            }
            else if (symbol.equals("/")){
                double x = (double) a / b;
                pw.println(x);
            } 
        }
        pw.close();
    }
}
