package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentSteamIterator implements Iterator<StudentGroup>{

    private int count;
    private final List<StudentGroup> groups;

    public StudentSteamIterator(List<StudentGroup> groups) {
        this.count = 0;
        this.groups = groups;
    }

    @Override
    /**
     * определяем дошел ли счетчик до конца.
     * возвращает true или false.
     */
    public boolean hasNext() {
        return count < groups.size();
    }

    @Override
    /**
     * возвращает значение группы из списка групп
     * предварительно проверяет окончился ли список?
     */
    public StudentGroup next() {

        if (!hasNext()) {
            return null;
        }
        return groups.get(count++);
    }
    
}
