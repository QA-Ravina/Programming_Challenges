public class StudentToString {

    //Define a student class with fields like name and age , and use toString to print students details

    String name;
    int age;
    String rollNo;
    String House;

    //constructor

    public StudentToString(String name, String rollNo, int age, String house) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        House = house;
    }

    @Override
    public String toString() {
        return "Details_of_student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rollNo='" + rollNo + '\'' +
                ", House='" + House + '\'' +
                '}';
    }

    public static void main(String[] args) {

    StudentToString stu = new StudentToString("ravina", "001", 27,
            "Ratu Road");

        System.out.println(stu);

    }
}
