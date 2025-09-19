 package acsse.csc2a;
 import java.util.ArrayList;
 
 /**
 * Class for handling a SpaceShip that carries the Messages
 * 
 * @author Mr. B Mzongwana
 * @version P02
 */
 
	
public class Ship
{
	 /**
	 * Error enumeration for specific errors that can occur when using the Ship
	 * 
	 * @author Mr. B Mzongwana
	 * @version P02
	 */
 public enum Error
	{
		/**
		 * The Ship ID  is not valid
		 */
		ERROR_INVALID_SHIP_ID(-1);

		private final int code;

		private Error(int code)
		{
			this.code = code;
		}

		public int getCode()
		{
			return code;
		}
	}
	
	
	private String ID;
    private String Name;
    private ArrayList<Message> messages;
	
    /**Create an instance of a SpaceShip with no parameters specified
	
	*/
	public Ship(){}
	
			/**
	 * Creates instance of a Ship with  Ship ID, Name , and the List of Messages provided
	 * 
	 * @param ID
	 *          - The Unique Identifier of the SpaceShip
	 * @param Name
	 *          -  The Name of the SpaceShip
	 * @param messages
	 *          - The Messages carried by the SpaceShip 
	 */
	public Ship(String ID,String Name,ArrayList<Message> messages)
		{
			//check if the Ship ID starts with "SH" if not set ID to nothing
			if(ID.charAt(0) == 'S' && ID.charAt(1) == 'H')
			{
				this.ID = ID;
			}
			else
			{
				System.err.println("Invalid Ship ID.");
				System.exit(Error.ERROR_INVALID_SHIP_ID.getCode());
			}
			this.Name = Name;
			this.messages = messages;
		}
		
	/**Get the SpaceShip ID
	 * 
	 * 
	 * @return SpaceShip ID
	 */
	public String getID()
		{
			return ID;
		}
		
	/**Get Name of the SpaceShip carrying the messages
	 * 
	 * 
	 * @return Name of the SpaceShip
	 */
	public String getName()
		{
			return Name;
		}
		
	/**Get the List of Messages carried by the SpaceShip
	 * 
	 * 
	 * @return List of Messages
	 */
	public ArrayList<Message> getMessages()
		{
            return messages;
		}
		
	/**
	 * Displays the messages transmitted by the Spaceship
	 */
	public void printMessages()
		{
			//loop through message array list and output message details 
			for (Message ms : messages)
			{
			System.out.println(
								"ID: " + ms.getID() + "/ "
								+ "Languange: " + ms.getLanguage() + "/ " 
								+ "Message: " + ms.getContnts() + "/ " 
								+ "SourcePlanet: " + ms.getSourcePlanet() + "/ " 
								+ "DestatinationPlanet: " + ms.getDestinationPlanet()					
							  );
			}
		}             						
 		
}		