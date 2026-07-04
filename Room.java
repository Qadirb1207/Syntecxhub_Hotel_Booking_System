public class Room {
    private int roomNo;
    private boolean booked;

    public Room(int roomNo){
        if(roomNo > 0)
            this.roomNo = roomNo;
        else
            System.out.println("Invalid! Room Number cannot be negative");
        this.booked = false;
    }

    public int getRoomNo(){
        return this.roomNo;
    }

    public boolean isBooked(){
        return this.booked;
    }

    public void book(){
        if(!booked){
            this.booked = true;
            System.out.println("Room Successfully Booked!!!");
        }else{
            System.out.println("Sorry the Room is already Booked!!");
        }
    }

    public void cancelBooking(){
        
    }
    public String toString(){
        StringBuilder info = new StringBuilder("Room Number = "+this.roomNo);

        if(!booked){
            info.append("\nStatus = Available\n");
        }else{
            info.append("\nStatus = Booked\n");
        }

        return info.toString();
    }
}
