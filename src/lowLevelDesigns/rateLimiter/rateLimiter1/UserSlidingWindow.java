package lowLevelDesigns.rateLimiter.rateLimiter1;

import java.util.HashMap;
import java.util.Map;

public class UserSlidingWindow {
    Map<Integer, SlidingWindow> bucket;
    private final int bucketCap;
    private final long time;

    public UserSlidingWindow(int bucketCap, int time) {
        this.bucketCap = bucketCap;
        this.time = time;
        bucket = new HashMap<>();
    }

    public boolean accessApplication(int id) {
        if (!bucket.containsKey(id)) {
            bucket.put(id, new SlidingWindow(time, bucketCap));
        }

        return bucket.get(id).grantAccess();
    }
}