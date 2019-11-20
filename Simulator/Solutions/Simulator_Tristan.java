import java.io.*;
import java.util.*;
public class Simulator_Tristan
{
    public static void main(String[]  args) throws Exception
    {
        new Simulator_Tristan().run();
    }
    public void run() throws Exception
    {
        Scanner file = new Scanner(new File("Simulator.dat".toLowerCase()));
        int n = file.nextInt(); file.nextLine();
        while(n-->0)
        {
            double d1 = file.nextDouble();
            d1 += file.nextDouble();
            d1 += file.nextDouble();
            double d2 = file.nextDouble();
            d1 /= 3;
            System.out.printf("%.2f%%%n",100 * Math.abs(d1/d2-1));
        }
    }
}
