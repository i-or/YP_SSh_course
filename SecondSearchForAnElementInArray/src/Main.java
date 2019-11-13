import java.text.ParseException;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        ConsoleIntput theArray = new ConsoleIntput();

        long startTime = System.nanoTime();
        theArray.isIntPresentedInArray_OneByOne(theArray.getArrayOfIntegers(), theArray.getNumberToSearch());
        long endTime = System.nanoTime();
        long durationInNano = (endTime - startTime);
        System.out.println("Search element one by one in array is " + durationInNano + " nano seconds");

        long startTime2 = System.nanoTime();
        theArray.isIntPresentedInArray_binary(theArray.getArrayOfIntegers(), theArray.getNumberToSearch());
        long endTime2 = System.nanoTime();
        long durationInNano2 = (endTime2 - startTime2);
        System.out.println("Search element binary in array is " + durationInNano2 + " nano seconds");
    }
}

