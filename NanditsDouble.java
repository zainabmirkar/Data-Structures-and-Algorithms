public class NanditsDouble {
    public static void main(String[] args) {
        
    }


    // binary search
    static int BinarySearch(int[] arr, int target, int start, int end){
        
        while(start <= end) {
            // find the middle element
           //int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return true;
            }
        }
        return false;
}
