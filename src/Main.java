import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) {
		
		
	}
	
	private String readFile(String fname) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(fname));
		} catch (FileNotFoundException e) {
			System.out.println("file " + fname + " not found") ;
			System.exit(-1);
			//
		}
		 String everything;
		try {
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();

		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		    }
		   everything = sb.toString();
		} catch (Exception e) {
			System.out.println("something went wrong");
			e.printStackTrace();
		} finally {
		    br.close();
		}
		return everything;
	}

	private int[][] parseMatrix(String matrix) {
		int[][] matrix;
		
		
		return null;
		
	} 
	
	private int[][] parseVectors(String vectors) {
		int[][] matrix;
		
		
		return null;
		
	} 
	
}
