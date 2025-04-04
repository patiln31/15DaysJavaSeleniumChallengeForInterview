package Day4;

import java.util.Arrays;
import java.util.Locale;

public class AnagramCheck {

    public static boolean isAnagram(String s1, String s2) {
        // Remove spaces and convert to lowercase
        s1 = s1.replaceAll("\\s+", "").toLowerCase(Locale.ROOT);
        s2 = s2.replaceAll("\\s+", "").toLowerCase(Locale.ROOT);

        // If lengths are different, they cannot be anagrams
        if (s1.length() != s2.length()) {
            return false;
        }

        // Convert strings to character arrays
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        // Sort the character arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare sorted arrays
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (isAnagram(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}

/*

// Approach 2

import java.util.HashMap;

public class AnagramString {
    public static void main(String[] args) {
        String str1 = "llisten";
        String str2 = "sillent";
        System.out.println(" Results = = = "+solve(str1, str2));
    }

    public static boolean solve(String str1, String str2){
        boolean mainResult = false;

        if (str1 == null || str2 == null || str1.length() != str2.length()){
            return false;
        }

        HashMap<Character,Integer> charCount =  new HashMap<>();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        for (char c : str1.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0)+1);
        }
        System.out.println(charCount);

        for (char c : str2.toCharArray()){
            if (!charCount.containsKey(c) || charCount.get(c) == 0){
                return false;
            }
        }

        return true;
    }
}

 */
