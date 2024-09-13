package assignment10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student extends Person {
    private float gpa;
    private String major;

    public Student(String id, String fullName, Date dateOfBirth, float gpa, String major) {
        super(id, fullName, dateOfBirth);
        this.gpa = gpa;
        this.major = major;
    }

    public Student() {
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void enterStudentInfo() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Nhap ID: ");
        this.id = keyboard.nextLine();
        System.out.println("Nhap ten: ");
        this.fullName = keyboard.nextLine();
        System.out.println("Nhap GPA: ");
        this.gpa = keyboard.nextFloat();
        keyboard.nextLine();
        System.out.println("Nhap nganh hoc: ");
        this.major = keyboard.nextLine();
        System.out.println("Nhap ngay thang nam sinh (dd/MM/yyyy): ");
        String dateString = keyboard.nextLine();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.dateOfBirth = formatter.parse(dateString);
        } catch (ParseException e) {
            System.out.println("Dinh dang ngay khong hop le!");
        }
    }

    public void display() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = formatter.format(dateOfBirth);
        System.out.println("ID la: " + id);
        System.out.println("Ten la: " + fullName);
        System.out.println("GPA la: " + gpa);
        System.out.println("Nganh hoc la: " + major);
        System.out.println("Ngay thang nam sinh la: " + formattedDate);
    }

    @Override
    public void displayInfo() {
        display();
    }
}
