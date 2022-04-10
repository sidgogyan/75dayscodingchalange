class Solution {
    public int minimumSize(int[] arr, int maxOperations) {
        int left=1;
        int right=(int)1e9+1;
        int ans=-1;
        while(left<=right){
            int mid=(left+right)/2;
            boolean rr=check(arr,maxOperations,mid);
            if(rr==false){
                left=mid+1;
            }
            else{
                ans=mid;
            right=mid-1;
            }
        }
        return ans;
        
        
    }
    
    public boolean check(int[]arr,int maxop,int ele){
        int op=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>ele){
                if(arr[i]%ele==0){
                   op+=(arr[i]/ele)-1;
                    
                }
                else{
                    op+=arr[i]/ele;
                }
                if(op>maxop){
                    return false;
                }
                
            }
            
            
        }
        return true;
    }
}