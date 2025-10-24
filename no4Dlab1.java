import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class no4Dlab1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true); 
        //boolean flag=false;

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int arr[] = new int [n];
            boolean flag = false; 

            StringTokenizer st= new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int x=Integer.parseInt(st.nextToken());
                arr[j]=x;
            }
            for (int k = 0; k < arr.length-1; k++) {
                if (arr[k+1] < arr[k]){
                    flag=true;
                    //pw.println("NO");
                    //return;
                }
            }
            if (flag==true){pw.println("NO");}
            else{pw.println("YES");}
        }
    }
}

