import java.io.*;
import java.util.*;
public class Written_Tristan
{
    public static void main(String[]  args) throws Exception
    {
        new Written_Tristan().run();
    }
    public void run() throws Exception
    {
        Scanner file = new Scanner(new File("Written.dat".toLowerCase()));
        HashSet<Integer> pos = new HashSet<Integer>();
        for(int i=0;i<=40;i++)
        {
            for(int j=0;j<=40;j++)
            {
                if(i+j<=40) pos.add(i * 6 + j * -2);
            }
        }
        int times = file.nextInt();
        while(times-->0)
        {
            System.out.println(pos.contains(file.nextInt()) ? "Possible" : "Impossible");
        }
    }
}
