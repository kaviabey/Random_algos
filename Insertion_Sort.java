package algos;

public class Insertion_Sort {


//    public int[] Insertion_Sorter(int[] arr) {
//        int j = 0, temp = 0;
//        for (int i = 0; i < arr.length; i++) {
//
//            j = i + 1;
//
//            while (j > 0 && arr[j - 1] > arr[j]) {
//                temp = arr[j - 1];
//                arr[j - 1] = arr[j];
//                arr[j] = temp;
//                j--;
//
//
//            }
//
//
//        }
//        return arr;
//    }


    public static void main(String[] args) {

           int[] arr = {1,4,3,2,-12};
          for(int i = 1;i < arr.length;i++)
          {
              int j = i ;
              int temp = arr[j];
              while(j > 0 && arr[j-1] >  temp)
              {
                  arr[j] = arr[j-1];
                  j--;
              }
              arr[j] = temp;
          }

          for(int i:arr)
          {
              System.out.println(i);
          }
    }
}