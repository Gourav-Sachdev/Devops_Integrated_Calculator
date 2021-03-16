

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;




public class CalculatorOperationTest {

    @BeforeClass  public static void printBefore(){
        System.out.println("Before Testing Begins");
    }


    private static final double DELTA = 1e-15;
    CalculatorOperations calculatoroperations=new CalculatorOperations();




    @Test
    public void factorialTruePositive() {

        assertNotEquals("Factorial test for false positive",0,calculatoroperations.findFactorial(1));
        assertEquals("Factorial test for true positive",1,calculatoroperations.findFactorial(1),DELTA);
        assertEquals("Factorial test for true positive",5040,calculatoroperations.findFactorial(7),DELTA);
    }

    @Test
    public void factorialFalsePositive() {
        assertNotEquals("Factorial of the number for False Positive ",0,calculatoroperations.findFactorial(0));

    }
    @Test
    public void squareRootTruePositive() {
        assertEquals("Factorial test for false positive",0.0,calculatoroperations.findSquareRoot(0),DELTA);
        assertEquals("Square Root of the number for True Positive",1.0,calculatoroperations.findSquareRoot(1),DELTA);
        assertEquals("Square Root of the number for True Positive",5.0,calculatoroperations.findSquareRoot(25),DELTA);

    }
    @Test
    public void squareRootFalsePositive() {
        assertNotEquals("Square Root of the number for False Positive ",1,calculatoroperations.findSquareRoot(0));
        assertNotEquals("Square Root of the number for False Positive",-2,calculatoroperations.findSquareRoot(2));
        assertNotEquals("Square Root of the number for False Positive",5,calculatoroperations.findSquareRoot(2));

    }
    @Test
    public void logarithmTruePositive() {
        assertEquals("Logarithm of the number for True Positive ",0.0,calculatoroperations.findLog(1),DELTA);
           }
    @Test
    public void powerFunctionTruePositive() {
        assertEquals("Power of the number for True Positive ",16.0,calculatoroperations.findPower(2),DELTA);
        assertEquals("Power of the number for True Positive",1.0,calculatoroperations.findPower(1),DELTA);

    }
    @Test
    public void powerFunctionFalsePositive() {
        assertNotEquals("Power of the number for false Positive ",3,calculatoroperations.findPower(0));
        assertNotEquals("Power of the number for false Positive",2,calculatoroperations.findPower(0));
    }


    @AfterClass   public static void printAfter(){
        System.out.println("After Testing Begins");
    }

}
