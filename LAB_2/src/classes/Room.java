package classes;

public class Room {
    private Integer roomNumber;
    private String roomType;
    private Integer roomFloor;

    public Room(Integer roomNumber, String roomType, Integer roomFloor) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomFloor = roomFloor;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Integer getRoomFloor() {
        return roomFloor;
    }

    public void setRoomFloor(Integer roomFloor) {
        this.roomFloor = roomFloor;
    }

    void display(){
        System.out.println("\t\tRoom Number: " + this.roomNumber + "\n" +
                "\t\tRoom Type:  " + this.roomType + "\n" +
                "\t\tRoom Floor: " + this.roomFloor);
    }
}
