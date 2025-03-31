import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopKFrequentElement {

    public int[] topKFrequent(int[] nums, int k) {

        if (k == nums.length) {
            return nums;
        }
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int key = nums[i];
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        Queue<Integer> queue = new PriorityQueue<>(
                (a,b) -> map.get(a) - map.get(b)
        );

        for(int value : map.keySet()){
            queue.add(value);
            if(queue.size()>k){
                queue.poll();
            }
        }

        int [] ans = new int[k];
        for(int i=0;i<k;i++){
            ans[i] = queue.poll();
        }
        return ans;
    }

}
