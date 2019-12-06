import java.io.*;
import java.util.*;

public class Ocho_Mihir {
	public static void main(String[] args) throws Exception {
		new Ocho_Mihir().run();
	}

	public void run() throws Exception {
		Scanner file = new Scanner(new File("ocho.dat"));
		int times = file.nextInt();
		file.nextLine();
		for (int i = 0; i < times; i++) {
			String[] nums = file.nextLine().split(" ");
			for(int x=0;x<nums.length-1;x++) {
				int number = spanishToEnglish(nums[x]);
				int number2 = spanishToEnglish(nums[x+1]);
				if(number==8) {
					if(number==number2) 
						System.out.println(number + " = " + number2);
					else System.out.println(number+ " > " + number2);
				}
				else if(number2==8) {
					if(number==number2)
						System.out.println(number + " = " + number2); 
					else System.out.println(number+ " < " + number2);
				}
				else {
					if(number>number2)
						System.out.println(number+ " > " + number2);
					else if(number<number2) 
						System.out.println(number+ " < " + number2);
					else System.out.println(number2+ " = " + number);
				}
			}
			
		}
	}
	public int spanishToEnglish(String s) {
		switch(s) {
			case("UNO"):
				return 1;
			case("DOS"):
				return 2;
			case("TRES"):
				return 3;
			case("CUATRO"):
				return 4;
			case("CINCO"):
				return 5;
			case("SEIS"):
				return 6;
			case("SIETE"):
				return 7;
			case("OCHO"):
				return 8;
			case("NUEVE"):
				return 9;
			case("DIEZ"):
				return 10;
			default:
				return 0;
		}
			
	}
}