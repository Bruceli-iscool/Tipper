import java.util.Scanner;

public class t 
{
    public static void main(String args[]) 
    {
        if (args.length < 1) 
        {
            Tipper t = new Tipper();
            System.out.println(t.calculate());
        }  
        else if (args.length > 1) {
            
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