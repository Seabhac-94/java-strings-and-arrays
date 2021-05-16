class Main {
    public static void main(String[] args) {

        // Challenge 1
        // Given an input string, reverse the string word by word.
        // A word is defined as a sequence of non space characters.
        // The input string does not contain leading or traling spaces and the words are always separated by a single space.

        // Input: "Leonardo da Vinci"
        // Expected Output: "Vinci da Leonardo"
        String inputString[] = "Leanardo da Vinci".split(" ");
        String reversedString = "";

        for (int word = inputString.length - 1; word >= 0; word--) {
            reversedString += inputString[word] + " ";
        }
        System.out.print(reversedString.substring(0, reversedString.length() -1));


        // Challenge 2
        // Rotate an array of n elements to the lft by k steps

        
    }
}