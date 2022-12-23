package algos;

public class SelectionSort {




     public int[] selectionSorter(int[]  arr) {


         for (int i = 0; i < arr.length-1; i++) {


             for (int j = i+1; j < arr.length ; j++) {

                  int temp;
                   if(arr[i] >= arr[j])
                   {

                       temp = arr[i];
                       arr[i] = arr[j];
                       arr[j] = temp;

                   }

             }
         }

         return arr;
     }



}

class SelectionSortTest{

    public static void main(String[] args) {

             int[] arr =   {1,11,2,3,45,16,7,4};
             SelectionSort tester  =  new SelectionSort();

                           int[] peaks = tester.selectionSorter(arr);
                           for(int i:peaks)
                           {
                               System.out.println(i);
                           }


    }
}
