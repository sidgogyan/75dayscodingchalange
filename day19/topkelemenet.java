class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],(map.get(arr[i])+1));
            }
            else{
                 map.put(arr[i],1);
            }
        }
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        for(int key:map.keySet()){
            pq.add(key);
        }
        int []ans=new int[k];
        int i=0;
        while(i<k){
            ans[i]=pq.remove();
            i++;
        }
        return ans;
        
    }
}