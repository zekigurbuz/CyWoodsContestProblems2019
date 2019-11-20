import java.io.*;
import java.util.*;
public class JSON_Tristan
{
    public static void main(String[]  args) throws Exception
    {
        new JSON_Tristan().run();
    }
    public void run() throws Exception
    {
        Scanner file = new Scanner(new File("JSON.dat".toLowerCase()));
        TreeMap<String, Object> map = new TreeMap<>();
        while(true)
        {
            String s = file.nextLine();
            if(s.equals("}")) break;
            if(s.matches(".*\".+\":\\s*\\{.*"))
            {
                String key = s.split(":")[0].replaceAll("\"", "");
            }
        }
        System.out.println();
    }
    Object parse(String s)
    {
        s = s.trim();
        if(s.matches("\"[^\"]+\",?"))
        {
            return s.replaceAll(",", "");
        }
        else if(s.matches("[0-9]+,?"))
        {
            return Integer.parseInt(s.replaceAll(",", ""));
        }
        if(s.startsWith("["))
        {
            return null;
        }
        return null;
    }
}
