public class Problem1 {

  /**
   * binary search.
   *
   * @param nums data to be searched in.
   * @param target target to search.
   * @return index of the target, -1 if nothing found.
   */
  public static int binarySearch(int[] nums, int target) {
    int start = 0;
    int end = nums.length - 1;
    while (start <= end) {
      int mid = (start + end) / 2;
      if (nums[mid] == target) {
        return mid;
      }
      if (target > nums[mid]) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return -1;
  }
}
