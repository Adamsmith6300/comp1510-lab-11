/**
 * 
 */
package ca.bcit.comp1510.lab11;

/**
 * Playing with matrices.
 * @author adams
 * @version 1.0
 *
 */
public class Matrix {
    /**
     * two dimensional array of ints.
     */
    private int[][] twoD;
    
    /**
     * Main constructor.
     * @param rows 
     * @param columns 
     */
    public Matrix(int rows, int columns) {
        if (rows >= 0 && columns >= 0) {
            this.twoD = new int[rows][columns];
        } else {
            throw new IllegalArgumentException("Must not be negative!");
        }
    }
    /**
     * get the number of rows.
     * @return the number of rows
     */
    public int getRows() {
        return this.twoD.length;
    }
    /**
     * get the number of columns.
     * @return the columns
     */
    public int getColumns() {
        return this.twoD[0].length;
    }
    /**
     * returns a value as specified location.
     * @param row 
     * @param column 
     * @return the value
     */
    public int getValue(int row, int column) {
        return this.twoD[row][column];
    }
    /**
     * sets a value at specified location.
     * @param value 
     * @param row 
     * @param column 
     */
    public void setValue(int value, int row, int column) {
        this.twoD[row][column] = value;
    }
    /**
     * returns two dimensional array formatted accordingly.
     * @return the array.
     */
    public String toString() {
        String s = "";
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                s += this.twoD[i][j] + " ";
            }
            s += "\n";
        }
        System.out.println(s);
        return s;
    }
    /**
     * returns the sum of two matrices.
     * @param m the matrix to add to this matrix.
     * @return the sum
     */
    public Matrix add(Matrix m) {
        if (this.getRows() == m.getRows() 
                && this.getColumns() == m.getColumns()) {
            Matrix result = new Matrix(this.getRows(), this.getColumns());
            for (int i = 0; i < result.getRows(); i++) {
                for (int j = 0; j < this.getColumns(); j++) {
                    result.twoD[i][j] = this.twoD[i][j] + m.twoD[i][j];
                }
            }
            return result;
        } else {
            throw new IllegalArgumentException("these matrices"
                    + " are not equal size");
        }
    }

}
