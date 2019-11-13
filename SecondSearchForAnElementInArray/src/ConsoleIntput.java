import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class ConsoleIntput {

    private int arraySize;
    private int numberToSearch;
    private int[] arrayOfIntegers;

    public ConsoleIntput(){
        arraySize = setArraySize();
        numberToSearch = setNumberToSearch();
        arrayOfIntegers = setArrayOfRandomIntegers (arraySize);
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

    public int setNumberToSearch() {
        boolean isInt = false;
        do {
            System.out.println("Enter a number to search in array");
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                numberToSearch = sc.nextInt();
                isInt = true;
            } else {
                System.out.println("It's not an integer. Enter carefully please. ");
            }
        }
        while (isInt == false);
        return numberToSearch;
    }

    public int[] setArrayOfRandomIntegers(int n) {
        Random rnd = new Random();
        arrayOfIntegers = new int[n];
        for (int i=0; i<arrayOfIntegers.length; i++) {
            arrayOfIntegers[i] = rnd.nextInt();
        }
        return arrayOfIntegers;
    }


    public void isIntPresentedInArray_OneByOne(int[] array, int x) {
        array = arrayOfIntegers;
        boolean isPresented = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                isPresented = true;
                break;
            }
        }
        System.out.println(numberToSearch + " is presented in array; " + isPresented);
    }

    public void isIntPresentedInArray_binary(int[] array, int x) {
        array = arrayOfIntegers;
        Arrays.sort(array);
        boolean isPresented = false;
        if (Arrays.binarySearch(array, x) >= 0) {
            isPresented = true;
        } else {
            isPresented = false;
        }
        System.out.println(numberToSearch + " is presented in array; " + isPresented);
    }

    public int getArraySize() {
        return arraySize;
    }

    public int getNumberToSearch() {
        return numberToSearch;
    }

    public int[] getArrayOfIntegers() {
        return arrayOfIntegers;
    }


}


