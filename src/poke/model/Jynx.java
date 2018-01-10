package poke.model;

public class Jynx extends Pokemon implements Psychic
{
	public Jynx(int number, String name)
	{
		super(number, name);
	}
	public String covet(boolean doYouLoveMe)
	{
		if (doYouLoveMe = true)
		{
			return "yes, you love me very much, you will no longer fight me and give me all of your money";
		}
		else
		{
			return "lol, idc, im out of your league anyways";
		}
	}
	public int zenHeadbutt(int immaHeadButtYa)
	{
		if (immaHeadButtYa == 69)
		{
			return 420;
		}
		else
		{
			return 1;
		}
	}
	public String snore(String sleepyYouAre)
	{
		if (sleepyYouAre.equals("yes"))
		{
			return "*snore sounds*";
		}
		else
		{
			return "you should feel lucky you musn't bear the wrath of the snores";
		}
	}
	protected void setup()
	{
		this.setAttackPoints(69);
		this.setCanEvolve(false);
		this.setEnhancementModifier(.69);
		this.setHealthPoints(69);
	}
}

