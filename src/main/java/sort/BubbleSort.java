package sort;

import java.util.Arrays;

/**
 * 冒泡排序：稳定排序，不会打乱值相等的顺序；
 *  原则：相邻的元素两两比较，左边大于右边元素则互换位置，否则位置不变；
 */
public class BubbleSort {

    public static int[] arr = {3, 1, 5, 6, 2, 4};

    public static void main(String[] args) {
        bubble1(arr);
        arr = new int[]{1, 2, 3, 4, 5, 6};
        bubble2(arr);
    }

    /**
     * 第一种冒泡排序，最基础的相邻两个元素比较，左边大于右边则互换位置,最大的在右边
     * @param waitSorts
     */
    static void bubble1(int[] waitSorts) {
        long start = System.currentTimeMillis();
        // 外层循环，控制比较回合
        for (int i = 0; i < waitSorts.length -1; i++) {
            // 内部循环，每一回合的冒泡
            for (int j = 0; j < waitSorts.length - i - 1; j++) {
                if (waitSorts[j] > waitSorts[j + 1]) {
                    int tmp = waitSorts[j];
                    waitSorts[j] = waitSorts[j + 1]; // 小的换到前面
                    waitSorts[j + 1] = tmp;// 大的换到后面
                }
            }
            System.out.println("排序第[" + (i + 1) + "]轮==> " + Arrays.toString(waitSorts));
        }
        System.out.println("本次排序耗时： " + (System.currentTimeMillis() - start));
    }

    /**
     * 优化版：如果发现一个回合相互比较时，每一元素互换，说明已经是顺序了，则停止排序
     * @param waitSorts
     */
    static void bubble2(int[] waitSorts) {
        long start = System.currentTimeMillis();
        // 外层循环，控制比较回合
        for (int i = 0; i < waitSorts.length -1; i++) {
            // 内部循环，每一回合的冒泡
            boolean sorted = true;
            for (int j = 0; j < waitSorts.length - i - 1; j++) {
                if (waitSorts[j] > waitSorts[j + 1]) {
                    int tmp = waitSorts[j];
                    waitSorts[j] = waitSorts[j + 1]; // 小的换到前面
                    waitSorts[j + 1] = tmp;// 大的换到后面
                    sorted = false;
                }
            }
            System.out.println("排序第[" + (i + 1) + "]轮==> " + Arrays.toString(waitSorts));
            if (sorted) {
                break;
            }
        }
        System.out.println("本次排序耗时： " + (System.currentTimeMillis() - start));
    }
}
