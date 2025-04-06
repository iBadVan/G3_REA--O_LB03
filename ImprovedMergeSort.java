public class ImprovedMergeSort  {
    public static void mergeSort(int[] array) {
        if (array.length < 2) {
            return;
        }
        mergeSort(array, 0, array.length - 1);
    }

    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid);  
            mergeSort(array, mid + 1, right);  
            merge(array, left, mid, right);  
        }
    }

}
