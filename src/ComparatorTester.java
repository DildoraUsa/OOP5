import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTester {


    public static void main(String[] args) {


        List<Student> students = new ArrayList<>();

        students.add(new Student("Joe Schmo", 12, true));
        students.add(new Student("Donny Trump", 23, false));
        students.add(new Student("Barry Obama", 13, true));

        Comparator<Student> comparatorObjectCompareById = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getId()>o2.getId())
                return 1;
                else if(o1.getId()<o2.getId()){
                return -1;
                }else{
                    return 0;
                }
            }
        };



        Collections.sort(students,comparatorObjectCompareById);

        System.out.println(students);


        List<Animal> animals = new ArrayList<>();

        animals.add(new Animal(5, "Dog", 23));
        animals.add(new Animal(10, "Dog", 30));
        animals.add(new Animal(10, "Cat", 10));
        animals.add(new Animal(2, "Hamster", 1));
        animals.add(new Animal(4, "Python", 2));


//        Comparator<Animal> comparatorByAge = new Comparator<Animal>() {
//            @Override
//            public int compare(Animal o1, Animal o2) {
//                if(o1.getAge()>o2.getAge())
//                    return 1;
//                else if(o1.getAge()<o2.getAge()){
//                    return -1;
//                }else{
//                    return 0;
//                }
//            }
//        };



//        Collections.sort(animals, Comparator.comparing((Animal a) -> a.getWeight()));
//
//        Collections.sort(animals, Comparator.comparing((Animal a) -> a.getAge()));

        animals.sort(Comparator.comparing(Animal::getName));

        System.out.println(animals);



        // Difference between comparable vs comparator


    }
}
