package templatemethod;

import java.util.Arrays;

public class MyTest {

    public static void main(String[] args) {
        int[] ints = new int[] {6, 4, 1, 5, 3, 2};
        IntBubbleSorter intSorter = new IntBubbleSorter(ints);
        int operations = intSorter.dosort();
        System.out.println("===>>> 换了几次位置：" + operations + " ===>>>" + Arrays.toString(ints));
        int operations2 = intSorter.dosort();
        System.out.println("===>>> 换了几次位置：" + operations2 + " ===>>>" + Arrays.toString(ints));

        // double
        double[] dous = new double[] {2.1, 1.2, 3.2, 0.9};
        DoubleSorter doubleSorter = new DoubleSorter(dous);
        int dos = doubleSorter.dosort();
        System.out.println("===>>> 换了几次位置：" + dos + " ===>>>" + Arrays.toString(dous));


    }
}
