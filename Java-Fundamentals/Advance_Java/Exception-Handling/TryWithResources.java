import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class TryWithResources {
    public static void main(String args[]) throws NumberFormatException, IOException {
        int num = 0;
        BufferedReader br=null;
        try(InputStreamReader in = new InputStreamReader(System.in);) { //In the latest versions of java we dont even need to explicitly close the files using finally but we can use finally as well
            // we take the input through the Object in the () of try and once the try block is executed completly it
            // automatiically closes the resource and free them.
            //as the reader class is Auto closeable .
            br = new BufferedReader(in);
            num =Integer.parseInt(br.readLine());
            System.out.println(num);
         } 
         
        //     finally {
        //     System.out.println("Byyiee"); /
        //     br.close();
        // }
    }
}
/*
 * It is Not Necessary to write try with catch but if we dont it shows an error
 * so to avoid this error we use the Finally which is used to Close the
 * resources and runs irrespective
 * of whether there occurs an exceptio or not .
 */