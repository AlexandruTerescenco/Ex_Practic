import edu.step.math.Calculator;
import edu.step.conversion.CurrencyConversion;
import edu.step.oop.Product;

import java.util.Scanner;

import static java.lang.System.out;
public class Main {
    public static void main(String[] args) {
        Calculator cl = new Calculator(6, 3);
        Calculator cl_2 = new Calculator(2.5, 2);
        Calculator Mult = new Calculator(3);

        out.println("Set 1");
        out.println(cl.add(cl.num1, cl.num2));
        out.println(cl.subtract(cl.num1, cl.num2));
        out.println(cl.multiply(cl.num1, cl.num2));
        out.println(cl.divide(cl.num1, cl.num2));

        out.println("\nSet 2");
        out.println(cl_2.add(cl_2.d_num1, cl_2.d_num2));
        out.println(cl_2.subtract(cl_2.d_num1, cl_2.d_num2));
        out.println(cl_2.multiply(cl_2.d_num1, cl_2.d_num2));
        out.println(cl_2.divide(cl_2.d_num1, cl_2.d_num2));

        out.println("\ntabela inmultire");
        Mult.table_Multiply(Mult.num1);

        out.println("\nsuma numere");
        out.println(Mult.adder(3));


        Scanner val = new Scanner(System.in);
        double rate;

        CurrencyConversion Euro = new CurrencyConversion(1);
        CurrencyConversion Mdl = new CurrencyConversion(20);

        //Euro.set_Exchange_Rate(val.nextDouble());

        out.println("\nEuro-Mdl");
        out.println(Euro.exchangeToMdl(Euro.amount));

        out.println("\nMdl-Euro");
        out.println(Mdl.exchangeToEuro(Mdl.amount));

        Product p = new Product("11", "pro", 23, 34);

        out.println(p.get_price());
        p.set_quantity(val.nextInt());
    }
}