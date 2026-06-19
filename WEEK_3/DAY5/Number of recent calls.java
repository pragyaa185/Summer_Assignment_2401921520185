

class RecentCounter {
    private List<Integer> requestTimestamps;
    private int startPointer;

    public RecentCounter() {
        requestTimestamps = new ArrayList<>();
        startPointer = 0;
    }
    
    public int ping(int t) {
        requestTimestamps.add(t);
        int minimumAllowedTime = t - 3000;
        
        while (requestTimestamps.get(startPointer) < minimumAllowedTime) {
            startPointer++;
        }
        
        return requestTimestamps.size() - startPointer;
    }
}