package GeneralExamples;

import java.util.HashSet;
import java.util.Set;

class Student{
    int age;
    String name;
    String phone;

    public Student(int age,String name, String phone){
        this.age=age;
        this.name=name;
        this.phone=phone;
    }
}
public class Examples_Set {
    public static void main(String[] args) {
        Set<Student> dataSe = new HashSet<Student>();

        Student ahmet = new Student(22, "Ahmet", "033010102");
        Student suat = new Student(18, "Ahmet Suat", "22222");
        Student miko = new Student(22, "Miko", "111111");

        dataSe.add(ahmet);
        dataSe.add(suat);
        dataSe.add(miko);

        data(dataSe);

    }

    public static void data(Set<Student> y) {
        for (Student x : y) {
            System.out.println("++++++++++++++");
            System.out.println(x.age);
            System.out.println(x.name);
            System.out.println(x.phone);

        }

    }
}