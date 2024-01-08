public class App {
    public static void main(String[] args) {
        Student std1 = new Student.StudentBuilder("Alice", "fortuen")
            .setAge(20)
            .build();
        System.out.println(std1);
    }
}
