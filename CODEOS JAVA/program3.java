import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class program3 {
    //Input in java
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter some Number:");
        int x=Integer.parseInt(br.readLine());
        System.out.print(x);

    }

    
}
