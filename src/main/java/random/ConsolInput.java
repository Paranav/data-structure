package random;
import java.io.*;

public class ConsolInput {
	    public static void main(String[] args)
	        throws IOException
	    {
			/*
			 * // Enter data using BufferReader BufferedReader read = new BufferedReader(
			 * new InputStreamReader(System.in)); // Reading data using readLine String x =
			 * read.readLine(); // Printing the read line System.out.println(x);
			 * 
			 * read.close();
			 */
	        
	        String x1 = System.console().readLine();
	        
	        System.out.println(x1);
	    }

}
