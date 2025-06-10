import java.lang.constant.Constable;

public class Matrix {
    private int rows =1;
    private int columns = 1;
    private double[][] matrix = new double[rows][columns];
    public void Matrix (double[][]x){
        matrix = x;
        rows = matrix.length;
        columns = matrix[0].length;
    }
    public void Matrix(int r, int c){
        matrix = new double [r][c];
        rows = r;
        columns = c;
    }
    public String toString(Object o){
        String s = null;
        for (int r=0; r< rows;r++){
            s=s+"\n";
          for (int c=0; c< columns; c++){
              s=s+(matrix[r][c] +  "    ");
          }
        }
        return s;
    }
    public int numRows(){
        return rows;
    }
    public int numColumns(){
        return columns;
    }
    public double getElement(int r, int c){
        return matrix[r][c];
    }
    public void setElement(int r, int c, double value){
        matrix [r][c] = value;
    }
    public double[][] sum (double[][] a, double[][] b){
        double[][] newMatrix = new double[rows][columns];
        for (int i=0;i< matrix.length-1;i++){
            for (int j = 0; j<matrix[0].length-1;i++){
                newMatrix[i][j]= a[i][j] +b[i][j];
            }
        }
        return newMatrix;
    }
    public double[][] product (double[][] a, double[][] b){
        double[][] newMatrix = new double[rows][columns];
        for (int i=0;i< matrix.length-1;i++){
            for (int j = 0; j<matrix[0].length-1;i++){
                newMatrix[i][j]= a[i][j] *b[i][j];
            }
        }
        return newMatrix;
    }
    public double[][] subMatrix(double deletedR, double deletedC){
        if (rows>1 && columns>1){
            double[][] newMatrix = new double[rows-1][columns-1];
            for (int i=0; i< matrix.length-1;i++){
                for (int j=0; j<matrix[0].length-1;j++){
                    if (j==deletedC){
                        for (int q = j; q < matrix[0].length - 1; q++)
                            matrix[i][q] = matrix[i][q + 1];
                    }
                    if (i==deletedR){
                        for (int q = i; q < matrix.length - 1; q++)
                            matrix[q][j] = matrix[q+1][j];
                    }
                }
            }
            rows--;
            columns--;
            return newMatrix;
        }
        else {
            return null;
        }
    }
    public Double determinant(double[][] doubles) {
        if (rows == columns) {
            if (rows >= 3) {
                double entry = 0;
                double cofactor = 0;
                double d = 0;
                for (double i = 0; i < matrix[0].length - 1; i++) {
                    entry = matrix[0][(int) i];
                    cofactor = (Math.pow(-1, 1 * i)) * determinant(subMatrix(0, i));
                    d = d + entry * cofactor;
                }
                return d;
            } else if (rows == 2) {
                double d = matrix[0][0]*matrix[1][1] - (matrix [0][1]*matrix[1][0]);
                return d;
            }

        } else
            return null;
        return null;
    }

    }
