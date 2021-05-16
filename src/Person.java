public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String pesel;

    Person(String firstName, String lastName, int age, String pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String showData(Person person) {

        return person.getFirstName() + " " +
                person.getLastName() + " " +
                person.getPesel() + " " +
                person.getAge();
    }

    public int peselToAge (String pesel){

        int age = 2021 - (Integer.parseInt(pesel.substring(0,2)) + 1900);
        return age;
    }
}

