public class Main {

    public static void main(String[] args) {
        ArraysSort anyArray = new ArraysSort();
        anyArray.bubbleSort(anyArray.getArrayOfIntegers());
        anyArray.selectionSort(anyArray.getArrayOfIntegers());
    }
}
