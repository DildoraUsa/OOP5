public class Animal {


    int age;
    String name;
    double weight;
    double height;
    String color;
  // Learning Git
    //Lear more and more
    public Animal(int age, String name, double weight,String color) {
        this.age = age;
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }



    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
