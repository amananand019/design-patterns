package lowLevelDesigns.rateLimiter.rateLimiter1;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class SlidingWindow implements RateLimiter {
    private final Queue<Long> slidingWindow;
    private final int bucketCap;
    private final long time;

    public SlidingWindow(long time, int cap) {
        this.time = time;
        this.bucketCap = cap;
        slidingWindow = new ConcurrentLinkedDeque<>();
    }

    @Override
    public boolean grantAccess() {
        long currTime = System.currentTimeMillis();
        updateQueue(currTime);

        if (slidingWindow.size() < bucketCap) {
            slidingWindow.offer(currTime);
            return true;
        }

        return false;
    }

    private void updateQueue(long currTime) {
        if (slidingWindow.isEmpty()) return;

        while (!slidingWindow.isEmpty() && slidingWindow.peek() < currTime - time) {
            slidingWindow.poll();
        }
    }
}
