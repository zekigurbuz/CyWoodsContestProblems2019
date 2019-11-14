import java.util.*;
import java.io.*;
import java.util.function.*;
import java.util.stream.*;

public class written {
    public static void main(String[] args) throws Exception {
        new written().run();
    }

    public String printStream(Stream<Integer> s) {
        return s.reduce("", (String a, Integer b) -> a.toString() + ", " + b.toString(),
                (String a, String b) -> a.toString() + ", " + b.toString());
    }

    public void run() throws Exception {
        q1_24();
        q25_40();
    }

    public void q1_24() throws Exception {
        System.out.println("Question 2");
        System.out.println((2 - 3) * 2 % 3);
        System.out.println("Question 3");
        System.out.printf("%-7.3s|%.1f", "123.30", 3.0);
        System.out.println();
        System.out.println("Question 4");
        String s = "123 abc 123 baby you and MEEE";
        System.out.println(s.toLowerCase());
        System.out.println("Question 5");
        int[] a = new int[5];
        a[3] = a[4] = a[1] = 2;
        System.out.println(Arrays.toString(a));
        System.out.println("Question 6");
        int alamo = 3;
        int texas = 11;
        texas /= alamo + 1;
        System.out.println(texas - alamo);
        System.out.println("Question 7");
        boolean p = true;
        boolean q = true;
        System.out.println((!p && !q) == !(p || q));
        System.out.println("Question 8");
        int abc = 123;
        if (abc % 10 == 3)
            System.out.print(1);
        if (abc % 100 == 1)
            System.out.println(2);
            System.out.println(3);
        System.out.println("Question 9");
        class Thing {
            int val;
            Thing thong;
            Thing thang;

            Thing(int a) {
                val = a;
                if (a > 0) {
                    thong = new Thing(a - 1);
                    thang = new Thing(a - 2);
                }
            }

            public String toString() {
                return thong.val + " " + val + " " + thang.val;
            }
        }
        System.out.println(new Thing(4));
        System.out.println("Question 10");
        Object e = new Thing(3);
        System.out.println(e.toString());
        System.out.println("Question 11");
        int n = 63;
        int m = 64;
        System.out.println(m << 2 & n);
        System.out.println("Question 12");
        // Order of Precedence
        // * ++ (cast) <<
        System.out.println("Question 13");
        System.out.println(Double.SIZE);
        System.out.println("Question 14");
        double d = 123.3;
        double d2 = Math.floor(d);
        double d3 = Math.ceil(d);
        System.out.println(d3 - d);
        System.out.println("Question 15");
        ArrayList<Long> ll = new ArrayList<>();
        for (int i = 1; i <= 7; i += 2)
            ll.add((long) i);
        for (int i = 3; i >= 0; i--)
            ll.set(i, ll.get(ll.size() - i - 1));
        System.out.println(ll);
        System.out.println("Question 16");
        Integer aa = 200;
        int b = 200;
        System.out.println(aa == b);
        System.out.println(aa.compareTo(b));
        System.out.println("Question 17");
        String mess = "123^456^789-1";
        System.out.println(mess.split("[^-]").length);
        System.out.println("Question 18");
        String name = "Bobby Billy Jenkins";
        char[] out = new char[4];
        int num = 0;
        Arrays.fill(out, 'a');
        for (char c : name.toCharArray())
            if (c > 95)
                out[num++ % out.length] += 1;
        System.out.println(Arrays.toString(out) + " - " + num);
        System.out.println("Question 19");
        ArrayList<String> al = new ArrayList<>();
        al.add("1");
        al.add("A");
        al.add("@");
        al.add("{");
        Iterator it = al.iterator();
        while (it.hasNext())
            System.out.println(it.next());
        System.out.println("Question 20");
        // What is the best case runtime of an inserton sort
        System.out.println("Question 21");
        long l = 3;
        while (l < 200) {
            System.out.print((l *= 2) + ", ");
        }
        System.out.println();
        System.out.println("Question 22");
        LinkedList<Integer> y = new LinkedList<>();
        y.add(3);
        y.add(2);
        y.add(5);
        y.add(0);
        y.add(9);
        Collections.sort(y, Collections.reverseOrder());
        System.out.println(y);
        System.out.println("Question 23");
        System.out.printf("%+.03f", 192.0);
        System.out.println();
        System.out.println("Question 24");
        int result = -1;
        switch (result) {
        case -1:
            result += 3;
            break;
        case 2:
            result *= -1;
        case 3:
            result++;
        }
        System.out.println(result);
    }

