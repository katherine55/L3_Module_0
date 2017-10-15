package IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.*;

public class TextUndoRedo implements KeyListener {

	JFrame myFrame = new JFrame();
	JPanel myPanel = new JPanel();
	JLabel myLabel = new JLabel();
	
	Stack<String> letters = new Stack<String>();

	void gui() {

		myFrame.addKeyListener(this);

		myPanel.add(myLabel);
		myFrame.add(myPanel);
		myFrame.pack();
		myFrame.setVisible(true);

	}



	/*
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look
	 * like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character
	 * is erased from the JLabel. Save that deleted character onto a Stack of
	 * Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed,
	 * the top Character is popped off the Stack and added back to the JLabel.
	 * 
	 */
	public static void main(String[] args) {
		TextUndoRedo gary = new TextUndoRedo();
		gary.gui();

	}

	@Override
	public void keyTyped(KeyEvent e) {
		letters.push(Character.toString(e.getKeyChar()));
		System.out.println(e.getKeyChar());

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
