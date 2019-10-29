import java.io.*;
import java.util.*;

public class Example_Runtime
{
    public static void main(String[] args) throws Exception
    {
        new Example_Runtime().run();
    }
    public void run() throws Exception
    {
        Scanner file = new Scanner(new File("doesnt exist.dat"));
        while(file.hasNext()) System.out.println(file.nextLine());
    }
}
