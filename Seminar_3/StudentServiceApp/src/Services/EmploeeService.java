package Services;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Emploee;
import StudentDomen.PersonComparator;

/**
 * ImploeeService
 */
public class EmploeeService implements iUserService<Emploee> {
    private int count;
    private List<Emploee> emploees;

    public EmploeeService() {
        this.emploees = new ArrayList<Emploee>();
    }

    @Override
    public List<Emploee> getAll() {
        return emploees;
    }

    @Override
    public void create(String firstName, String secondName, int age) {
        Emploee emp = new Emploee(firstName, secondName, age, "базовая специальность" );
        emploees.add(emp);
    }

    public List<Emploee> getSortedByFIOEmploees(){

        List<Emploee> newEmpList = new ArrayList<Emploee>(emploees);
        newEmpList.sort(new PersonComparator<Emploee>());
        return newEmpList;
    }
    
}