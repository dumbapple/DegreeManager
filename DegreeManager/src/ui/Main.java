package ui;

import model.Faculty;
import model.Specialization;
import model.Student;

public class Main {
    public static void main(String[] args) {
        Faculty science = new Faculty("Science", 180);
        Specialization masc = new Specialization("Mathematical Sciences", science);
        Student student1 = new Student(masc, "Andrew", 2);


    }
}