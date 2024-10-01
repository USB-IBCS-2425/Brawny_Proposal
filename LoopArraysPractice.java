public class LoopArrayPractice {

    public static int middleValues(int[] Array){
        return Array[Array.length/2];
    }


    public static void main(String[] args) {
        int[] oddArray = {1, 2, 3, 4, 5}; 
        int[] evenArray = {10, 20, 30, 40, 50, 60}; 

    }

    public static int numMatches(String[] arr, String target) {
        int count = 0;
        for (String s : arr) {
            if (s.equals(target)) {
                count++;
            }
        }
        return count;
    }

    public static boolean inOrder(int Array[]) {
        for (int i = 1; i < 5; i++) {
            if (Array[i] < Array[i-1]) {
                return false;
            }
        }
        return true;
    }

    private static boolean startsAndEndsWithSameLetter(String str) {
        return str.length() > 0 && str.charAt(0) == str.charAt(str.length() - 1);
    }

    // Main method to test all the methods
    public static void main(String[] args) {
}