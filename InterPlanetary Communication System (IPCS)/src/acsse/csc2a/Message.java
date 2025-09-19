package acsse.csc2a;

/**
 * Class for handling Messages carried by the SpaceShip
 * 
 * @author Mr. B Mzongwana
 * @version P02
 */
public class Message
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
		 * The Message ID is invalid
		 */
		ERROR_INVALID_MESSAGE_ID(-2);

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
	private String Language;
	private String Contents;
	private String SourcePlanet;
	private String DestinationPlanet;
	
     /**Create an instance of a Message with no parameters specified
	
	*/
    public Message(){}
	
	/** Get unique identifier of the message
	 * 
	 * 
	 * @return ID of the message
	 */
	public String getID()
	{
		return ID;
	}
	
	/**Get the language of the contents of the message
	 * 
	 * 
	 * @return Language of the text
	 */
	public String getLanguage()
	{
		return Language;
	}
	
	/**Get the contents of the Message transported
	 * 
	 * 
	 * @return the contents of the message
	 */
	public String getContnts()
	{
		return Contents;
	}
	
	/**Get Name of the Planet that the message is transported from
	 * 
	 * 
	 * @return Name of Source Planet  
	 */
	public String getSourcePlanet()
	{
		return SourcePlanet;
	}
	
	/**Get Name of the Planet that the message is being transported to
	 * 
	 * 
	 * @return Name of the Destination Planet
	 */
	public String getDestinationPlanet()
	{
		return DestinationPlanet;
	}
	
		/**
	 * Creates instance of a Message with the message ID, language, SourcePlanet and DestinationPlanet provided
	 * 
	 * @param ID
	 *          - The Unique Identifier of the Message
	 * @param Language
	 *          - The Language of the text being transmitted
	 * @param Contents
	 *          -  The text being transmitted
	 * @param SourcePlanet
	 *          - The Planet from which the Message is being sent
	 * @param DestinationPlanet 
	 *          - The Planet to which the Message is being sent
 
	 */
	public Message(String ID,String Language,String Contents,String SourcePlanet,String DestinationPlanet)
	{
		//check if the Message ID starts with "MSG" if not set ID to nothing
		if(ID.charAt(0) == 'M' && ID.charAt(1) == 'S' && ID.charAt(2) == 'G')
		{
			this.ID = ID;
		}
		else
		{
		   System.err.println("Invalid Message ID.");
		   System.exit(Error.ERROR_INVALID_MESSAGE_ID.getCode());;	
		}
		this.Language = Language;
		this.Contents = Contents;
		this.SourcePlanet = SourcePlanet;
		this.DestinationPlanet = DestinationPlanet;
		
	}
	
}
