import java.io.*;
import java.util.*;
public class ChristMaths_Tristan
{
    public static void main(String[]  args) throws Exception
    {
        new ChristMaths_Tristan().run();
    }
    public void run() throws Exception
    {
        Scanner file = new Scanner(new File("ChristMaths.dat".toLowerCase()));
        int times = file.nextInt(); file.nextLine();
        while(times-->0)
        {
            String[] vals = file.next().split("(?<=[0-9])(?=[+*/-])|(?<=[+*/-])(?=[0-9])");
            long cor = file.nextLong();
            long ans = Long.parseLong(vals[0]);
            String last = null;
            for(int i=1;i<vals.length;i++)
            {
                if(!vals[i].matches("[0-9]+")) last = vals[i];
                else
                {
                    long l = Long.parseLong(vals[i]);
                    switch(last)
                    {
                        case "+": ans += l; break;
                        case "*": ans *= l; break;
                        case "-": ans -= l; break;
                        case "/": ans /= l; break;
                    }
                }
            }
            System.out.println(ans == cor ? "Present for You" : "Coal for You");
        }
    }
}
