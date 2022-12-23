package algos;

import java.util.Scanner;

public class Bubble_Sort {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[4];
         numbers[0] = scanner.nextInt();
        numbers[1] = scanner.nextInt();
        numbers[2]  = scanner.nextInt();
        numbers[3]   =  scanner.nextInt();

        boolean flag =  true;
        for(int i = 0;i < numbers.length;i++) {


            for (int j = 0; j < numbers.length - i-1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int tmp = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = tmp; 
                    flag = false;

                }
            }

            if(!flag)
            {
                break;
            }
        }

         for(int i:numbers)
             System.out.print(i);
    }

}
