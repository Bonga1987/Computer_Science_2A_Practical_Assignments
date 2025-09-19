 import acsse.csc2a.*;
 import java.util.ArrayList;
 
 /**
 * Entry point for P02
 * @author Mr. B Mzongwana
 * @version P02
 */
public class Main
{
	public static void main(String[] args)
	{
        Message message1 = new Message("MSG111111","English","Message one","Earth","Mars");  		
	    Message message2 = new Message("MSG222222","English","Message two","Earth","Venus");
		Message message3 = new Message("MSG333333","English","Message three","Earth","Neptune");
		
		ArrayList<Message> message = new ArrayList<>();
		
		message.add(message1);
		message.add(message2);
	    message.add(message3);
		
		Ship ship1 = new Ship("SH0000","Spaceship1",message);
		Ship ship2 = new Ship("SH1111","Spaceship2",message);
		Ship ship3 = new Ship("SH2222","Spaceship3",message);
		
		System.out.println("SpaceShip 1:");
		ship1.printMessages();
		System.out.println();
		System.out.println("SpaceShip 2:");
		ship2.printMessages();
		System.out.println();
		System.out.println("SpaceShip 3:");
		ship3.printMessages();
		
	}
	
}