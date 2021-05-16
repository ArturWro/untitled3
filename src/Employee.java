import lombok.AllArgsConstructor;


public class Employee extends Person implements ExtraOperation {

    private String companyName;
    private int salary;
    private String occupation;
    private String favColleague;
    private int freeTimeUsed;

    public int getFreeTimeUsed() {
        return freeTimeUsed;
    }

    public void setFreeTimeUsed(int freeTimeUsed) {
        this.freeTimeUsed = freeTimeUsed;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    private String departmentName;



    Employee(String firstName, String lastName, int age, String pesel, String companyName, int salary, String occupation,
             String favColleague, int freeTimeUsed, String departmentName) {
        super(firstName, lastName, age, pesel);
        this.companyName = companyName;
        this.salary = salary;
        this.occupation = occupation;
        this.favColleague = favColleague;
        this.freeTimeUsed = freeTimeUsed;
        this.departmentName = departmentName;
    }
    public void setFavColleague(String favColleague) {
        this.favColleague = favColleague;
    }

    public String getFavColleague() {
        return favColleague;
    }
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String showEmployeeData(Employee employee) {
        return employee.getFirstName() + " " +
                employee.getLastName() + " " +
                employee.getAge() + " " +
                employee.getPesel() + " " +
                employee.getCompanyName() + " " +
                employee.getSalary() + " " +
                employee.getOccupation();
    }

    @Override
    public String showParameter(String parameter) {
        this.favColleague = parameter;
        return parameter;
    }

    @Override
    public String showExtraData(String parameter, int parameter2) {
        this.freeTimeUsed = parameter2;
        this.departmentName = parameter;
        return parameter + " " + parameter2;
    }
}
