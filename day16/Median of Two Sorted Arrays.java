class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        if(arr2.length<arr1.length){
   return findMedianSortedArrays(arr2,arr1);
        }
        int len=arr1.length+arr2.length;
        int ele=(len+1)/2;
        int right=arr1.length;
        int left=0;
        while(left<=right){
            int cut1=((left+right)/2);
            int cut2=ele-cut1;
            int l1=cut1==0?Integer.MIN_VALUE:arr1[cut1-1];
            int l2=cut2==0?Integer.MIN_VALUE:arr2[cut2-1];
            int r1=cut1==arr1.length?Integer.MAX_VALUE:arr1[cut1];
            int r2=cut2==arr2.length?Integer.MAX_VALUE:arr2[cut2];
            if(l1<=r2 && l2<=r1){
                if(len%2==0){
                    double d=(double)(Math.max(l1,l2)+Math.min(r1,r2))/2;
                    return d;
                }
                else{
                    double d=(double)Math.max(l1,l2);
                        return d;
                }
            }
            else{
                if(l1>r2){
                    right=cut1-1;
                }
                else{
                    left=cut1+1;
                    
                }
            }
            
            
        }
        return 0;
        
    }
}