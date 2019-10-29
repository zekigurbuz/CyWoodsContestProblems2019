import java.io.*;
import java.util.*;

public class Example_Tristan
{
    public static void main(String[] args) throws Exception
    {
        new Example_Tristan().run();
    }
    public void run() throws Exception
    {
        Scanner file = new Scanner(new File("example.dat"));
        while(file.hasNext()) System.out.println(file.nextLine());
    }
}
