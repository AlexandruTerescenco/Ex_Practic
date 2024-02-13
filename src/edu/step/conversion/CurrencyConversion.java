package edu.step.conversion;

public class CurrencyConversion {
    public double amount;
    private static double exchange_rate = 19.8;

    public CurrencyConversion(double a){amount = a;}

    public void set_Exchange_Rate(double rate){
        exchange_rate = rate;
    }

    public double exchangeToEuro(double amount){
        return amount/exchange_rate;
    };

    public double exchangeToMdl(double amount){
        return amount*exchange_rate;
    };
}

