import java.util.Scanner;
public class Main {
    private static final String adminPin = "Admin4041207";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HotelManagement hotel = new HotelManagement();
        int choice;
        System.out.println("========== Welcome to Hotel Booking Management System ==========");
        do{
            System.out.println("1. View Available Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Cancel Booking");
            System.out.println("404. Owner Mode");
            System.out.println("4. Exit");
            System.out.print("\nChoose the Option = ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Available Rooms are: ");
                    hotel.viewRooms();
                    break;
            
                case 2:
                    System.out.print("\nEnter The Room Number for Booking (0 for back) = ");
                    int roomNo = sc.nextInt();
                    if(roomNo != 0){
                        hotel.bookRoom(roomNo);
                        break;
                    }else{
                        continue;
                    }
                
                case 3:
                    System.out.print("\nEnter The Room Number to Cancel (0 for back)= ");
                    int rNo = sc.nextInt();
                    if(rNo != 0){
                        hotel.cancelRoom(rNo);
                    }else{
                        continue;
                    }
                    break;

                case 404:
                    sc.nextLine();
                    System.out.print("Enter Admin PIN to Enter The Owner Mode = ");
                    String pin = sc.nextLine();
                    if(pin.equals(adminPin)){
                        int adminChoice;
                        do{
                            System.out.println("====== Welcome To Owner Mode =====");
                            System.out.println("1. Add Room");
                            System.out.println("2. Remove Room");
                            System.out.println("3. View Booked Room");
                            System.out.println("4. Default Mode");
                            System.out.print("\nEnter The choice = ");
                            adminChoice = sc.nextInt();

                            switch (adminChoice) {
                                case 1:
                                    System.out.println("Enter the room number = ");
                                    int room = sc.nextInt();
                                    Room r = new Room(room);
                                    hotel.addRoom(r);                          
                                    break;
                            
                                case 2:
                                    System.out.print("Enter the room number = ");
                                    int roomNumber = sc.nextInt();
                                    hotel.removeRoom(roomNumber);
                                    break;
                                
                                case 3:
                                    System.out.println("Following are the booked rooms:\n");
                                    hotel.viewBookedRooms();
                                    break;
                            }
                        }while(adminChoice != 4);
                    }else{
                        System.out.println("Invalid Pin");
                        continue;
                    }
                    break;
            }

        }while(choice != 4);
        System.out.println("\nThanks For Using Our Services");
        sc.close();
    }   
}
