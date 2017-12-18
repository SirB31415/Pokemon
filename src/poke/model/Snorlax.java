package poke.model;

public class Snorlax extends Pokemon implements Psychic, Water
{
	public Snorlax(int number, String name)
	{
		super(number, name);
	}
	public String sweetKiss(int sweetKisses)
	{
		return "Snorlax Sweet Kiss";
	}
	public String drainingKiss(int drainKisses)
	{
		return "Snorlax Drain Kiss";
	}
	public String heartStamp(boolean didYaStamp)
	{
		return "Snorlax smash";
	}
	public String covet(boolean doYouLoveMe)
	{
		return "You love Snorlax";
	}
	public String snore(String sleepyYouAre)
	{
		return "Snorelax";
	}
	public int zenHeadbutt(int ImmaHeadButtYa)
	{
		return 0;
	}
}
