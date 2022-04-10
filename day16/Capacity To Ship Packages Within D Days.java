class Solution {
    public int shipWithinDays(int[] arr, int days) {
        int low=-1;
        int high=0;
        for(int x:arr){
            low=Math.max(x,low);
            high+=x;
        }
        
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            boolean rr=helper(arr,days,mid);
            if(rr){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
        
      
        
        
    }
    public boolean helper(int []arr,int days,int mid){
        int sum=0;
        int cnt=1;
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]>mid){
                cnt++;
                if(cnt>days){
                    return false;
                }
                sum=arr[i];
            }
            else{
                sum+=arr[i];
            }
            
        }
        return true;
    }
}