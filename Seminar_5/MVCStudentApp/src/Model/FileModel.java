package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import Controller.iGetModel;

public class FileModel implements iGetModel {
    private String fileName;

    public FileModel(String fileName) {
        this.fileName = fileName;

        try(FileWriter fw = new FileWriter(fileName, true)) {
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<Student>();
        try {

            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while(line != null) {
                String[] param = line.split(" ");
                Student pers = new Student(param[0], param[1], Integer.parseInt(param[2]), Integer.parseInt(param[3]));
                students.add(pers);
                line = br.readLine();

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return students;
    }

    public void saveAllStudentsToFile(List<Student> students){

        try (FileWriter fw = new FileWriter(fileName, true)) {
            
            for (Student stud : students) {
                
                fw.write(stud.getFirstName() + " " + stud.getSecondName() + " " + stud.getAge() + " " + stud.getId());
                fw.append("\n");
            }

            fw.flush();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void deleteFromModelRus(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteFromModel'");
    }

    @Override
    public void deleteFromModelEng(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteFromModelEng'");
    }
    
}
