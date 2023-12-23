import java.io.File;
import java.util.Scanner;
public class WithArrays {
    public static void main(String[] args) {
        File f = new File("Sample.in.txt");
        Scanner scan = new Scanner(f);
        int trials = Integer.parseInt(scan.nextLine());
        System.out.println("Number of trials: " + trials);
        String line = scan.nextLine();
        String [] tokens = line.split(" ");
        int firstArraySize = Integer.parseInt(tokens[0]);
        int secondArraySize = Integer.parseInt(tokens[1]);
        System.out.println("Array sizes are " + firstArraySize + " and " + secondArraySize);

        String [] firstArray = new String [firstArraySize];
        for (int i = 0; i < firstArraySize; i++) {
            firstArray[i] = scan.nextLine();
        }

        String [] secondArray = new String [secondArraySize];
        for (int i = 0; i < secondArraySize; i++) {
            secondArray[i] = scan.nextLine();
        }

        String [] result = new String[firstArraySize];
        int currentIndex = 0;
        for (int i = 0; i < firstArraySize; i++) {
            int inSecondArray = false;
            for (int j = 0; j < secondArraySize; j++)
                if (firstArray[i].equals(secondArray[j]))
                    inSecondArray = true;
            if (!inSecondArray) {
                result[currentIndex] = firstArray[i];
                currentIndex++;
            }
        }

        //without sorting

        System.out.println("Output: \n");
        for (int i = 0; i < result.length; i++)
            System.out.println(result[i]);

    }
}
