public class Student implements Comparable<Student>{

     // Can you share with me some java projects
    //POJO -> Plain Old Java Object

    String name;
    int id;
    boolean isOnline;
    long badgeNo;
    /// Plan to do some thing with Git Hub

    public Student(String name, int id, boolean isOnline) {
        this.name = name;
        this.id = id;
        this.isOnline = isOnline;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", isOnline=" + isOnline +
                '}';
    }

    @Override
    public int compareTo(Student o) {

        return this.name.compareTo(o.name);
//        if(this.id > o.id){
////            return 1;
//        }else if(this.id < o.id){
//            return -1;
//        }else{
//            return 0;
//        }
    }
}
