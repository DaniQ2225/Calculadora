/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author redes
 * @version es la version de prueba
 * @since hoy es 06/02/2023
 */
/*
 * @see Dará fallo
 */
public class Calculadora {

    private int num1;
    private int num2;

    /**
     * @param a primer operador
     * @param b segundo operador
     */
    public Calculadora(int a, int b) {
        num1 = a;
        num2 = b;
    }

    /**
     * @return Devuelve la suma
     */
    public int suma() {
        int result = num1 + num2;
        return result;
    }

    /**
     * @return Devuelve la resta
     */
    public int resta() {
        int result;
        if (resta2()) {
            result = num1 - num2;
        } else {
            result = num2 - num1;
        }
        return result;
    }

    /**
     * @return Devuelve la resta 2
     */
    public boolean resta2() {
        if (num1 > num2) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @return Devuelve la multiplicacion
     */
    public int multiplica() {
        int result = num1 * num2;
        return result;
    }

    /**
     * @return Devuelve la division
     */
    public int divide() {
        int result = num1 / num2;
        return result;
    }

    /**
     * @return Devuelve la division 2
     */
    public Integer divide2() {
        if (num2 == 0) {
            return null;
        }
        int result = num1 / num2;
        return result;
    }

    /**
     * @return Devuelve la suma
     * @throws ArithmeticException si el divisor es cero
     * @exception ArithmeticException si el divisor es cero
     */
    public int divide0() {
        if (num2 == 0) {
            throw new java.lang.ArithmeticException("División por 0");
        } else {
            int result = num1 / num2;
            return result;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora calcu = new Calculadora(20, 10);
        System.out.println(calcu.suma());
    }
    /**
     * @deprecated obsoleto
     */
}
