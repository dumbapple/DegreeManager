package model;

// conducts changes that occur in a student's studies
public class StudentManager {
    private Student givenStudent;

    public StudentManager(Student givenStudent) {
        this.givenStudent = givenStudent;
    }

    public Student getGivenStudent() {
        return givenStudent;
    }

    public void changeSpecialization(Specialization specialization) {
        givenStudent.setSpecialization(specialization);
    }

//    public double getStudentAverage() {
//        givenStudent.getTranscript().returnAverage()
//
//    }
}
