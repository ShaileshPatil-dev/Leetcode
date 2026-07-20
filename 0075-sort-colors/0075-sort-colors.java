class Solution {
    public void sortColors(int[] sortedarray) {
          for (int i = 0; i < sortedarray.length-1; i++) {
               boolean flag = false;
               for (int j = 1; j <= sortedarray.length-1-i; j++) {
                    if (sortedarray[j]<sortedarray[j-1]) {
                         int temp = sortedarray[j];
                         sortedarray[j]= sortedarray[j-1];
                         sortedarray[j-1]= temp;
                         flag = true;
                    }
               }
               if (!flag) {
                    break;
                    }
          }
              }
}