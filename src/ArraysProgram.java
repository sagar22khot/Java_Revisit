import java.util.*;
import java.util.stream.IntStream;

public class ArraysProgram {

    public static void main(String[] args) {
        int[] a1 = new int[10];
        a1[0] = 1;
        Arrays.fill(a1, 2);
        Arrays.fill(a1, 4);
        System.out.println(a1[1]);
        System.out.println(a1.length);
        String[] a2 = {"one", "two"};
        System.out.println(Arrays.toString(a2));

        int[] onetoten = IntStream.rangeClosed(1, 10).toArray();

        for (int x : onetoten) {
            System.out.println(x);
        }
        System.out.println(Arrays.binarySearch(onetoten, 9));
        int a3[][] = new int[2][2];
        String[][] a4 = {{"00", "10"}, {"01", "11"}};
        System.out.println(a4[1][1]);

        String a5[][][] = {{{"000"}, {"100"}, {"200"}, {"300"}}, {{"010"}, {"110"}, {"210"}, {"310"}},{{"020"}, {"120"}, {"220"}, {"320"}}};
        System.out.println(a5[2][3][0]);

        int a6[] = {1,2,3};
        int a7[] = Arrays.copyOf(a6, 3);
        System.out.println(Arrays.equals(a6, a7));
        int a8[] = {3, 2, 1};
        Arrays.sort(a8);
        System.out.println(Arrays.toString(a8));
    }
}
