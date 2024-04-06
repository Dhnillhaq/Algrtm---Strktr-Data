public class MergeSortingMain {
    public static void main(String[] args) {
        int data[] = {10, 40, 30, 50, 70, 20, 100, 90};
        System.out.println("Sorting dengan merge sort: ");
        MergeSorting17 mSort = new MergeSorting17();
        System.out.println("data awal");
        mSort.printArray(data);
        mSort.MergeSort(data);
        System.out.println("Setelah diurutkan: ");
        mSort.printArray(data);
    }
}
