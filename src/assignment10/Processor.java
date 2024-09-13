package assignment10;

import java.util.Date;
import java.util.Scanner;

public class Processor {
    private static StudentList studentList = new StudentList();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Them sinh vien");
            System.out.println("2. Cap nhat sinh vien theo ma");
            System.out.println("3. Xoa sinh vien theo ma");
            System.out.println("4. Hien thi thong tin tat ca sinh vien");
            System.out.println("5. Tim sinh vien co diem trung binh cao nhat");
            System.out.println("6. Thoat");
            System.out.print("Lua chon: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addNewStudent();
                    break;

                case 2:
                    System.out.print("Nhap ma sinh vien can cap nhat: ");
                    String updateId = scanner.nextLine();
                    updateStudentById(updateId);
                    break;

                case 3:
                    System.out.print("Nhap ma sinh vien can xoa: ");
                    String deleteId = scanner.nextLine();
                    deleteStudentById(deleteId);
                    break;

                case 4:
                    displayAllStudents();
                    break;

                case 5:
                    findTopStudent();
                    break;

                case 6:
                    System.out.println("Thoat...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Lua chon khong hop le. Vui long thu lai.");
            }
        }
    }

    private static void addNewStudent() {
        Student student = new Student();
        student.enterStudentInfo();
        studentList.addStudent(student);
    }

    private static void updateStudentById(String id) {
        Student student = studentList.findStudentByID(id);
        if (student != null) {
            student.enterStudentInfo();
        } else {
            System.out.println("Khong tim thay sinh vien.");
        }
    }

    private static void deleteStudentById(String id) {
        studentList.deleteStudentById(id);
    }

    private static void displayAllStudents() {
        studentList.displayAllStudents();
    }

    private static void findTopStudent() {
        Student topStudent = studentList.findTopStudent();
        if (topStudent != null) {
            System.out.println("Sinh vien co diem trung binh cao nhat:");
            topStudent.displayInfo();
        } else {
            System.out.println("Khong tim thay sinh vien.");
        }
    }
}
