import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
//import java.util.StringTokenizer;

public class no8Hlab1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true); 
        
        int n = Integer.parseInt(br.readLine());
        String [] arrNames = new String [n];
        String [] arrDes = new String [n];
        int [] arrTimes = new int [n];
        
        for (int i = 0; i < n; i++) {
            String s= br.readLine();
            String [] part= s.split(" ");
            arrNames[i]=part[0];
            arrDes[i]=part[4];

            String [] temp = part[part.length-1].split(":");
            arrTimes[i]=Integer.parseInt(temp[0]+temp[1]);
        }

        for (int i = 0; i < arrTimes.length-1; i++) {
            boolean flag=false;
            for (int j = 0; j < arrTimes.length-1-i; j++) {
                if (arrNames[j].compareTo(arrNames[j+1])>0) {
                    String temp= arrNames[j];
                    arrNames[j]=arrNames[j+1];
                    arrNames[j+1]=temp;
                    
                    String tem= arrDes[j];
                    arrDes[j]=arrDes[j+1];
                    arrDes[j+1]=tem;

                    int t=arrTimes[j];
                    arrTimes[j]=arrTimes[j+1];
                    arrTimes[j+1]=t;

                    flag=true;
                }
            }
            if (flag==false) {
                break;
            }
        }
        for (int i = 0; i < arrTimes.length - 1; i++) {
        boolean flag = false;
            for (int j = 0; j < arrTimes.length - i - 1; j++) {
                if (arrNames[j].compareTo(arrNames[j + 1]) == 0) { 
                    if (arrTimes[j] < arrTimes[j + 1]) { // max time first
                        int temp = arrTimes[j];
                        arrTimes[j] = arrTimes[j + 1];
                        arrTimes[j + 1] = temp;

                        String tempName = arrNames[j];
                        arrNames[j] = arrNames[j + 1];
                        arrNames[j + 1] = tempName;
                        
                        String tem = arrDes[j];
                        arrDes[j] = arrDes[j + 1];
                        arrDes[j + 1] = tem;

                        flag = true;
                    }
                }
            }
            if (flag == false) {
                break;
            }
        }
        for (int i = 0; i < arrTimes.length; i++) {
            int ti = arrTimes[i] / 100;   // hour part
            int me = arrTimes[i] % 100;   // minute part

            String tt;
            if (ti < 10) {
                tt = "0" + ti;
            } 
            else {
                tt = "" + ti;
            }

            String mm;
            if (me < 10) {
                mm = "0" + me;
            } else {
                mm = "" + me;
            }

            pw.println(arrNames[i] + " will departure for "+arrDes[i]+" at " + tt + ":" + mm);
        }
    }
}
