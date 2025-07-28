public class LC28_Find_the_Index_of_First_occurence_in_a_string {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        // Use indexOf method to find the first occurrence of needle in haystack
        return haystack.indexOf(needle);
    }
}
