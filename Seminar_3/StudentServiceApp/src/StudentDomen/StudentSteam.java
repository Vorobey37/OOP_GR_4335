package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentSteam implements Iterable<StudentGroup> {
    
    private List<StudentGroup> steamList;
    private int steamNumber;

    /**
     * конструктор для потока (список групп, номер потока)
     * @param steamList
     * @param steamNumber
     */
    public StudentSteam(List<StudentGroup> steamList, int steamNumber) {
        this.steamList = steamList;
        this.steamNumber = steamNumber;
    }

    /**позволяет получить список групп
     * @return список групп
     */
    public List<StudentGroup> getSteamList() {
        return steamList;
    }

    /**позволяет задать список групп
     * @param steamList
     */
    public void setSteamList(List<StudentGroup> steamList) {
        this.steamList = steamList;
    }

   /**позволяет получить номер потока
     * @return номер потока
     */
     public int getSteamNumber() {
        return steamNumber;
    }

    /**позволяет установить номер потока
     * @param steamNumber
     */
    public void setSteamNumber(int steamNumber) {
        this.steamNumber = steamNumber;
    }

    /**получаем количество групп в потоке
     * @return количество групп
     */
    public int getSizeGroup(){
        return steamList.size();
    }

    /**
     * получает список имен с указанием номера группы
     * @return список типа String
     */
    public String getSNameAndGId(){
        String message = "";
        for (StudentGroup group : steamList) {
            for (Student student : group) {
                message = message + student.getFirstName() + " " + student.getSecondName() + 
                " - номер группы: " + group.getId() + "; ";
            }
        }
        return message.substring(0, message.length()-2);
    }

    @Override
    /**
     * Переопределяет метод toString() на наш лад
     */
    public String toString() {
        return "Поток №: " +  steamNumber + ", количество групп в потоке: " + steamList.size() + 
        ", список студентов: " + getSNameAndGId();
    }

    @Override
    /**
     * метод для создания итератора
     * @return итератор
     */
    public Iterator<StudentGroup> iterator() {
        return new StudentSteamIterator(steamList);
    }
    
    
}
