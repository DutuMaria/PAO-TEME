package classes;

public class Subject {
    private Room room;
    private Integer noOfStudents;
    private Person teacher;

    public Subject(Room room, Integer noOfStudents, Person teacher) {
        this.room = room;
        this.noOfStudents = noOfStudents;
        this.teacher = teacher;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Integer getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(Integer noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public Person getTeacher() {
        return teacher;
    }

    public void setTeacher(Person teacher) {
        this.teacher = teacher;
    }

    void display(){
        System.out.println("Teacher Information");
        this.teacher.display();
        System.out.println("Room Information");
        this.room.display();
        System.out.println("Number of students: " + this.noOfStudents);
    }
}
