package aggregation;

public class student {
    String name;
    int age;
    int studentId;
    address address;
    student(String name, int age, int studentId, address address){
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.address = address;
    }

    void display(){
        System.out.println("Name of the student is: " + name);
        System.out.println("Age of the student is: " + age);
        System.out.println("Student  id: " + studentId);
        System.out.println("Street address is: " + address.streetAddress);
        System.out.println("Name of the city is: " + address.city);// has a relationship


    }

}
