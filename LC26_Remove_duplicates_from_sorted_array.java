public class LC26_Remove_duplicates_from_sorted_array {
    public int removeDuplicates(int[] nums) {
        // create a set
        HashSet<Integer> mySet = new HashSet<Integer>();
        int i = 0;
        //add each num to the set
        for (int num : nums) {
            if (!mySet.contains(num)) {
                mySet.add(num);
                nums[i] = num;
                i++;
            }
        }
        return mySet.size();
    }
}
