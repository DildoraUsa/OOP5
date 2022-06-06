import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Tester {


    public static void main(String[] args) {


        List<Student> students = new ArrayList<>();

        students.add(new Student("Joe Schmo", 12, true));
        students.add(new Student("Donny Trump", 23, false));
        students.add(new Student("Barry Obama", 13, true));


        Collections.sort(students);


        System.out.println(students);


//        List<String> strings = Arrays.asList("dsdc", "dsvd", "qndshbcdbs", "asdnfjsbh", "zcdsbudsb");
//
//        Collections.sort(strings);
//
//        System.out.println(strings);




    }
}
