package templatemethod;

public class DoubleSorter extends BubbleSorter{
    private double[] arr = null;

    public DoubleSorter(double[] arr) {
        this.length = arr.length;
        this.arr = arr;
    }
    protected void swap(int index) {
        double temp = arr[index];
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
