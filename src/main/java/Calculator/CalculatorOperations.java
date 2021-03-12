package Calculator;

import java.io.IOException;
import org.apache.log4j.Logger;
import java.util.InputMismatchException;
import java.util.Scanner;



public class CalculatorOperations {

    private static final Logger logger=Logger.getLogger(CalculatorOperations.class);

    //SquareRoot
    public static double findSquareRoot(double x) {
        logger.info("Finding squareroot of Number "+ x);
        double z = 0.0;
        try {
             z=Math.sqrt(x);
            logger.info("Result of square root(log) is " + z);
        } catch (IllegalArgumentException e) {
            System.out.println("Wrong Parameters Passed");
        }
        return z;

    }


    //Factorial

    public static double findFactorial(double x) {
        logger.info("Finding factorial of number "+x);
        double z = 1,i;
        try {

            for (i=2; i<=x; i++)
                    z *= i;

            logger.info("Result of Factorial(log) is " + z);
        } catch (IllegalArgumentException e) {
            System.out.println("Wrong Parameters Passed");
        }
        return z;
    }

    //multiply

    public static double findLog(double x) {
        logger.info("Finding Log of number "+x);
        double z = 0.0;
        try {
            z = Math.log(x);
            logger.info("Result of Natural Log is " + z);
        } catch (IllegalArgumentException e) {
            System.out.println("Wrong Parameters Passed");
        }
        return z;
    }


    //divide

    public static double findPower(double x) {
        logger.info("Finding Power of number "+x);
        double z = 0.0;
        try {
            z = Math.pow(x,4);
            logger.info("Result of Power Function is " + z);
        } catch (IllegalArgumentException e) {
            System.out.println("Wrong Parameters Passed");
        }
        return z;
    }


    public static void main(String[] args) {

        int choice;
        double num1 = 0;
        Scanner sc=new Scanner(System.in);

        while(true)
        {
            System.out.println("------Calculator Operation's MENU------");
            System.out.println("1. Find SquareRoot \n"+
                    "2. Find Factorial \n"+
                    "3. Find Natural Log \n"+
                    "4. Find Power of Number \n"+
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
                    System.out.print("Enter the  number : ");
                    num1=sc.nextDouble();

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
                    System.out.println("Result of SquareRoot is "+findSquareRoot(num1));
                    break;
                case 2:
                    System.out.println("Result of Factorial is "+findFactorial(num1));
                    break;
                case 3:
                    System.out.println("Result of Natural Log is"+findLog(num1));
                    break;
                case 4:
                    System.out.println("Result of Power Function is"+findPower(num1));
                    break;
                default:
                    System.out.println("System Exiting");
                    return;
            }



        }
    }

}