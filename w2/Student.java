package work.w2;

public class Student implements Comparable<Student> {

    private Integer Id;
    private String name;
    private Integer age;

    public Student() {
    }
    public Student(Integer Id, String name, Integer age) {
        this.Id = Id;
        this.name = name;
        this.age = age;
    }

    public Integer getStuId() {
        return Id;
    }
    public void setStuId(Integer Id) {
        this.Id = Id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    public int compareTo(Student stu) {
        return this.age - stu.age;
    }
    public String toString(){
        return  Id + "\t " + name +"\t" + age ;
    }
}