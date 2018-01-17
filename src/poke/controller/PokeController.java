package poke.controller;

import poke.view.PokeFrame;
import poke.view.PokePanel;
import poke.model.*;
import java.util.List;
import java.util.ArrayList;

public class PokeController
{
	private List<Pokemon> pokedex;
	private PokeFrame appFrame;
		
	public void start()
	{
		
	}
	
	public PokeController()
	{
		pokedex = new ArrayList<Pokemon>();
		buildPokedex();
		
		appFrame = new PokeFrame(this);
	}
	
	public void buildPokeDex()
	{
		pokedex.add(new Charizard());
		pokedex.add(new Charmander());
		pokedex.add(new Jynx());
		pokedex.add(new Luvdisc());
		pokedex.add(new Machamp());
		pokedex.add(new Snorlax());
	}
	
	public List<Pokemon> getPokedex()
	{
		return pokedex;
	}
	
	public String [] convertPokedex()
	{
		String [] names = new String [pokedex.size()];
		
		for (int index = 0; index < pokedex.size(); index++)
		{
			names[index] = pokedex.get(index).getName();
		}
		
		return names;
	}
	
	public boolean isValidInteger(String input)
	{
		return false;
	}
	public boolean isValidDouble(String input)
	{
		return false;
	}
	
	public void updateSelected(int selection, int health, int attack, boolean evolve, double modify, String name)
	{
		Pokemon selected = pokedex.get(selection);
		
		selected.setAttackPoints(attack);
		selected.setCanEvolve(evolve);
		selected.setEnhancementModifier(modify);
		selected.setName(name);
		selected.setHealthPoints(health);
		
		FileController.savePokemonToFile((ArrayList<Pokemon>) pokedex);
	}
}
