import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {


        File f = new File("Official.in.txt");
        Scanner scan = new Scanner(f);
        int trials = Integer.parseInt(scan.nextLine());
        for (int k = 0; k < trials; k++) {
            String line = scan.nextLine();
            String[] tokens = line.split(" ");
            int firstArraySize = Integer.parseInt(tokens[0]);
            int secondArraySize = Integer.parseInt(tokens[1]);

            //create an array and load it

            ArrayList<String> firstArray = new ArrayList<String>();
            for (int i = 0; i < firstArraySize; i++)
                firstArray.add(scan.nextLine());


            ArrayList<String> secondArray = new ArrayList<String>();
            for (int i = 0; i < secondArraySize; i++)
                secondArray.add(scan.nextLine());


            ArrayList<String> result = new ArrayList<String>();
            for (int i = 0; i < firstArraySize; i++) {
                if (!secondArray.contains(firstArray.get(i)))
                    result.add(firstArray.get(i));
            }
            String temp;
            for (int i = 0; i < result.size() - 1; i++) {
                for (int j = 0; j < result.size() - 1 - i; j++) {
                    if (result.get(j).toLowerCase().compareTo(result.get(j+1).toLowerCase()) > 0) {
                        temp = result.get(j);
                        result.set(j, result.get(j+1));
                        result.set(j+1, temp);
                    }
                }
            }
            for (int i = 0; i < result.size(); i++) {
                System.out.println(result.get(i));
            }
        }

        /*

        File f = new File("Official.in.txt");
        Scanner scan = new Scanner(f);
        int trials = Integer.parseInt(scan.nextLine());
        for (int k = 0; k < trials; k++) {
            String line = scan.nextLine();
            String[] tokens = line.split(" ");
            int firstArraySize = Integer.parseInt(tokens[0]);
            int secondArraySize = Integer.parseInt(tokens[1]);

            String[] firstArray = new String[firstArraySize];
            for (int i = 0; i < firstArraySize; i++) {
                firstArray[i] = scan.nextLine();
            }

            String[] secondArray = new String[secondArraySize];
            for (int i = 0; i < secondArraySize; i++) {
                secondArray[i] = scan.nextLine();
            }

            String[] result = new String[firstArraySize];
            int currentIndex = 0;
            for (int i = 0; i < firstArraySize; i++) {
                boolean inSecondArray = false;
                for (int j = 0; j < secondArraySize; j++)
                    if (firstArray[i].equals(secondArray[j]))
                        inSecondArray = true;
                if (!inSecondArray) {
                    result[currentIndex] = firstArray[i];
                    currentIndex++;
                }
            }

            String[] newResult = new String[currentIndex];
            for (int i = 0; i < newResult.length; i++)
                newResult[i] = result[i];


            String temp;

            for (int i = 0; i < newResult.length - 1; i++) {
                for (int j = 0; j < newResult.length - 1 - i; j++) {
                    if (newResult[j].toLowerCase().compareTo(newResult[j + 1].toLowerCase()) > 0) {
                        temp = newResult[j];
                        newResult[j] = newResult[j + 1];
                        newResult[j + 1] = temp;
                    }
                }
            }

            for (int i = 0; i < newResult.length; i++)
                System.out.println(newResult[i]);
        }
            */

            /*
            File f = new File("Official.out.txt");
            File g = new File("Tested.out.txt");
            Scanner scanF = new Scanner(f);
            Scanner scanG = new Scanner(g);
            String lineF;
            String lineG;
            int line = 0;

            while (scanF.hasNextLine()) {
                lineF = scanF.nextLine();
                lineG = scanG.nextLine();
                line++;
                if (!lineF.equals(lineG))
                    System.out.println("nuh uh @ " + line);
            }
            */


    }
}