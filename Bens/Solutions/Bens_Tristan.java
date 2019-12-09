import java.util.*;
import java.io.*;


public class Bens_Tristan { 
	public void run() throws Exception {
		Scanner file = new Scanner(new File("bens.dat"));
		int times = file.nextInt();
		file.nextLine();
        for (int i = 0; i < times; i++) 
        {
            ArrayList<String> s = new ArrayList<>();
            int n = file.nextInt();file.nextLine();
            for(int j=0;j<n;j++) s.add(file.nextLine());
            Collections.sort(s, (a,b) -> {
                String[] x = a.split("\\s+");
                String[] y = b.split("\\s+");
                double ap1 = Double.parseDouble(x[2]);
                double ap2 = Double.parseDouble(y[2]);
                if(ap1 != ap2) return Double.compare(ap1, ap2);
                double r1 = Double.parseDouble(x[4]) - Double.parseDouble(x[3]);
                double r2 = Double.parseDouble(y[4]) - Double.parseDouble(y[3]);
                if(r1 != r2) return Double.compare(r1,r2);
                return Double.compare(Double.parseDouble(x[5]), Double.parseDouble(y[5]));
            });
            String out = "";
            for(String y : s) 
            {
                String[] in = y.split("\\s+");
                out += in[0] + " " + in[1] + ", ";
            }
            System.out.println(out.substring(0,out.length()-2));
        }
		
	}
	public static void main(String[] args) throws Exception {
		new Bens_Tristan().run();
	}
}