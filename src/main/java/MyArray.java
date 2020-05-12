/**
 * 数组是有限个相同类型的变量所组成的有序集合：
 * 关键字：有限个；有序（连续的）、相同类型；
 * 1、在内存中顺序存储；
 * 2、一块连续的内存存储结构。
 * 3、读快；O(1),写慢，适应读操作多、写操作少的；
 *
 */
public class MyArray {
    private static transient int[] array = {3, 1, 2, 5, 9}; // int数组，存储int类型数据，开辟了一个连续的内存空间，由下标随机访问；

    public static void main(String[] args) {
        // 中间插入
    }

    // 中间插入元素
    static boolean insert(int v, int pos) {
        // 校验是否越界
        // 将pos位置及右侧的元素后移
        int [] temp = new int[array.length + 1];
        for (int i = array.length - 1; i <= array.length - pos; i++) {

        }

        return true;
    }

    // 删除指定元素，返回删除的v
    static int remove (int index) {

        return array[index];
    }
}
