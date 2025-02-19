class Solution {
    public String convertToTitle(int n) {
      StringBuilder result = new StringBuilder();
      
      while (n > 0) {
        n--;  // Decrement to make it 0-based
        char ch = (char) ('A' + (n % 26));  // Find the corresponding character
        result.append(ch);
        n /= 26;  // Move to the next place value
      }
      
      return result.reverse().toString();  // Reverse to get the correct order
    }
  }
  