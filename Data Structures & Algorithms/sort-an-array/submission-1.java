class Solution {
    public int[] sortArray(int[] nums) {
      int len = nums.length;
      if(nums==null || len<2) return nums;
      int[] temp = new int[len];
      mergeSort(nums,temp,0,len-1);
      return nums;
    }

    static void mergeSort(int[] arr,int[] temp, int left,int right){
        if(left>=right) return;
        int middle =  left + (right-left)/2;
        mergeSort(arr,temp,left,middle);
        mergeSort(arr,temp,middle+1,right);

        merge(arr,temp,left,middle,right);
    }

    static void merge(int[] arr,int[] temp, int left,int middle, int right){
        int i = left; //left
        int j = middle +1; //middle
        int k = left; //index for temp arr

        while(i<=middle && j<=right){
            if(arr[i]<=arr[j])
                temp[k++]=arr[i++];
            else
                temp[k++]=arr[j++];
        }

        while(i<=middle){
            temp[k++]=arr[i++];
        }

        while(j<=right){
            temp[k++]=arr[j++];
        }

        for(int l=left;l<=right;l++){
            arr[l] = temp[l];
        }
    }
}