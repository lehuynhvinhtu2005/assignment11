package assignment10;

import java.util.ArrayList;

class StudentList {

    private ArrayList<Student> studentList;

    public StudentList() {
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void deleteStudentById(String id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId().equals(id)) {
                studentList.remove(i);
            }
        }
    }

    public Student findStudentByID(String id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId().equals(id)) {
                return studentList.get(i);
            }
        }
        return null;
    }
    public void displayAllStudents() {
        for (int i = 0; i < studentList.size(); i++) {
            studentList.get(i).displayInfo();
        }
    }
    public Student findTopStudent(){
        Student max = studentList.get(0);
        for (int i = 1; i < studentList.size(); i++) {
            if (studentList.get(i).getGpa() > max.getGpa()) {
                max = studentList.get(i);
            }
        }
        return max;
    }
}
