/**
 * 
 */
package ca.bcit.comp1510.lab11;

/**
 * Tests the matrix class.
 * @author adams
 * @version 1.0
 *
 */
public class MatrixDriver {

    /**
     * Drives the program.
     * @param args 
     */
    public static void main(String[] args) {
        final int three = 3;
        
        Matrix m1 = new Matrix(2, 2);
        Matrix m2 = new Matrix(2, 2);
        int count = 2;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                m1.setValue(count, i, j);
                m2.setValue(count - 1, i, j);
                count++;
            }
        }
        m1.toString();
        m2.toString();
        Matrix m3 = m1.add(m2);
        m3.toString();
        Matrix m4 = new Matrix(2, three);
        count = 1;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < three; j++) {
                m4.setValue(count, i, j);
                count++;
            }
        }
        m4.toString();
        try {
            Matrix m5 = m3.add(m4);
            System.out.println(m5.toString());
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }

}
