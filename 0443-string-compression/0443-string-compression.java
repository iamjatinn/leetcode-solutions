class Solution {
    public int compress(char[] chars) {

        int n = chars.length;
        int index = 0;
        int i = 0;

        while (i < n) {

            char currChar = chars[i];
            int count = 0;

            // Find count of consecutive duplicates
            while (i < n && chars[i] == currChar) {
                count++;
                i++;
            }

            // Store the character
            chars[index] = currChar;
            index++;

            // Store count only if > 1
            if (count > 1) {
                String countStr = String.valueOf(count);

                for (char ch : countStr.toCharArray()) {
                    chars[index] = ch;
                    index++;
                }
            }
        }

        return index;
    }
}