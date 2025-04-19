package Arrays;

/*
Move All Zeroes to End - Easy
TC: O(N)
SC: O(1)
*/
class MoveAllZeroesToEnd {
    void pushZerosToEnd(int[] arr) {
        // code here
        //a pointer for last nonzero element
        int n = arr.length;
        int j = 0;
        for(int i=0; i<n; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
}