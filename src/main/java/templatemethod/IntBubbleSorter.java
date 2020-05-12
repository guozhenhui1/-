package templatemethod;

public class IntBubbleSorter extends BubbleSorter {

    public IntBubbleSorter(int[] arr) {
        this.arr = arr;
        this.length = arr.length;
    }

    private int[] arr = null;
    protected void swap(int index) {
        int temp = arr[index];
        arr[index] = arr[index + 1];
        arr[index + 1] = temp;
    }

    protected boolean outOfOrder(int index) {
        if (arr[index] > arr[index + 1]) {
            return true;
        }
        return false;
    }

}
