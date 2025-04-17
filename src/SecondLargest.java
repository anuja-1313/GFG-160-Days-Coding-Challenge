public class SecondLargest {
/*
Second Largest - Easy
TC: O(N)
SC: O(1)
*/

    class Solution {
        public int getSecondLargest(int[] arr) {
            // code here
            if(arr.length < 2){
                return -1;
            }

            int maxOne = Integer.MIN_VALUE;
            int maxTwo = Integer.MIN_VALUE;

            for(int i=0; i<arr.length; i++){
                if(arr[i] > maxOne){
                    maxTwo = maxOne;
                    maxOne = arr[i];
                }
                else if(arr[i] != maxOne && arr[i] > maxTwo){
                    maxTwo = arr[i];
                }
            }

            return (maxTwo == Integer.MIN_VALUE) ? -1 : maxTwo;
        }
    }
}
