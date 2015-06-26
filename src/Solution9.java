/**
 * #9 Palindrome Number
 * Determine whether an integer is a palindrome. Do this without extra space.
 */
public class Solution9 {

    public static final void main(String[] args) {
        Solution9 solution = new Solution9();
        System.out.println(solution.isPalindrome(12));
        System.out.println(solution.isPalindrome(123));
        System.out.println(solution.isPalindrome(12321));
        System.out.println(solution.isPalindrome(0));
        System.out.println(solution.isPalindrome(1));
        System.out.println(solution.isPalindrome(10));
        System.out.println(solution.isPalindrome(-12321));
    }

    private boolean isPalindrome(int x) {
        if(x < 0 || ( x != 0 && x % 10 == 0))
            return false;
        int rev = 0;
        while(x > rev) {
            rev = rev * 10 + x % 10;
            x = x / 10;
        }
        return (x == rev || x == rev / 10);
    }

}
