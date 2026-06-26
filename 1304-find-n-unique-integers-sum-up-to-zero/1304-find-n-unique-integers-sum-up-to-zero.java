class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int index = 0 ;
        int pairs  = n/2;

        for(int i = 1 ; i <= pairs ; i++){
            arr[index++] =  i ;
            arr[index++] = -i;
        }
        if(n%2 != 0){
            arr[index++] = 0;
        }
        return arr;
    }
}