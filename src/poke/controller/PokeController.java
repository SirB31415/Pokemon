package poke.controller;

import poke.view.PokeFrame;
import poke.view.PokePanel;
import poke.model.*;
import java.util.List;
import java.util.ArrayList;

public class PokeController
{
	private List<Pokemon> pokedex;
	private PokemonFrame appFrame;
		
	public void start()
	{
		
	}
	
	public PokeController()
	{
		pokedex = new ArrayList<Pokemon>();
		buildPokedex();
		
		appFrame = new PokemonFrame(this);
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
	
//	public void updateSelected(int selection, int health, int attack, boolean evolve, double modify,)
	{
		
	}
}
