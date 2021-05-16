
public class Student extends Person implements ExtraOperation {

    private String schoolName;
    private int studentClass;
    private String favSubject;
    private String favTeacher;
    private int absenceDays;
    private String conductGrade;

    public int getAbsenceDays() {
        return absenceDays;
    }

    public void setAbsenceDays(int absenceDays) {
        this.absenceDays = absenceDays;
    }

    public String getConductGrade() {
        return conductGrade;
    }

    public void setConductGrade(String conductGrade) {
        this.conductGrade = conductGrade;
    }

    public String getFavTeacher() {
        return favTeacher;
    }

    public void setFavTeacher(String favTeacher) {
        this.favTeacher = favTeacher;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(int studentClass) {
        this.studentClass = studentClass;
    }

    public String getFavSubject() {
        return favSubject;
    }

    public void setFavSubject(String favSubject) {
        this.favSubject = favSubject;
    }

    Student(String firstName, String lastName, int age, String pesel, String schoolName, int studentClass, String favSubject
    , String favTeacher, int absenceDays, String conductGrade) {
        super(firstName, lastName, age, pesel);
        this.schoolName = schoolName;
        this.studentClass = studentClass;
        this.favSubject = favSubject;
        this.favTeacher = favTeacher;
        this.absenceDays = absenceDays;
        this.conductGrade = conductGrade;

    }

    public String showStudentData(Student student) {
        return student.getFirstName() + " " +
                student.getLastName() + " " +
                student.getAge() + " " +
                student.getPesel() + " " +
                student.getSchoolName() + " " +
                student.getStudentClass() + " " +
                student.getFavSubject();
    }

    @Override
    public String showParameter(String parameter) {
        this.favTeacher = parameter;
        return parameter;
    }

    @Override
    public String showExtraData(String parameter, int parameter2) {
        this.conductGrade = parameter;
        this.absenceDays = parameter2;
        return " Ocena z zachowania: " + parameter + " \n liczba dni nieobecnych wynosi: " + parameter2;
    }
}
