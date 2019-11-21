import java.io.*;
import java.util.*;
public class Portmanteau_Tristan
{
    public static void main(String[]  args) throws Exception
    {
        new Portmanteau_Tristan().run();
    }
    public void run() throws Exception
    {
        Scanner file = new Scanner(new File("Portmanteau.dat".toLowerCase()));
        int times = file.nextInt(); file.nextLine();
        while(times-->0)
        {
            String a = file.next();
            String b = file.next();
            String c = file.next();
            boolean works = false;
            for(int i=0;i<b.length() && !works;i++)
            {
                for(int j=0;j<c.length() && !works;j++)
                {
                    if((b.substring(0,i) + c.substring(j)).equals(a)) works = true;
                }
            }
            for(int i=0;i<c.length() && !works;i++)
            {
                for(int j=0;j<b.length() && !works;j++)
                {
                    if((c.substring(0,i) + b.substring(j)).equals(a)) works = true;
                }
            }
            System.out.println(works ? "YES" : "NO");
        }
    }
}
