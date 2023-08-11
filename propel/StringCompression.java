package company.dsa.propel;

public class StringCompression {
    public static void main(String[] args) {
        String input = "wwwb,bbw";
        String compressed = compressString(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + compressed);
    }

    public static String compressString(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        StringBuilder compressed = new StringBuilder();
        char prevChar = input.charAt(0);
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == prevChar) {
                count++;
            } else {
                compressed.append(count).append(prevChar);
                count = 1;
            }
            prevChar = currentChar;
        }

        compressed.append(count).append(prevChar);
        return compressed.toString();
    }
}
