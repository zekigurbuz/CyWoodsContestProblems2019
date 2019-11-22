import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Lombdos_Tristan {
    public static int a;
    public static int b;

    public static void main(String[] args) throws Exception {
        new Lombdos_Tristan().run();
    }

    public void run() throws Exception {
        Scanner file = new Scanner(new File("lombdos.dat"));
        TreeMap<String, Function<Integer, Integer>> funcs = new TreeMap<>();
        int times = file.nextInt();
        file.nextLine();
        while (times-- > 0) {
            String[] in = file.nextLine().split(" ");
            String funcName = in[0];
            char param1 = in[2].replaceAll(",", "").charAt(0);
            char param2 = in[3].replaceAll(",", "").charAt(0);
            char p1 = in[5].charAt(0);
            char p2 = in[7].charAt(0);
            Function<Integer, Integer> func = null;
            switch (in[6]) {
            case "+":
                func = (x) -> a + b;
                break;
            case "-":
                func = (x) -> (p1 == param1 ? a : b) - (p2 == param1 ? a : b);
                break;
            case "*":
                func = (x) -> a * b;
                break;
            case "/":
                func = (x) -> (p1 == param1 ? a : b) / (p2 == param1 ? a : b);
                break;
            default:
                func = funcs.get(in[6]);
            }
            for (int i = 8; i < in.length; i += 2) {
                char p = in[i + 1].charAt(0);
                switch (in[i]) {
                case "+":
                    func = func.andThen(x -> p == param1 ? a + x : b + x);
                    break;
                case "-":
                    func = func.andThen(x -> p == param1 ? x - a : x - b);
                    break;
                case "*":
                    func = func.andThen(x -> p == param1 ? x * a : x * b);
                    break;
                case "/":
                    func = func.andThen(x -> p == param1 ? x / a : x / b);
                    break;
                default:
                    func = func.andThen(x -> {
                        if (p == param1) {
                            int temp = b;
                            b = x;
                            int val = funcs.get(in[8]).apply(0);
                            b = temp;
                            return val;
                        } else {
                            int temp = a;
                            a = x;
                            int val = funcs.get(in[8]).apply(0);
                            a = temp;
                            return val;
                        }
                    });
                }
            }
            funcs.put(funcName, func);

        }
        times = file.nextInt();
        file.nextLine();
        while (times-- > 0) {
            String[] in = file.nextLine().split(" ");
            a = Integer.parseInt(in[0]);
            b = Integer.parseInt(in[2]);
            System.out.println(funcs.get(in[1]).apply(0));
        }
    }
}
