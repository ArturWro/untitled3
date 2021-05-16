public class Main {

    public static void main(String[] args) {
	// write your code here

        Person person = new Person("Artur", "Wro", 20, "8612345654");

        System.out.println(person.showData(person));
        System.out.println(person.peselToAge("8612345654"));

        Student student = new Student(
                "Michał",
                "Andrzejewski",
                20,
                "961230554422",
                "WSEI",
                2,
                "Programming",
                "Andrzej Nochalski",
                1,
                "bardzo dobra");

        System.out.println(student.showStudentData(student));

        Employee employee = new Employee(
                "Andrzej",
                "Michalczewski",
                44,
                "76041235698",
                "NetworkArt",
                6000,
                "specialist",
                "Tomasz Lis",
                2,
                "IT");

        System.out.println(employee.showEmployeeData(employee));
        System.out.println(student.showParameter(student.showParameter(student.getFavTeacher())));
        System.out.println(student.showParameter("Michał Luczkowski"));
        System.out.println(employee.showParameter(employee.showParameter(employee.getFavColleague())));
        System.out.println(employee.showExtraData(employee.getDepartmentName(), employee.getFreeTimeUsed()));
        System.out.println(student.showExtraData(student.getConductGrade() ,student.getAbsenceDays()));

        System.out.println(student.getFavSubject());
    }
}
