class Twitter {
    List<List<Integer>>friends;
    List<List<Integer>>tweet;
    public Twitter() {
        friends=new ArrayList<>();
        tweet=new ArrayList<>();
        for(int i=0;i<500;i++){
            friends.add(new ArrayList<Integer>());
        }
       
    }
    
    public void postTweet(int userId, int tweetId) {
        List<Integer>al=new ArrayList<>();
        al.add(userId);
        al.add(tweetId);
      tweet.add(al);
    }
    
    public List<Integer> getNewsFeed(int userId) {
        List<Integer>ans=new ArrayList<>();
        int idx=0;
        int i=tweet.size()-1;
        while(i>=0 && idx<10){
           List<Integer>ele=tweet.get(i);
            int src=ele.get(0);
            if(src==userId){
                  idx++;
                    ans.add(ele.get(1));        
            }
            else{
            for(int myele:friends.get(userId)){
                if(myele==src){
                    idx++;
                    ans.add(ele.get(1));
                    break;
                }
            }
            }
                
                i--;
         
            

        }
        
        return ans;
    }
    
    public void follow(int followerId, int followeeId) {
        friends.get(followerId).add(followeeId);
    }
    
    public void unfollow(int followerId, int followeeId) {
         friends.get(followerId).remove(new Integer(followeeId));
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */