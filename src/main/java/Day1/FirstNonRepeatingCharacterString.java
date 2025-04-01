package Day1;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacterString {
    public static void main(String[] args) {
        String input = "automation";
        System.out.println("First non-repeating character: " + firstNonRepeatingChar(input));
    }


    public static char firstNonRepeatingChar(String str) {
        Map<Character, Integer> charCount =  new LinkedHashMap<>();

        for (char ch : str.toCharArray()){
            charCount.put(ch, charCount.getOrDefault(ch,0)+1);
        }

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()){
            if (entry.getValue()==1){
                return entry.getKey();
            }
        }

        return '_'; // If all characters repeat
    }
}
