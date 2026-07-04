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
            System.out.println("\nRoom Successfully Booked!!!\n");
        }else{
            System.out.println("\nSorry the Room is already Booked!!\n");
        }
    }

    public void cancelBooking(){
        if(booked){
            this.booked = false;
            System.out.println("\nRoom Booking Cancelled Successfully!!\n");
        }else{
            System.out.println("\nSorry the room is never booked!\n");
        }
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
