package poke.model;

public class Machamp extends Pokemon implements Psychic
{
	public Machamp(int number, String name)
	{
		super(number, name);
	}
	public String covet(boolean doYouLoveMe)
	{
		if (doYouLoveMe = true)
		{
			return "mmmmmmkay";
		}
		else
		{
			return "why do I have this ability, I feel so conflicted";
		}
	}
	public String snore(String sleepyYouAre)
	{
		return "even if you're " + sleepyYouAre + "sleepy, you're about to be knocked da $*%#@^*& out";
	}
	public int zenHeadbutt(int ImmaHeadButtYa)
	{
		return ImmaHeadButtYa*3;
	}
}
