package poke.model;

public class Charmander extends Pokemon implements Fire
{
	public Charmander(int number, String name)
	{
		super(number, name);
	}
	public String growl()
	{
		return "grrrrrrrrRRRRRRRrrrrrr";
	}
	public String dragonRage(String rage)
	{
		if (rage.equals("makai"))
		{
			return "I'm so mad macky, he loses at least 69 hp";
		}
		else
		{
			return "I'm sooooo maaaaaaad, I got dat dragon rage boiiiii";
		}
	}
	public String scaryFace()
	{
		return "I bet you sooooo scared rn, just look at mah scurrry face";
	}
}
