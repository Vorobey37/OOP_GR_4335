package Services;

import java.util.List;

import StudentDomen.User;

public class AverageAge<T extends User> {
    
    /**
     * получам средний возраст среди объектов  в данном случае типа User 
     * и его наследников
     * @param <T> обобщенный тип, в данном случае наследник типа User
     * @param usersList список объектов
     * @return среднее значение возраста среди списка объектов.
     */
    static public <T extends User> double averageAgeMean(List<T> usersList) {

        double sum = 0;
        for (T user : usersList) {
            sum = sum + user.getAge();
        }
        return sum/usersList.size();

    }
}
