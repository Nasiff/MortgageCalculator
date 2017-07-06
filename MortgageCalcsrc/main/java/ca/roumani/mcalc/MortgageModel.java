package ca.roumani.mcalc;

import java.io.PrintStream;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Created by user on 1/24/17.
 */
public class MortgageModel
{
    private double principle;
    private int amortization;
    private double interest;

    public MortgageModel(String p, String a, String i)
    {
        this.principle = Double.parseDouble(p);
        this.amortization = (Integer.parseInt(a)) * 12;
        this.interest = (Double.parseDouble(i) / 1200);
    }

    public String getMortgage()
    {
        Double temp = (this.amortization * (this.amortization - 1) * this.interest * this.interest ) / 2;
        System.out.println(temp);

        temp = temp + 1 + this.amortization * this.interest;
        System.out.println(temp);

        temp = 1 / temp;
        System.out.println(temp);

        temp = 1 - temp;
        System.out.println(temp);

        temp = (this.interest * this.principle) / temp;
        System.out.println(temp);

        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String mortgage = formatter.format(temp);
        System.out.println(temp);

        return mortgage;

    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        PrintStream output = System.out;

        MortgageModel test = new MortgageModel("700000", "25","2.75");
        String answer = test.getMortgage();
        output.println(answer);



    }

}
