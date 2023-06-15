import java.util.ArrayList;
import java.util.List;

import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;
import Model.FileModel;
import Model.HashModel;
import Model.Model;
import Model.Student;
import View.View;
import View.ViewEng;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        List<Student> students = new ArrayList<Student>();

        Student s1 = new Student("Алексей", "Воробьев", 39, 21);
        Student s2 = new Student("Андрей", "Воронов", 37, 23);
        Student s3 = new Student("Аркадий", "Воропаев", 32, 31);
        Student s4 = new Student("Анатолий", "Вьюгов", 39, 12);
        Student s5 = new Student("Александр", "Ворошилов", 31, 13);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        FileModel fModel = new FileModel("model.txt");
        // fModel.saveAllStudentsToFile(students);

        iGetView view = new View();

        iGetModel model = new Model(students);
        iGetModel newModel = fModel;
        Controller contr = new Controller(view, model);
        //contr.update();
        contr.getAllStudents();
        contr.run();

        HashModel map = new HashModel(students);
        System.out.println(map.createStudentMap());
    }
}
