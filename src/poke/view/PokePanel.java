package poke.view;

import poke.model.Pokemon;
import poke.controller.PokeController;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.SpringLayout;
import javax.swing.DefaultComboBoxModel;

public class PokePanel extends JPanel
{
	private PokeController appController;
	private SpringLayout appLayout;
	
	private JLabel healthLabel;
	private JLabel attackLabel;
	private JLabel nameLabel;
	private JLabel numberLabel;
	private JLabel evolvableLabel;
	private JLabel modifierLabel;
	private JLabel iconLabel;
	
	private JCheckBox evolvableBox;
	private JTextField nameField; 
	private JTextField numberField;
	private JTextField attackField;
	private JTextField healthField;
	private JTextField modifierField;
	
	private JTextArea descriptionArea;
	private JTextArea typeArea;
	
	private JButton clearButton;
	private JButton saveButton;
	private JComboBox pokedexDropdown;
	
	private JPanel firstType;
	private JPanel secondType;
	private JPanel thirdType;
	private JPanel fourthType;
	
	public PokePanel(PokeController appController)
	{
		super();
		this.appController = appController;
		
		appLayout = new SpringLayout();
		
		evolvableBox = new JCheckBox();
		nameField = new JTextField("name");
		numberField = new JTextField("##");
		attackField = new JTextField("ap");
		healthField = new JTextField("hp");
		modifierField = new JTextField("mod");
		
		iconLabel = new JLabel("", new ImageIcon(getClass().getResource("/pokemon/view/PokeImages/poke.png")), JLabel.CENTER);
		
		nameLabel = new JLabel("name");
		evolvableLabel = new JLabel("evolvable");
		numberLabel = new JLabel("number");
		attackLabel = new JLabel("attack");
		healthLabel = new JLabel("health");
		modifierLabel = new JLabel("modifier");
		pokedexDropdown = new JComboBox();
		clearButton = new JButton("clear");
		saveButton = new JButton("save");
		
		descriptionArea = new JTextArea(5,10);
		typeArea = new JTextArea(4,15);
		
		firstType = new JPanel();
		secondType = new JPanel();
		thirdType = new JPanel();
		fourthType = new JPanel();
		
		setupComboBox();
		setupTypePanels();
		setupPanel();
		setupLayout();
		setupListeners();
		updateImage();
		
	}
	
	public void updatePokedexInfo(int index)
	{
		
		nameField.setText(appController.getPokedex().get(index).getName());
		evolvableBox.setSelected(appController.getPokedex().get(index).isCanEvolve());
		numberField.setText(appController.getPokedex().get(index).getNumber() + "");
		attackField.setText(appController.getPokedex().get(index).getAttackPoints() + "");
		healthField.setText(appController.getPokedex().get(index).getHealthPoints() + "");
		modifierField.setText(appController.getPokedex().get(index).getEnhancementModifier() + "");
		
		descriptionArea.setText(appController.getPokedex().get(index).toString());
		typeArea.setText("");
		
		for (String current : appController.getPokedex().get(index).getPokemonTypes())
		{
			typeArea.append(current + "\n");
		}
	}
	private void updateImage()
	{
		String path = "/poke/view/images/";
		String defaultName = "logo";
		String name = pokedexDropdown.getSelectedItem().toString();
		String extension = ".png";
		ImageIcon pokemonIcon;
		
		try
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + name + extension));
		}
		catch (NullPointerException missingImageFile)
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + defaultName + extension));
		}
		iconLabel.setIcon(pokemonIcon);
	}
	
	
	private void setupComboBox()
	{
		DefaultComboBoxModel pokemonModel = new DefaultComboBoxModel(appController.convertPokedex());
		pokedexDropdown.setModel(pokemonModel);
	}
	
	private void setupTypePanels()
	{
		firstType.setSize(50, 50);
		secondType.setSize(50, 50);
		thirdType.setSize(50, 50);
		fourthType.setSize(50, 50);
	}
	private void setupPanel()
	{
		
	}
	private void updateTypePanels()
	{
		String[] types = appController.getPokedex().get(pokedexDropdown.getSelectedIndex()).getPokemonTypes();
		
		if (types[0].equals("Electric"))
		{
			firstType.setBackground(Color.YELLOW);
		}
		else if (types[0].equals("Steel"))
		{
			firstType.setBackground(Color.GRAY);
		}
		else if (types[0].equals("Dark"))
		{
			firstType.setBackground(Color.BLACK);
		}
		else
		{
			firstType.setBackground(Color.WHITE);
		}
		if (types.length > 1)
		{
			if (types[1].equals("Electric"))
			{
				secondType.setBackground(Color.YELLOW);
			}
			else if (types[1].equals("Steel"))
			{
				firstType.setBackground(Color.GRAY);
			}
			else if (types[1].equals("Dark"))
			{
				firstType.setBackground(Color.BLACK);
			}
			else
			{
				firstType.setBackground(Color.WHITE);
			}
			if (types.length == 3)
			{
				if (types[2].equals("Electric"))
				{
					thirdType.setBackground(Color.GRAY);
				}
				else if (types[2].equals("Steel"))
				{
					firstType.setBackground(Color.GRAY);
				}
				else if (types[2].equals("Dark"))
				{
					firstType.setBackground(Color.BLACK);
				}
				else
				{
					firstType.setBackground(Color.WHITE);
				}
			}
		}
	}
	private void setupLayout()
	{
		
	}
	private void  setupListeners()
	{
		pokedexDropdown.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent selection)
						{
							int selectedPokemonIndex = pokedexDropdown.getSelectedIndex();
							updatePokedexInfo(selectedPokemonIndex);
							updateImage();
							updateTypePanels();
							repaint();
						}
				});
		saveButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				if(appController.isValidInteger(attackField.getText()) && appController.isValidInteger(healthField.getText()) && appController.isValidDouble(modifierField.getText()))
				{
					int selected = pokedexDropdown.getSelectedIndex();
					int health = Integer.parseInt(healthField.getText());
					int attack = Integer.parseInt(attackField.getText());
					double modifier = Double.parseDouble(modifierField.getText());
					String name = nameField.getText();
					boolean evolvable = evolvableBox.isSelected();
					
					appController.updateSelected(selected, health, attack, evolvable, modifier, name);
				}
			}
		});
	}

}
