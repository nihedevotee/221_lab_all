import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class no5Elab1VHUL {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true); 
        int n = Integer.parseInt(br.readLine());
        int count=0;
        // String[] store= new ;
        List<String> store= new ArrayList<>();
        boolean flag=false;

        int arr[] = new int [n];
        
        StringTokenizer st= new StringTokenizer(br.readLine());

        if (n==1){pw.println("YES"); pw.println(0);}
        
        else if (n==2){
            int x=Integer.parseInt(st.nextToken());
            int y=Integer.parseInt(st.nextToken());
            if (x<=y) {
                pw.println("YES"); pw.println(0);
            }
            else {
                pw.println("NO");
            }
        }
        else{
            for (int i = 0; i < arr.length; i++) {
                arr[i]= Integer.parseInt(st.nextToken());
            }
            for (int i = 1; i < arr.length-1; i++) {
                //int t=arr[i];
                if (arr[i-1]==arr[i+1]){
                    pw.println("NO");
                    flag=true;
                    break;
                }
                else if(arr[i-1]>arr[i+1]){
                    int temp=arr[i+1];
                    arr[i+1]=arr[i-1];
                    arr[i-1]=temp;
                    count++;
                    store.add(i+" "+(i+2)); 
                }
            }
            // for (int i = 1; i < arr.length; i++) {
            //     if(arr[i]<arr[i-1]){
            //         pw.println("NO");
            //         flag=true;
            //         break;
            //     }
            // }
            if(flag==false){
                pw.println("YES");
                pw.println(count);

                for (int i = 0; i < store.size(); i++) {
                    pw.println(store.get(i));
                }
            }
        }
    }
}
