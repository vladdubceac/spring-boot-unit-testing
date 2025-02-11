package md.vladdubceac.learning.component.models;

public class CollegeStudent implements Student {
    private int id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private StudentGrades studentGrades;

    public CollegeStudent() {
    }

    public CollegeStudent(String firstName, String lastName, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public StudentGrades getStudentGrades() {
        return studentGrades;
    }

    public void setStudentGrades(StudentGrades studentGrades) {
        this.studentGrades = studentGrades;
    }

    @Override
    public String toString() {
        return "CollegeStudent{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", studentGrades=" + studentGrades +
                '}';
    }

    @Override
    public String studentInformation() {
        return getFullName() + ", " + getEmailAddress();
    }

    @Override
    public String getFullName() {
        return getFirstName() + " " + getLastName();
    }

    private String getFirstNameAndId(){
        return getFirstName() + " " + getId();
    }
}
