package templatemethod;

/**
 * 排序算法与数组类型无关：故可以放到基类中，换位置和比较大小与数组类型相关由派生类实现。
 */
public abstract class BubbleSorter {
    // 操作次数
    private int operations = 0;
    // 数组长度
    protected int length = 0;
    // 排序算法
    protected int dosort() {
        if (length <= 1) {
            return operations;
        }
        // 标识已经有序了
        operations = 0;
        boolean sorted = true;
        for (int nextNum = 0; nextNum < length - 1; nextNum++) {
            for (int curIndex = 0; curIndex < length - 1 - nextNum; curIndex++) {
                if (outOfOrder(curIndex)) {
                    swap(curIndex);
                    operations++;
                    sorted = false;
                }
            }
            // 轮已经有序了
            if (sorted) {
                break;
            }
        }

        return operations;
    }
    // 交换位置
    protected abstract void swap(int index);
    // 判断index 和index+1 位置数值大小
    protected abstract boolean outOfOrder(int index);
}
