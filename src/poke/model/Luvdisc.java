package poke.model;

public class Luvdisc extends Pokemon implements Water
{
	public Luvdisc(int number, String name)
	{
		super(number, name);
	}
	public String sweetKiss(int sweetKisses)
	{
		if (sweetKisses == 69)
		{
			return "ohohohoh naughty naughty";
		}
		else
		{
			return "that's not the magic number";
		}
	}
	public String drainingKiss(int drainKisses)
	{
		if (drainKisses == 420)
		{
			return "verrrrrryyyyy mature";
		}
		else
		{
			return "i shall drain the life out of you, **auto wins round**";
		}
	}
}
