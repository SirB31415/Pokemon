package poke.view;

import poke.controller.PokeController;
import javax.swing.JFrame;

public class PokeFrame extends JFrame
{
	private PokeController appController;
	private PokePanel appPanel;
/**
 * This initializes chatPanel and setupFrame and connects appController to JFrame
 * @param appController
 */
	public PokeFrame(PokeController appController)
	{
		super();
		this.appController = appController;
		appPanel = new PokePanel(appController);
		
		setupFrame();
	}
/**
 * This makes a method called setupFrame that sets up the frame of the window.
 */
	private void setupFrame()
	{

		this.setSize(500,500);
		this.setContentPane(appPanel);
		this.setTitle("Chatting with Chatbot");
		this.setResizable(false);
		this.setVisible(true);
	}
	public PokeController getAppController()
	{
		return appController;
	}
}
