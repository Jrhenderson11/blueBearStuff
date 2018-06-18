
public class matrixParse {

	public static double[][][] parseMatrices(String matrixString) {
		//PLACEHOLDER
		int size = 18;
		int num=250;
		int index =0;
		
		double[][][] matrix = new double[num][size][size];
		
		//each line is a matrix
		
		for (String lineA : matrixString.split("\n")) {
			
			String line = lineA.substring(1, lineA.length()-1);
			
			System.out.println(line);
			
			String[] parts = line.split("\\], \\[");
			for (int colindex =0; colindex < parts.length; colindex++) {
				String row = parts[colindex].replace("]", "").replace("[", "");
				for (String number : row.split("\\), \\(")) {
					number = number.replace(")", "").replace("(", "");
					System.out.println("number=" + number);
					int n1 = Integer.parseInt(number.replaceAll(" ", "").split(",")[0]);
					double n2 = Double.parseDouble(number.replaceAll(" ", "").split(",")[1]);
					matrix[index][n1][colindex] = n2;
				}
			}
			index++;
		}
		
		
		System.out.println(matrix);
		for (int y=0;y<18;y++) {
			for (int x=0;x<18;x++) {
				System.out.print(matrix[0][x][y] + ", ");
			}
			System.out.println();
			
		}
		
		return matrix;
		
	} 

}
