import java.util.ArrayList;

public class HotelManagement {
    private ArrayList<Room> rooms;

    HotelManagement(){
        rooms = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            rooms.add(new Room(100+i));
        }
    }

    public void viewRooms(){
        for(int i = 0; i < rooms.size(); i++){
            if(!rooms.get(i).isBooked()){
                System.out.println(rooms.get(i));
            }
        }
    }

    public boolean validateRoomNo(int roomNo){
        boolean isCorrect = false;
        for(int i = 0; i < rooms.size(); i++){
            if(roomNo == rooms.get(i).getRoomNo()){
                isCorrect = true;
                break;
            }
        }
        return isCorrect;
    }
    public void bookRoom(int roomNo){
        if(validateRoomNo(roomNo)){
            for(int i = 0; i < rooms.size(); i++){
                if(rooms.get(i).getRoomNo() == roomNo){
                    rooms.get(i).book();
                    return;
                }
            }
        }else{
            System.out.println("Invalid Room Number please select the correct room number");
            return;
        }
    }

    public void cancelRoom(int roomNo){
        if(validateRoomNo(roomNo)){
            for(int i = 0; i < rooms.size(); i++){
                if(rooms.get(i).getRoomNo() == roomNo){
                    rooms.get(i).cancelBooking();
                    return;
                }
            }
        }else{
            System.out.println("Invalid Room Number please enter the correct room number");
        }
    }
    public void addRoom(Room r){
        rooms.add(r);
        System.out.println("Room Added Successfully!!!");
    }

    public void removeRoom(int rNo){
        for(int i = 0; i < rooms.size(); i++){
            if(rooms.get(i).getRoomNo() == rNo){
                if(!rooms.get(i).isBooked()){
                    rooms.remove(rooms.get(i));
                    System.out.println("Room Removed Successfully!");
                    return;
                }else{
                    System.out.println("Room is already booked please romove the booking first!!");
                    return;
                }
            }
        }
    }


}
