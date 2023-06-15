public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        Student<String, Integer> s1 = new Student<String, Integer>("Сергей", "Иванов", 35, 15);
        System.out.println(s1);
    }
}
