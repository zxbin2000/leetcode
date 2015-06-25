/**
 * #7 Reverse Integer
 * Reverse digits of an integer.
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 */
public class Solution7 {

    public static final void main(String[] args) {
        Solution7 solution = new Solution7();
        System.out.println(solution.reverse(100));
        System.out.println(solution.reverse(1000000003));
        System.out.println(solution.reverse(1234500));
        System.out.println(solution.reverse(-12300));
    }

    public int reverse(int x) {
        int result = 0;
        while(x != 0) {
            int tail = x % 10;
            int newResult = result * 10 + tail;
            if((newResult - tail) / 10 != result)
                return 0;
            result = newResult;
            x = x / 10;
        }
        return result;
    }

}
