package Controllers;

import Services.TeacherService;
import StudentDomen.Teacher;

public class TeacherController implements iUserController<Teacher> {

    private final TeacherService dataTeachService = new TeacherService();

    @Override
    /**
     * создает объект учитель и добавляет его в список учителей,
     * используя TeacherService
     */
    public void create(String firstName, String secondName, int age) {
        dataTeachService.create(firstName, secondName, age);
    }
    
}
