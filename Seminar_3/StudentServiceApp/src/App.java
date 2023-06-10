import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Controllers.EmploeeController;
import Services.AverageAge;
import StudentDomen.Emploee;
import StudentDomen.PersonComparator;
import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentSteam;
import StudentDomen.Teacher;
import StudentDomen.User;

public class App {
    public static void main(String[] args) throws Exception {
        
        User user1 = new User("Алексей", "Воробьев", 39);
        Student user2 = new Student("Алексей", "Воробьев", 39, 101);
        Student user3 = new Student("Андрей", "Галкин", 29, 156);

        PersonComparator <Student> comp = new PersonComparator<>();
        //System.out.println(comp.compare(user2, user3));

        Student user4 = new Student("Василий", "Синицын", 39, 278);
        Student user5 = new Student("Иван", "Орлов", 29, 365);
        Student user6 = new Student("Дарья", "Лебедева", 25, 89);
        Student user7 = new Student("Наталья", "Голубева", 27, 487);
        Student user8 = new Student("Марина", "Снегирева", 32, 483);
        Student user9 = new Student("Нина", "Сорокина", 27, 258);
        Student user10 = new Student("Никита", "Перепелкин", 32, 987);
        Student user11 = new Student("Ирина", "Воронина", 27, 41);
        Teacher user12 = new Teacher("Андрей", "Голиков", 35, 123, "ООП");

        List<Student> groupList1 = new ArrayList<>();
        List<Student> groupList2 = new ArrayList<>();
        List<Student> groupList3 = new ArrayList<>();
        groupList1.add(user2);
        groupList1.add(user4);
        groupList1.add(user6);
        groupList2.add(user8);
        groupList2.add(user10);
        groupList2.add(user11);
        groupList2.add(user3);
        groupList3.add(user5);
        groupList3.add(user7);
        groupList3.add(user9);

        StudentGroup studentGroup1 = new StudentGroup(groupList1, 1);
        StudentGroup studentGroup2 = new StudentGroup(groupList2, 2);
        StudentGroup studentGroup3 = new StudentGroup(groupList3, 3);

        List<StudentGroup> steamList = new ArrayList<>();
        steamList.add(studentGroup1);
        steamList.add(studentGroup2);
        steamList.add(studentGroup3);

        StudentSteam steam = new StudentSteam(steamList, 1);

        // System.out.println(studentGroup3);
        // System.out.println();
        // System.out.println(steam);
        // System.out.println();

        // Collections.sort(steam.getSteamList());

        // for (StudentGroup group : steam) {
        //     System.out.println("Группа № " + group.getId() + ":");
        //     for (Student stud : group) {
        //         System.out.println(stud);
        //     }
        // }
        // System.out.println();

        // /* или можно так, я по условию не понял, как надо,
        //  и так, и так выдает список студентов:*/
        // for (StudentGroup group : steam) {
        //     System.out.println(group);
        // }
        // System.out.println();

       Emploee pers1 = new Emploee("Иван", "Иванов", 35, "дворник");
    
       //EmploeeController empContr = new EmploeeController();      
       //empContr.paySalary(user1);
       EmploeeController.paySalary(pers1);

       // там у меня уже был создан список студентов, им и воспользуюсь для примера. 
       System.out.println(AverageAge.averageAgeMean(groupList1));

       // а еще можно объекты разных классов добавить для примера (с полиморфизмом)
       List<User> allTypeList = new ArrayList<User>();
       allTypeList.add(user1);
       allTypeList.add(user2);
       allTypeList.add(user12);
       allTypeList.add(pers1);
       System.out.println(AverageAge.averageAgeMean(allTypeList));

    }
}
