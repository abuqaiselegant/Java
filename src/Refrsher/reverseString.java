package Refrsher;

public class reverseString {
    public static void main(String[] args) {
        String originalString = "aurthur";
        String reversedString = reverseString(originalString);

        System.out.println("Original string: " + originalString);
        System.out.println("Reversed string: " + reversedString);
    }

    public static String reverseString(String str) {
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {

            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return new String(chars);
    }
}
