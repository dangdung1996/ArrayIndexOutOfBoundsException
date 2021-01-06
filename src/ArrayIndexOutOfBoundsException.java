public class ArrayIndexOutOfBoundsException extends java.lang.Exception {
    public static void main(String[] args) {
        int[] array = new int[3];
//        int indexOfArray = array[5];
        try {
            int indexOfArray = array[5];
        } catch (Exception ex) {
            System.out.println("Array Index Out Of Bounds Exception");
        }
    }


}
