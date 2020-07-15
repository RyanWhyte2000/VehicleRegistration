package queueassignment;

import java.util.Scanner;


public class Queuedriver {

	public static void main(String[] args) {

		int choice;
		do {
			Scanner input = new Scanner(System.in);
				System.out.println("CHOOSE FROM THE LIST BELOW !!");
				System.out.println("1.   AddVehicle  ");
				System.out.println("2.  ProcessVehicle   ");
				System.out.println("3. CountVehiclesInQueue");
				System.out.println("4. DisplayAllVehicles");
				System.out.println("5. ReturnFront");
				System.out.println("6. ReturnRear");
				System.out.println("999. Exit");

				 choice = input.nextInt();
				 
				 Queue queue= new Queue();
				 switch( choice) {
				 
				 case 1:
					 
					 System.out.println("Enter registration number");
					 String reg_num = input.next();
					 System.out.println("Enter license plate ");
					 String lisc_plate = input.next();
					 System.out.println("Enter vehicle type ");
					 String vehicle_type= input.next();
					 
					 
					
					 queue.Enqueue(reg_num, lisc_plate, vehicle_type);
					 break;
					 
				 case 2:
					break;
				 case 3:
						 break;
									 
				 case 4:
					// queue.
					 break;
				 case 5:
					 queue.getFront();
					 break;
				 case 6:
					 queue.getRear();
					 break;
				 /*case 999:
					 System.exit(0);
					 break;*/
				 }
	
				
		}while(choice != 999);	
}
}
