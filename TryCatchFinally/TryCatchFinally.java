package TryCatchFinally; // if you don't write this line java will cnsider it as a file in the src folder 

import java.io.*;

public class TryCatchFinally {
    public static void main (String [] args) throws IOException{
        String file = "F:\\JAVA\\sample_tryCatchFinally.csv";
        BufferedReader reader = null;
        String line = "";

        try {
            reader = new BufferedReader(new FileReader(file));
            while((line = reader.readLine()) != null) {
                
                String[] row = line.split(",");

                for (String index : row) {
                    System.out.printf("%-10s",index );
                }
                System.out.println();
            }
        }
        catch(Exception e) {
            e.printStackTrace();

        } finally {
            try{
                reader.close();
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
} 

