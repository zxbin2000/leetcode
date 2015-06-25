/**
 * #5 Longest Palindromic Substring
 * Given a string S, find the longest palindromic substring in S.
 * You may assume that the maximum length of S is 1000, and there exists one unique longest palindromic substring.
 */
public class Solution5 {

    public static final void main(String[] args) {
        String case1 = "jglknendplocymmvwtoxvebkekzfdhykknufqdkntnqvgfbahsljkobhbxkvyictzkqjqydczuxjkgecdyhixdttxfqmgksrkyvopwprsgoszftuhawflzjyuyrujrxluhzjvbflxgcovilthvuihzttzithnsqbdxtafxrfrblulsakrahulwthhbjcslceewxfxtavljpimaqqlcbrdgtgjryjytgxljxtravwdlnrrauxplempnbfeusgtqzjtzshwieutxdytlrrqvyemlyzolhbkzhyfyttevqnfvmpqjngcnazmaagwihxrhmcibyfkccyrqwnzlzqeuenhwlzhbxqxerfifzncimwqsfatudjihtumrtjtggzleovihifxufvwqeimbxvzlxwcsknksogsbwwdlwulnetdysvsfkonggeedtshxqkgbhoscjgpiel";
        System.out.println(longestPalindrome(case1));
    }

    public static String longestPalindrome(String s) {
        if(s.isEmpty()) return "";
        if(s.length() == 1) return s;
        int size = s.length(), start = 0, max_len = 1;
        for(int i = 0; i < size;) {
            if(i + max_len / 2 >= size)
                break;
            int j = i, k = i;
            while(k < size - 1 && s.charAt(k) == s.charAt(k + 1))
                k++;
            i = k + 1;
            while(j > 0 && k < size - 1 && s.charAt(k + 1) == s.charAt(j - 1)) {
                j--;
                k++;
            }
            int new_len = k - j + 1;
            if(new_len > max_len) {
                start = j;
                max_len = new_len;
            }
        }
        return s.substring(start, max_len + start);
    }

}
