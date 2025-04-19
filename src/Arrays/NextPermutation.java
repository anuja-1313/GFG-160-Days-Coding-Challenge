package Arrays;

public class NextPermutation {

//Next Permutation (Medium)
//TC: O(N)
//SC: O(1)

    class Solution {
        void nextPermutation(int[] arr) {
            // code here
            int n = arr.length;

            //step 1 : find the dip in the sequence
            int i=n-2;
            while(i >= 0 && arr[i] >= arr[i+1])
            {
                i--; //update i till dip
            }

            //step 2 : find element just greater than element at i
            int j = n-1;
            if(i >= 0){
                while(arr[j] <= arr[i]){
                    j--;
                }

                //step 3 : swap i and j
                swap(arr, i, j);
            }

            //step 4 : reverse everything after swapped j (new i), since its already sorted

            reverse(arr, i+1, n-1);
        }

        void swap(int[] arr, int start, int end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        void reverse(int[] arr, int start, int end){
            while(start < end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
    }
}
