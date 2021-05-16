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
        System.out.println(reversedString.substring(0, reversedString.length() -1));

        // Challenge 2
        // Rotate an array of n elements to the left by k steps
        // Input [1, 2, 3, 4, 5, 6, 7]
        // Expected output [4, 5, 6, 7, 1, 2, 3]

        RotateArray rotateArray = new RotateArray();
        int array[] = {1,2,3,4,5,6,7};

        rotateArray.leftRotate(array, 3, 7);
        rotateArray.printArray(array, 7);

    }
}


// Class for Challenge 2

class RotateArray {
    void leftRotate(int array[], int rotateBy, int size) {
        for (int index = 0; index < rotateBy; index++) {
            leftRotateByOne(array, size);
        }
    }

    void leftRotateByOne(int array[], int size) {
        int index;
        int tempArray;
        tempArray = array[0];
        for (index = 0; index < size - 1; index++) {
            array[index] = array[index + 1];
        }
        array[index] = tempArray;
    }

    void printArray(int array[], int size) {
        for (int index = 0; index < size; index++) {
            System.out.println(array[index]);
        }
    }
}