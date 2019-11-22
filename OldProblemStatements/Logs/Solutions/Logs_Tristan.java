import java.io.*;
import java.util.*;
public class Logs_Tristan
{
    public static void main(String[]  args) throws Exception
    {
        new Logs_Tristan().run();
    }
    public void run() throws Exception
    {
        Scanner file = new Scanner(new File("logs.dat".toLowerCase()));
        while(file.hasNext())
        {
            String[] s = file.nextLine().split("\\^");
            if(s.length == 1) System.out.printf("%.2f%n", Math.log(Double.parseDouble(s[0])));
            else System.out.printf("%.2f%n", Double.parseDouble(s[1]));
        }
    }
}
