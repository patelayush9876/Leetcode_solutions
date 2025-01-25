public class lC58_Length_of_last_word {
    public int lengthOfLastWord(String s) {
        // Trim leading and trailing spaces
        s = s.trim();

        // Find the last space in the string
        int lastSpaceIndex = s.lastIndexOf(' ');

        // Calculate the length of the last word
        return s.length() - lastSpaceIndex - 1;
    }
}
