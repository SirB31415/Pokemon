package poke.model;

public class Luvdisc extends Pokemon implements Water
{
	public Luvdisc(int number, String name)
	{
		super(number, name);
	}
	public Luvdisc(int sweetKisses)
	{
		return "that's not the magic number";
		if (sweetKisses == 69)
		{
			return "ohohohoh naughty naughty";
		}
		setup();
	}
	public Luvdisc(int drainKisses)
	{
		return "i shall drain the life out of you, **auto wins round**";
		if (drainKisses == 420)
		{
			return "verrrrrryyyyy mature";
		}
		setup();
	}
	public Luvdisc(boolean yaBeenStamped)
	{
		return "you aren't deserving of my wuv";
		if (yaBeenStamped = true)
		{
			return "you have mah wuv";
		}
		setup();
	}
	protected void setup()
	{
		this.setAttackPoints(9999);
		this.setCanEvolve(false);
		this.setEnhancementModifier(1);
		this.setHealthPoints(9999);
	}
}
