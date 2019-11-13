import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;


public class ArraysSort {

    int arraySize;
    int[] arrayOfIntegers;

    public ArraysSort(){
        arraySize = setArraySize();
        arrayOfIntegers = setArrayofRandomIntegers (arraySize);
    }

    public int[] getArrayOfIntegers() {
        return arrayOfIntegers;
    }

    private void shakeshakeElements (int[] array, int firstElement, int secondElement) {
        int x = array[firstElement];
        array[firstElement] = array[secondElement];
        array[secondElement] = x;
    }

    public int setArraySize() {
        boolean isInt = false;
        do {
            System.out.println("Enter an array size");
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                arraySize = sc.nextInt();
                isInt = true;
            } else {
                System.out.println("It's not an integer. Enter carefully please. ");
            }
        }
        while (isInt == false);
        return arraySize;
    }

    public int[] setArrayofRandomIntegers(int n) {
        Random rnd = new Random();
        arrayOfIntegers = new int[n];
        for (int i=0; i<arrayOfIntegers.length; i++) {
            arrayOfIntegers[i] = rnd.nextInt();
        }
        return arrayOfIntegers;
    }

    public void bubbleSort (int[] unsortedArray) {
        int[] array = unsortedArray;
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    shakeshakeElements(array, i, i-1);
                    needIteration = true;
                }
            }
        }
        System.out.println("Array sorted by bubbleGum is " + Arrays.toString(array));
    }

    public void selectionSort (int[] unsortedArray) {
        int[] array = unsortedArray;
        for (int left = 0; left < array.length; left++) {
            int minInd = left;
            for (int i = left; i < array.length; i++) {
                if (array[i] < array[minInd]) {
                    minInd = i;
                }
            }
            shakeshakeElements(array, left, minInd);
        }
        System.out.println("Array sorted by selectionSorting is " + Arrays.toString(array));
    }

}
