package poke.model;

public class Charizard extends Pokemon implements Fire
{
	public Charizard(int number, String name)
	{
		super(number, name);
	}
	public Charizard()
	{
		return "GRRRRRRRRRRRRRRRrrrrrrrrrrrrRRRRRRRRRRRRRRR";
		setup();
	}
	
	public Charizard(String rage)
	{
		return "OMG I'm soooooo angry";
		if (rage.equals("calvin"))
		{
			return "ikr, calvin's the worst";
		}
		setup();
	}
	public Charizard()
	{
		return "I'm making such a scary face rn, you should be very scared, I win this fight.";
		setup();
	}
	protected void setup()
	{
		this.setAttackPoints(9001);
		this.setCanEvolve(false);
		this.setEnhancementModifier(.69);
		this.setHealthPoints(420);
	}
}
