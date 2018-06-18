import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		matrixParse.parseMatrices(readFile("src/matrix"));
		
	}
	
	private static String readFile(String fname) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(fname));
		} catch (FileNotFoundException e) {
			System.out.println("file " + fname + " not found") ;
			System.exit(-1);
			//
		}
		 String everything = null;
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
		    try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return everything;
	}

	
	private int[][] parseVectors(String vectorString) {
		int[][] vectors;
		
		
		return null;
		
	} 
	
}
