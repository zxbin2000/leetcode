/**
 * #6 ZigZag Conversion
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
 * (you may want to display this pattern in a fixed font for better legibility)
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 * Write the code that will take a string and make this conversion given a number of rows:
 * string convert(string text, int nRows);
 * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 */
public class Solution6 {

    public static final void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
    }

    public static String convert(String s, int numRows) {
        if(numRows == 1)
            return s;
        StringBuffer[] buffer = new StringBuffer[numRows];
        for(int i = 0; i < numRows; i++) {
            buffer[i] = new StringBuffer();
        }
        int i = 0, j, upRows = numRows - 2;
        while(i < s.length()) {
            for(j = 0; i < s.length() && j < numRows; j++,i++) {
                buffer[j].append(s.charAt(i));
            }
            for(j = upRows; i < s.length() && j > 0; j--,i++) {
                buffer[j].append(s.charAt(i));
            }
        }
        for(i = 1; i < numRows; i++) {
            buffer[0].append(buffer[i]);
        }
        return buffer[0].toString();
    }

}
