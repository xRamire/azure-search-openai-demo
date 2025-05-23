/**
 * Calculator class provides basic arithmetic operations.
 */
public class Calculator {

    /**
     * Adds two numbers.
     * @param a the first number
     * @param b the second number
     * @return the sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts one number from another.
     * @param a the number to subtract from
     * @param b the number to subtract
     * @return the difference of a and b
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two numbers.
     * @param a the first number
     * @param b the second number
     * @return the product of a and b
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides one number by another.
     * @param a the dividend
     * @param b the divisor
     * @return the quotient of a and b
     * @throws ArithmeticException if b is zero
     */
    public int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
}
