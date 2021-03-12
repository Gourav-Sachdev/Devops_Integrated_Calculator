package Calculator;

import java.io.IOException;
import org.apache.log4j.Logger;
import java.util.InputMismatchException;
import java.util.Scanner;



public class CalculatorOperations {

    private static final Logger logger=Logger.getLogger(CalculatorOperations.class);

    //add
    public static double addTwoNumbers(double x, double y) {
        logger.info("Adding two numbers " + x + " and " + y);
        double z = 0.0;
        try {
             z = x + y;
            logger.info("Result of addition(log) is " + z);
        } catch (IllegalArgumentException e) {
            System.out.println("Wrong Parameters Passed");
        }
        return z;

    }


    //

    public static double substractTwoNumbers(double x, double y) {
        logger.info("Substracting two numbers " + x + " and " + y);
        double z = 0.0;
        try {
            z = x - y;
            logger.info("Result of Substraction(log) is " + z);
        } catch (IllegalArgumentException e) {
            System.out.println("Wrong Parameters Passed");
        }
        return z;
    }

    //multiply

    public static double multiplyTwoNumbers(double x, double y) {
        logger.info("Multiplying two numbers " + x + " and " + y);
        double z = 0.0;
        try {
            z = x*y;
            logger.info("Result of Multiplication(log) is " + z);
        } catch (IllegalArgumentException e) {
            System.out.println("Wrong Parameters Passed");
        }
        return z;
    }


    //divide

    public static double divideTwoNumbers(double x, double y) {
        double z = 0;
        try {
            logger.info("Dividing two numbers " + x + " and " + y);
            if (x == 0 && y == 0) {
                z = Double.NaN;
                throw new ArithmeticException("Case of NaN 0.0/0.0");
            } else if (x > 0 && y == 0) {
                z = Double.POSITIVE_INFINITY;
                throw new ArithmeticException("Case of Positive Infinity 1.0/0.0");
            } else if (x <= -1 && y == 0) {
                z = Double.NEGATIVE_INFINITY;
                throw new ArithmeticException("Case of Negative Infinity -1.0/0.0");
            } else {
                z = x / y;
            }
        } catch (ArithmeticException error) {
            logger.error("Number cannot be divided by zero(log) " + error.getLocalizedMessage());
        } finally {
            logger.info("Result of dividing(log) is " + z);
        }
        return z;
    }


    public static void main(String[] args) {

        int choice;
        double num1 = 0,num2=0;
        Scanner sc=new Scanner(System.in);

        while(true)
        {
            System.out.println("------Calculator Operation's MENU------");
            System.out.println("1. Addition \n"+
                    "2. Subtraction \n"+
                    "3. Multiplication \n"+
                    "4. Division \n"+
                    "5. Exit \n");
            System.out.println("Please enter your choice :");
            try{
                choice=sc.nextInt();
            }
            catch (InputMismatchException e)
            {
                System.out.println("InputMismatchError");
               return;
            }

            try{
                if(choice<5 && choice>0) {
                    System.out.print("Enter the first number : ");
                    num1=sc.nextDouble();
                    System.out.print("Enter the second number : ");
                    num2=sc.nextDouble();
                }

            }
            catch (InputMismatchException e)
            {
                logger.error("Given Input is not correct");
                return;
            }

            switch (choice)
            {
                case 1:
                    System.out.println("Result of Addition is "+addTwoNumbers(num1,num2));
                    break;
                case 2:
                    System.out.println("Result of Substraction is "+substractTwoNumbers(num1,num2));
                    break;
                case 3:
                    System.out.println("Result of Multiplication is"+multiplyTwoNumbers(num1,num2));
                    break;
                case 4:
                    System.out.println("Result of Division is"+divideTwoNumbers(num1,num2));
                    break;
                default:
                    System.out.println("System Exiting");
                    return;
            }



        }
    }

}