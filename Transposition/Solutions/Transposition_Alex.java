import java.util.*;
import java.io.*;

class Note {
	public String note;
	public Note prev;
	public Note next;
	public Note(String val) {
		note = val;
	}
}

// Avert thine eyes, spaghetti code ahead!

public class Transposition_Alex { 

	public void run() throws Exception {
		Note up = new Note("A");
		up.prev = new Note("G#");
		up.prev.prev = new Note("G");
		up.prev.prev.prev = new Note("F#");
		up.prev.prev.prev.prev = new Note("F");
		up.prev.prev.prev.prev.prev = new Note("E");
		up.prev.prev.prev.prev.prev.prev = new Note("D#");
		up.prev.prev.prev.prev.prev.prev.prev = new Note("D");
		up.prev.prev.prev.prev.prev.prev.prev.prev = new Note("C#");
		up.prev.prev.prev.prev.prev.prev.prev.prev.prev = new Note("C");
		up.prev.prev.prev.prev.prev.prev.prev.prev.prev.prev = new Note("B");
		up.prev.prev.prev.prev.prev.prev.prev.prev.prev.prev.prev = new Note("A#");
		up.prev.prev.prev.prev.prev.prev.prev.prev.prev.prev.prev.prev = up;
		up.next = up.prev.prev.prev.prev.prev.prev.prev.prev.prev.prev.prev;
		up.next.next = up.prev.prev.prev.prev.prev.prev.prev.prev.prev.prev;
		up.next.next.next = up.prev.prev.prev.prev.prev.prev.prev.prev.prev;
		up.next.next.next.next = up.prev.prev.prev.prev.prev.prev.prev.prev;
		up.next.next.next.next.next = up.prev.prev.prev.prev.prev.prev.prev;
		up.next.next.next.next.next.next = up.prev.prev.prev.prev.prev.prev;
		up.next.next.next.next.next.next.next = up.prev.prev.prev.prev.prev;
		up.next.next.next.next.next.next.next.next = up.prev.prev.prev.prev;
		up.next.next.next.next.next.next.next.next.next = up.prev.prev.prev;
		up.next.next.next.next.next.next.next.next.next.next = up.prev.prev;
		up.next.next.next.next.next.next.next.next.next.next.next = up.prev;
		up.next.next.next.next.next.next.next.next.next.next.next.next = up;
		Note down = new Note("A");
		down.prev = new Note("Ab");
		down.prev.prev = new Note("G");
		down.prev.prev.prev = new Note("Gb");
		down.prev.prev.prev.prev = new Note("F");
		down.prev.prev.prev.prev.prev = new Note("E");
		down.prev.prev.prev.prev.prev.prev = new Note("Eb");
		down.prev.prev.prev.prev.prev.prev.prev = new Note("D");
		down.prev.prev.prev.prev.prev.prev.prev.prev = new Note("Db");
		down.prev.prev.prev.prev.prev.prev.prev.prev.prev = new Note("C");
		down.prev.prev.prev.prev.prev.prev.prev.prev.prev.prev = new Note("B");
		down.prev.prev.prev.prev.prev.prev.prev.prev.prev.prev.prev = new Note("Bb");
		down.prev.prev.prev.prev.prev.prev.prev.prev.prev.prev.prev.prev = down;
		down.next = down.prev.prev.prev.prev.prev.prev.prev.prev.prev.prev.prev;
		down.next.next = down.prev.prev.prev.prev.prev.prev.prev.prev.prev.prev;
		down.next.next.next = down.prev.prev.prev.prev.prev.prev.prev.prev.prev;
		down.next.next.next.next = down.prev.prev.prev.prev.prev.prev.prev.prev;
		down.next.next.next.next.next = down.prev.prev.prev.prev.prev.prev.prev;
		down.next.next.next.next.next.next = down.prev.prev.prev.prev.prev.prev;
		down.next.next.next.next.next.next.next = down.prev.prev.prev.prev.prev;
		down.next.next.next.next.next.next.next.next = down.prev.prev.prev.prev;
		down.next.next.next.next.next.next.next.next.next = down.prev.prev.prev;
		down.next.next.next.next.next.next.next.next.next.next = down.prev.prev;
		down.next.next.next.next.next.next.next.next.next.next.next = down.prev;
		down.next.next.next.next.next.next.next.next.next.next.next.next = down;
		
		Scanner file = new Scanner(new File("transposition.dat"));
		int times = file.nextInt();
		file.nextLine();
		for (int asdf = 0; asdf < times; asdf++) {
			String[] notes = file.nextLine().split(" ");
			int trans = Integer.parseInt(file.nextLine());
			
			String[] newNotes = new String[notes.length];
			if (trans == 0) printArray(notes);
			else if (trans > 0) {
				for (int i = 0; i < notes.length; i++) {
					while(!(up.note.equals(notes[i]))) up = up.next;
					for (int j = 0; j < trans; j++) {
						up = up.next;
					}
					newNotes[i] = up.note;
				}
			}
			else {
				for (int i = 0; i < notes.length; i++) {
					while(!(down.note.equals(notes[i]))) down = down.next;
					for (int j = 0; j < Math.abs(trans); j++) {
						down = down.prev;
					}
					newNotes[i] = down.note;
				}
			}
			printArray(newNotes);
		}
	}
	public void printArray(String[] a) {
		for (String x: a) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) throws Exception {
		new Transposition_Alex().run();
	}
}