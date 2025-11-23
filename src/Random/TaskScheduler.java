package Random;

import java.util.HashMap;
import java.util.Map;

public class TaskScheduler {

     public int leastInterval(char[] tasks, int n) {

        Map<Character, Integer> taskFreq = new HashMap<>();
        int maxFreq = 0;
        for(char task : tasks) {
            taskFreq.put(task, taskFreq.getOrDefault(task, 0) + 1);
            maxFreq = Math.max(maxFreq, taskFreq.get(task));
        }

        int totalIntervalForMaxFreqTask = (maxFreq - 1) * n;

        int extraInterval = (tasks.length - maxFreq) - totalIntervalForMaxFreqTask;

        if(extraInterval < 0) extraInterval = 0;

        int totalCPUIntervals = maxFreq + totalIntervalForMaxFreqTask + extraInterval;
        
        return totalCPUIntervals;
        
    }


    public static void main(String[] args) {
        
    }
    
}
