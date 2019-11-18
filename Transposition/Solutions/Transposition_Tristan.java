
import java.util.*;
import java.io.*;

public class Transposition_Tristan {
    static String[] up = "A|A#|B|C|C#|D|D#|E|F|F#|G|G#".split("\\|");
    static String[] down = "A|Bb|B|C|Db|D|Eb|E|F|Gb|G|Ab".split("\\|");

    public void run() throws Exception {
        Scanner file = new Scanner(new File("transposition.dat"));
        int times = file.nextInt();
        file.nextLine();
        while (times-- > 0) {
            String[] notes = file.nextLine().split("\\s+");
            int shift = file.nextInt();
            if(file.hasNext()) file.nextLine();
            for (int i = 0; i < notes.length; i++) {
                if (shift > 0) {
                    int j = 0;
                    for (int q = 0; q < up.length; q++)
                        if (up[q].equals(notes[i]))
                            j = q;
                    j += shift;
                    while(j >= up.length) j -= up.length;
                    notes[i] = up[j];
                }
                else if (shift <= 0) {
                    int j = 0;
                    for (int q = 0; q < down.length; q++)
                        if (down[q].equals(notes[i]))
                            j = q;
                    j += shift;
                    while(j < 0) j += up.length;
                    notes[i] = down[j];
                }
            }
            String out = "";
            for(int i=0;i<notes.length;i++)
            {
                out += notes[i] + " ";
            }
            System.out.println(out.trim());
        }
    }

    public static void main(String[] args) throws Exception {
        new Transposition_Tristan().run();
    }
}