public class ReverseWordsInAString {
    public static String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        int i = s.length() - 1;

        while (i >= 0) {
            // Skip trailing spaces
            while (i >= 0 && s.charAt(i) == ' ') i--;

            if (i < 0) break;

            int end = i;

            // Find the start of the word
            while (i >= 0 && s.charAt(i) != ' ') i--;
            int start = i + 1;

            // Append word
            result.append(s.substring(start, end + 1)).append(" ");
        }

        // Remove the last extra space
        return result.toString().trim();
    }
    public static void main(String[] args){
        String s = " The sky is blue! ";
        System.out.println("The reversed words are: "+ reverseWords(s));
    }
}
