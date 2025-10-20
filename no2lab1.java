import java.io.*;
import java.util.StringTokenizer;

public class no2lab1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());
        pw.println("hi");

        br.close();
        // No need to close System.out, PrintWriter with auto-flush handles it
    }
}
