import java.util.HashMap;

/**
 * #205 Isomorphic Strings
 * Given two strings s and t, determine if they are isomorphic.
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 * All occurrences of a character must be replaced with another character while
 * preserving the order of characters. No two characters may map to the same
 * character but a character may map to itself.
 * For example,
 * Given "egg", "add", return true.
 * Given "foo", "bar", return false.
 * Given "paper", "title", return true.
 * Note:
 * You may assume both s and t have the same length.
 */
public class Solution205 {

    public static final void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));
        System.out.println(isIsomorphic("foo", "bar"));
        System.out.println(isIsomorphic("paper", "title"));
        System.out.println(isIsomorphic("ab", "aa"));   // Expected: false
    }

    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        for(int i = 0; i < s.length(); i++) {
            Character a = s.charAt(i);
            Character b = t.charAt(i);
            if(map.containsKey(a)) {
                if(b.equals(map.get(a))) {
                    continue;
                } else {
                    return false;
                }
            } else {
                if(!map.containsValue(b))
                    map.put(a, b);
                else
                    return false;
            }
        }
        return true;
    }

}
