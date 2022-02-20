package aggregation;

public class app {
    public static void main(String[] args) {
    address address = new address("Tampere", "vainamoisenkatu 11");
    student student = new student("Md Touhidul iSlam", 23, 234443, address);

    student.display();
    }
}
