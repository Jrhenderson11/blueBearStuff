public class VectorParse {
    private double[][] parseMatrix(String m) {
        double[][] matrix = new double[1000][1000];
        int ii=0,jj=0,maxj=0;

        boolean inSquare = false, inComma = false;
        String last = "";

        for(int i = 0; i < m.length(); i++) {
            if(m.charAt(i) == '[') inSquare = true;
            else if(m.charAt(i) == ']') {
                inSquare = false;
                ii++;
                maxj = jj;
                jj = 0;
            }
            else if(m.charAt(i) == '\'')
                if(inComma) {
                    // We got the number
                    inComma = false;
                    matrix[ii][jj] = Double.parseDouble(last);
                    jj++;
                    last = "";
                }
                else
                    inComma = true;
            else if(m.charAt(i) == ' ' || m.charAt(i) == ',')
                ; // do nothing lolololol
            else
                last += m.charAt(i);
        }

        // some idiot way of converting a big matrix to small matrix
        double[][] actualMat = new double[ii][maxj];

        for(int a=0;a<ii;a++)
            for(int b=0;b<maxj;b++)
                actualMat[a][b] = matrix[a][b];

        return actualMat;
    }
}
