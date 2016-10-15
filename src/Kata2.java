import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        String[] names ={"Paco","Pepe","Paco","Paco","Jose","jose","Lucia"};
        Histogram initialHistogram = new Histogram(names);
        Map<String,Integer> resultHistogram = initialHistogram.getHistogram();

        for (String key : resultHistogram.keySet()) System.out.println(key + " -----> " + resultHistogram.get(key));
    }
}
