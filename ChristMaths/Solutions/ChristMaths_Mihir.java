import java.io.*;
import java.util.*;

public class ChristMaths_Mihir {
	
	public  void run() throws Exception {
		Scanner file = new Scanner(new File("christmaths.dat"));
		int times = file.nextInt();
		file.nextLine();
		

		for (int i = 0; i < times; i++) {
			String[] cmd = file.nextLine().split("");
			String tempNum="";
			ArrayList<String> nums = new ArrayList<String>();
			for(int x=0;x<cmd.length;x++) {
				if(!cmd[x].equals(" "))
					nums.add(cmd[x]);
				else {
					while(x!=cmd.length) {
						if(cmd[x].equals(" "))
							x++;
						tempNum+=cmd[x]; x++;
					}
					break;
				}
			}
			int num = Integer.parseInt(tempNum);
			int calculateNum = Integer.parseInt(numReplacer(nums).get(0));
			System.out.println(calculateNum==num? "Present for You" :"Coal for You");
			
		}
	}
	
	public static void main(String[] args) throws Exception {
		new ChristMaths_Mihir().run();
	}
	public ArrayList<String> numReplacer(ArrayList<String> numbers) {
		if(numbers.size()==1) {
			return numbers;
		}
		else {
			ArrayList<String> tempArr = new ArrayList<String>();
			tempArr.add(numbers.get(0)); tempArr.add(numbers.get(1)); tempArr.add(numbers.get(2));
			numbers.remove(0); numbers.remove(0);

			switch(tempArr.get(1)){
				case("+"):
					numbers.set(0, ""+(Integer.parseInt(tempArr.get(0))+Integer.parseInt(tempArr.get(2))));
					break;
				case("-"):
					numbers.set(0, ""+(Integer.parseInt(tempArr.get(0)) - Integer.parseInt(tempArr.get(2))));
					break;
				case("/"):
					numbers.set(0, ""+ (Integer.parseInt(tempArr.get(0))/Integer.parseInt(tempArr.get(2))));
					break;
				case("*"):
					numbers.set(0, ""+(Integer.parseInt(tempArr.get(0))*Integer.parseInt(tempArr.get(2))));
					break;
					
			}
			return numReplacer(numbers);
		}
	}
}