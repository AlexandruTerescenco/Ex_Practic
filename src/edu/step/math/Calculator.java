package edu.step.math;

import static java.lang.System.out;

public class Calculator {
    public int num1,num2;
    public double d_num1,d_num2;

    public Calculator(int a, int b){num1 = a; num2 = b;}
    public Calculator(int a){num1 = a;}

    public Calculator(double a, double b){d_num1 = a; d_num2 = b;}

    public int add(int a, int b){return a+b;}

    public int subtract (int a, int b){return a-b;}

    public int multiply (int a, int b){return a*b;}

    public double divide (int a, int b){return (double)a/b;}

    public double add(double a, double b){return a+b;}

    public double subtract (double a, double b){return a-b;}

    public double multiply (double a, double b){return a*b;}

    public double divide (double a, double b){return (double)a/b;}


    public void table_Multiply(int a){
        for (int i = 1; i < 11; i++){
            out.println(a*i);
        }
    }

    public int adder(int a){
        int b = 0;
        for (int i = 0; i < a+1; i++){
            b += i;
        }
        return b;
    }
}
