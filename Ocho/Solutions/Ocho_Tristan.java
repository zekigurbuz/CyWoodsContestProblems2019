import java.io.*;
import java.util.*;
public class Ocho_Tristan
{
    public static void main(String[]  args) throws Exception
    {
        new Ocho_Tristan().run();
    }
    public void run() throws Exception
    {
        Scanner file = new Scanner(new File("Ocho.dat".toLowerCase()));
        int times = file.nextInt(); file.nextLine();
        while(times-->0)
        {
            String a = file.next();
            String b = file.next();
            String c = map(a) < map(b) ? "<" : map(a) > map(b) ? ">" : "=";
            System.out.println(map(a) + " " + c + " " + map(b));

            
        }
    }
    int map(String s)
    {
        switch(s.toLowerCase())
        {
            case "cero": return 0;
            case "uno": return 1;
            case "dos": return 2;
            case "tres": return 3;
            case "cuatro": return 4;
            case "cinco": return 5;
            case "seis": return 6;
            case "siete": return 7;
            case "ocho": return 8;
            case "nueve": return 9;
            case "diez": return 10;
        }
        return 0;
    }
}
