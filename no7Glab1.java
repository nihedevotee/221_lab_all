import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class no7Glab1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true); 
        
        int t = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st= new StringTokenizer(br.readLine());
            StringTokenizer st2= new StringTokenizer(br.readLine());
            int arrMarks[] = new int [n];
            int arrID[] = new int [n];
            int count=0;

            for (int j = 0; j < n; j++) {
                arrID[j]=Integer.parseInt(st.nextToken());
                arrMarks[j]=Integer.parseInt(st2.nextToken());
            }

            for (int j = 0; j < arrID.length - 1; j++) {
                int max = j;
                for (int j2 = j + 1; j2 < arrID.length; j2++) {
                    if ((arrMarks[j2] > arrMarks[max]) || (arrMarks[j2] == arrMarks[max] && arrID[j2] < arrID[max])) {
                        max = j2;
                    }
                }
                
                    if(max != j){
                        int temp = arrMarks[j];
                        arrMarks[j] = arrMarks[max];
                        arrMarks[max] = temp;
                        
                        int a = arrID[j];
                        arrID[j] = arrID[max];
                        arrID[max] = a;
                        count++;
                    }
            }

            pw.println("Minimum swaps: "+count);
            
            for (int j = 0; j < arrID.length; j++) {
                pw.println("ID: "+arrID[j]+" Mark: "+arrMarks[j]);
            }
        }
    }
}
