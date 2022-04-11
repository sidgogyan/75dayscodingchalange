class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int []arr=new int[26];
        for(int i=0;i<order.length();i++){
            if(i==0){
               arr[order.charAt(i)-'a']=1;
            }
            else{
                arr[order.charAt(i)-'a']=arr[order.charAt(i-1)-'a']+1;
            }
        }
        
        for(int i=0;i<words.length-1;i++){
            boolean rr=check(words[i],words[i+1],arr);
            if(rr==false){
                return false;
            }
            
        }
        return true;
        
    }
    public boolean check(String str1,String str2,int []arr){
        int len=Math.min(str1.length(),str2.length());
        for(int i=0;i<len;i++){
           int ele1=arr[str1.charAt(i)-'a'];
            int ele2=arr[str2.charAt(i)-'a'];
            if(ele1>ele2){
                return false;
            }
            else if(ele1<ele2){
                return true;
            }
        }
        if(str1.length()>str2.length()){
            return false;
        }
        return true;
    }
}