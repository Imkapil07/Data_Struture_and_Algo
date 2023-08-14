package String_StringBuilder;

class IsSubsequence {
    public static void main(String[] args) {
    String s1 = "abcde";
    String s2 = "ace"; 
    System.out.println(isSubsequence(s1, s2));
    }

public static boolean isSubsequence(String s1, String s2) {
    int s1Index = 0; // Pointer for s1
    int s2Index = 0; // Pointer for s2

    while (s1Index < s1.length() && s2Index < s2.length()) {
        if (s1.charAt(s1Index) == s2.charAt(s2Index)) {
            s2Index++; // Move s2 pointer
        }
        s1Index++; // Move s1 pointer
    }

    return s2Index == s2.length(); 
  }
}