    public void q25_40() throws Exception {
        System.out.println("Question 25");
        try {
            IntStream a = IntStream.of(1, 2, 3, 4, 5);
            int i = a.map(x -> x * 2).sum();
            int j = a.map(x -> x * 3).sum();
            System.out.println(i + " - " + j);
        } catch (Exception e) {
            System.out.println("Runtime Error");
        }
        System.out.println("Question 26");
        Stream<Integer> s = Stream.of(1, 7, 2, 3, 6, 9, 5);
        Function<Integer, Integer> a = x -> x * 2;
        Predicate<Integer> b = x -> x % 3 == 1;
        Function<Integer, Integer> c = x -> x + 1;
        System.out.println(s.map(c.compose(a)).distinct().filter(b).reduce((x, y) -> x ^ y).get());
        System.out.println("Question 27");
        System.out.println(Stream.of(new int[] { 1, 2, 3 }).count());
        System.out.println(Stream.of(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }).count());
        System.out.println("Question 23");
        Stack<Integer> st = new Stack<Integer>();
        st.add(3);
        st.add(5);
        st.add(3);
        st.add(7);
        st.add(-1);
        System.out.println(st.get(2) + " " + st.indexOf(3));
        System.out.println("Question 28");
        int n = 15;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 3; j < 2 * n; j++) {
                for (int q = j; q >= 0; q--)
                    count++;
            }
        }
        System.out.println(count);
        System.out.println("Question 29");
        Scanner f = new Scanner("1 1.0 2 5 -3.33");
        int i = 0;
        while (f.hasNext())
            i += f.nextDouble();
        System.out.println(i);
        System.out.println("Question 30");
        ArrayList<Integer> aa = new ArrayList<Integer>();
        for (int r = 0; r < 5; r++)
            aa.add(r + 1);
        ArrayList<Integer> bb = new ArrayList<Integer>();
        bb.addAll(aa);
        aa.clear();
        System.out.println(bb);
        System.out.println("Question 31");
        class Structure<E extends Comparable> {
            ArrayList<E> vals;

            Structure(E initial) {
                vals = new ArrayList<>();
                vals.add(initial);
            }

            void add(E val) {
                vals.add(vals.get(0).compareTo(val) + 1,val);
            }

            E remove() {
                return vals.remove(vals.size() - 1);
            }

            public String toString() {
                return vals.toString();
            }
        }
        // Which of these will compile
        Structure<Integer> struct1 = new Structure<>(3);
        // Structure<Structure> struct2 = new Structure<>(null);
        // Structure<Object> struct3 = new Structure<>("A");
        System.out.println("Question 32");
        Structure<Integer> ss = new Structure(1);
        ss.add(3);
        ss.add(2);
        ss.add(9);
        ss.add(5);
        System.out.println(ss);
        System.out.println("Question 33");
        System.out.println(ss.remove() + " " + ss.remove());
        System.out.println("Question 34");
        //This class shows what java concepts
        //generics, overiding, overloading
        //1, 2, 3, 1+2, 1+3
        System.out.println("Question 35");
        //properties of a graph
        //find a good pic
        System.out.println("Question 36");
        //reduce this boolean equation
        //((A && !B) || (B && !A)) ^ ((A && !B) || (B && !A)) 
        System.out.println("Question 37");
        System.out.println(Math.log(Math.exp(4)));
        System.out.println("Question 38");
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(4,"D");
        System.out.println(map.headMap(3));
        System.out.println("Question 39");
        System.out.println(Integer.toBinaryString(-21));
        System.out.println("Question 40");
        //Postfix math
    }
}
