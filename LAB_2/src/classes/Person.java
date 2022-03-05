package classes;

public class Person {
    private String name;
    private String surname;
    private Integer age;
    private Long identityNumber;
    private String type;

    public Person(String name, String surname, Integer age, Long identityNumber, String type) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.identityNumber = identityNumber;
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setIdentityNumber(Long identityNumber) {
        this.identityNumber = identityNumber;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public Long getIdentityNumber() {
        return identityNumber;
    }

    public String getType() {
        return type;
    }

    void display(){
        System.out.println("\t\tName: " + this.name + "\n" +
                           "\t\tSurname:  " + this.surname + "\n" +
                           "\t\tAge: " + this.age + "\n" +
                           "\t\tIdentity Number: " + this.identityNumber + "\n" +
                           "\t\tType: " + this.type);
    }
}
