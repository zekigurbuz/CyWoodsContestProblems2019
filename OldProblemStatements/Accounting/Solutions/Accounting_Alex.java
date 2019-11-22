import java.util.*;
import java.io.*;

class Item implements Comparable<Item> {
	String name;
	double cost;
	int tabs;
	int quantity;
	public Item(String n, double c) {
		name = n;
		cost = c;
		tabs = 18-(n.length());
		quantity = 0;
	}
	public void increment(int q) {
		quantity += q;
	}
	public int compareTo(Item a) {
		return name.toLowerCase().compareTo(a.name.toLowerCase());
	}
	public String toString() {
		String n = name + "";
		for (int i = 0; i < tabs; i++) {
			n += " ";
		}
		n += "$";
		n += String.format("%.2f", cost * quantity);
		return n;
	}
}

public class Accounting_Alex { 
	public void run() throws Exception {
		Scanner file = new Scanner(new File("accounting.dat"));
		int times = file.nextInt();
		file.nextLine();
		List<Item> items = new ArrayList<>();
		for (int asdf = 0; asdf < times; asdf++) {
			String[] a = file.nextLine().split(" ");
			items.add(new Item(a[0], Double.parseDouble(a[1].substring(1))));
		}
		double total = 0.0;
		while (file.hasNext()) {
			String[] q = file.nextLine().split(" ");
			for (Item i: items) {
				if (i.name.equals(q[2])) {
					i.increment(Integer.parseInt(q[1]));
				}
			}
		}
		Collections.sort(items);
		System.out.println("Item              Profit");
		for (Item i: items) {
			System.out.println(i);
		}
		double x = 0.0;
		for (Item i: items) {
			x += i.cost * i.quantity;
		}
		System.out.print("Total             $");
		System.out.printf("%.2f", x);
	}
	public static void main(String[] args) throws Exception {
		new Accounting_Alex().run();
	}
}