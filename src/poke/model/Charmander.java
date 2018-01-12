package poke.model;

public class Charmander extends Pokemon implements Fire
{
	public Charmander(int number, String name)
	{
		super(number, name);
	}
	public Charmander()
	{
		return "grrrrrrrrRRRRRRRrrrrrr";
		setup();
	}
	public Charmander(String rage)
	{
		return "I'm sooooo maaaaaaad, I got dat dragon rage boiiiii";
		if (rage.equals("makai"))
		{
			return "I'm so mad macky, he loses at least 69 hp";
		}
		setup();
	}
	public Charmander()
	{
		return "I bet you sooooo scared rn, just look at mah scurrry face";
		setup();
	}
	protected void setup()
	{
		this.setAttackPoints(420);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.69);
		this.setHealthPoints(666);
	}
}
