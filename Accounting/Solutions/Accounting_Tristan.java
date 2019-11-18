
import java.util.*;
import java.io.*;


public class Accounting_Tristan { 
    class I implements Comparable<I>
    {
        String name;
        double o;
        int n;
        double tot;
        public int compareTo(I a)
        {
            return name.toLowerCase().compareTo(a.name.toLowerCase());
        }
    }
	public void run() throws Exception {
        Scanner file = new Scanner(new File("accounting.dat"));
        int times = file.nextInt(); file.nextLine();
        TreeMap<String, I> a = new TreeMap<>();
        while(times-->0)
        {
            String s = file.next();
            double d = Double.parseDouble(file.next().replaceAll("\\$",""));
            file.nextLine();
            I i = new I();
            i.name = s;
            i.o = d;
            a.put(s,i);
        }
        while(file.hasNext())
        {
            file.next();
            int n = file.nextInt();
            String s = file.next(); 
            a.get(s).n += n;
        }
        for(String s : a.keySet())
        {
            I i = a.get(s);
            i.tot = i.n * i.o;
        }
        Collection<I> e = a.values();
        List<I> set = new ArrayList<>();
        set.addAll(e);
        Collections.sort(set);
        double tot = 0;
        System.out.println("Item              Profit");
        for(I i : set)
        {
            System.out.printf("%-18s$%.2f%n",i.name,i.tot);
            tot += i.tot;
        }
        System.out.printf("%-18s$%.2f%n","Total",tot);
	}
	public static void main(String[] args) throws Exception {
		new Accounting_Tristan().run();
	}
}