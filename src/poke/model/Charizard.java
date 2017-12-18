package poke.model;

public class Charizard extends Pokemon implements Fire
{
	public Charizard(int number, String name)
	{
		super(number, name);
	}
	public String growl()
	{
		return "GRRRRRRRRRRRRRRRrrrrrrrrrrrrRRRRRRRRRRRRRRR";
	}
	
	public String dragonRage(String rage)
	{
		if (rage.equals("calvin"))
		{
			return "ikr, calvin's the worst";
		}
		else
		{
			return "OMG I'm soooooo angry";
		}
	}
	public String scaryFace()
	{
		return "I'm making such a scary face rn, you should be very scared, I win this fight.";
	}
	
}
