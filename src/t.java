import java.util.Scanner;

public class t 
{
    public static void main(String args[]) 
    { 
        try 
        {
            if (args.length < 1) 
            {
                Tipper t = new Tipper();
                System.out.println(t.calculate());
            }  
            else if (args.length > 1) 
            {
                double z = Double.parseDouble(args[0]);
                double y = Double.parseDouble(args[1]);
                Tipper t = new Tipper(z, y);
                System.out.println(t.calculate());
            } 
            else
            {
                    System.out.println("    Tipper Copyright (C) 2024  Bruce Li\r\n" + //
                                                "    This program comes with ABSOLUTELY NO WARRANTY;\r\n" + //
                                                "    This is free software, and you are welcome to redistribute it\r\n" + //
                                                "    under certain conditions;");
            }

        } catch (Exception e) 
        {
            System.err.println(e);
        }
    };
};

class Tipper {
    double m, p;
    public Tipper() 
    {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter pre-tip total: ");
            m = input.nextDouble();
            System.out.println("Enter tip percentage in decimal form: ");
            p = input.nextDouble();
        }
    }
    public Tipper(double z, double y) 
    {
        m = z;
        p = y;
    } 
    public double calculate() 
    {
        return m + m*p;
    }
}