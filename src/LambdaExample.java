import java.util.ArrayList;
import java.util.List;

public class LambdaExample {


    public static void main(String[] args) {
        List<String> row = new ArrayList<>();
        row.add("Fairfax");
        row.add("Virginia");
        row.add("Vienna");
//        row.removeIf(s -> s.equals("Virginia"));
        row.removeIf(s -> s.startsWith("V"));

        System.out.println(row);
    }
}
