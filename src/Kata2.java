import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {

        int[] data = {6,9,5,8,67,2,4,5,5,5,3,9,5,-4,3,2};
        Map <Integer, Integer> histogram = new HashMap<>();

        for (int i = 0; i < data.length; i++) {
            if (!histogram.containsKey(data[i])) histogram.put(data[i],0);
            histogram.put(data[i], histogram.get(data[i])+1);
        }

        for (int key : histogram.keySet()) { System.out.println(key + " --> " + histogram.get(key)); }
    }
}
