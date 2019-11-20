import java.io.*;
import java.util.*;

import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
public class JSON_Tristan
{
    public static void main(String[]  args) throws Exception
    {
        new JSON_Tristan().run();
    }
    public void run() throws Exception
    {
        Scanner file = new Scanner(new File("JSON.dat".toLowerCase()));
        ScriptEngine s = new ScriptEngineManager().getEngineByName("javascript");
        String json = "";
        String a = file.nextLine();
        while(!a.trim().equals("}"))
        {
            json += a ;
            a = file.nextLine();
        }
        json += a;
        while(file.hasNext())
        {
            String t[] = file.nextLine().split("\\s+");
            String query = "";
            for(String r : t)
            {
                if(r.matches("[0-9]+")) query += "[" + Integer.parseInt(r) + "]";
                else query += "." + r;
            }
            s.eval("print(" + json + query +")");
        }
    }
}
