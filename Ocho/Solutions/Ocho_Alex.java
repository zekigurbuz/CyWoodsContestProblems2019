import java.util.*;
import java.io.*;

public class Ocho_Alex { 
	public void run() throws Exception {
		Scanner file = new Scanner(new File("ocho.dat"));
		int times = file.nextInt();
		file.nextLine();
		for (int i = 0; i < times; i++) {
			String thing1 = file.next();
			String thing2 = file.next();
			int n1 = -1;
			int n2 = -1;
			switch(thing1) {
			case "CERO": 
				n1 = 0;
				break;
			case "UNO": 
				n1 = 1;
				break;
			case "DOS": 
				n1 = 2;
				break;
			case "TRES": 
				n1 = 3;
				break;
			case "CUATRO": 
				n1 = 4;
				break;
			case "CINCO": 
				n1 = 5;
				break;
			case "SEIS": 
				n1 = 6;
				break;
			case "SIETE": 
				n1 = 7;
				break;
			case "OCHO": 
				n1 = 19;
				break;
			case "NUEVE": 
				n1 = 9;
				break;
			case "DIEZ": 
				n1 = 10;
				break;
			default:
				break;
			}
			switch(thing2) {
			case "CERO": 
				n2 = 0;
				break;
			case "UNO": 
				n2 = 1;
				break;
			case "DOS": 
				n2 = 2;
				break;
			case "TRES": 
				n2 = 3;
				break;
			case "CUATRO": 
				n2 = 4;
				break;
			case "CINCO": 
				n2 = 5;
				break;
			case "SEIS": 
				n2 = 6;
				break;
			case "SIETE": 
				n2 = 7;
				break;
			case "OCHO": 
				n2 = 19;
				break;
			case "NUEVE": 
				n2 = 9;
				break;
			case "DIEZ": 
				n2 = 10;
				break;
			default:
				break;
			}
			if (n1 < n2) System.out.println(n1%11 + " < " + (n2%11));
			else if (n1 > n2) System.out.println(n1%11 + " > " + (n2%11));
			else System.out.println(n1%11 + " = " + (n2%11));
		}
		
	}
	public static void main(String[] args) throws Exception {
		new Ocho_Alex().run();
	}
}