class TimeMap {
    HashMap<String,HashMap<Integer,String>> hm = new HashMap<>();
    HashMap<String,Integer> lastAdded= new HashMap<>();
    public TimeMap() {
        
    }
    
    public void set(String key, String value, int timestamp) {
        if(!hm.containsKey(key))
        {
            HashMap<Integer,String> temp=new HashMap<>();
            hm.put(key,temp);
            HashMap<String,Integer> temp1=new HashMap<>();
            lastAdded.put(key,timestamp);
        }
        hm.get(key).put(timestamp,value);
        if(timestamp>lastAdded.get(key)) lastAdded.put(key,timestamp);
    }
    
    public String get(String key, int timestamp) {
        if(!hm.containsKey(key)) return "";
        if(timestamp>=lastAdded.get(key)) return hm.get(key).get(lastAdded.get(key));
        int found=-1;
        for(Map.Entry<Integer,String> i:hm.get(key).entrySet())
        {
            if(i.getKey()>found && i.getKey()<=timestamp) found=i.getKey();
        }
        return found==-1?"":hm.get(key).get(found);
    }
    
}

 /**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap(m);
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 **/