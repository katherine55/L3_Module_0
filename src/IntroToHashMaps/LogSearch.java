package IntroToHashMaps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.*;

public class LogSearch implements ActionListener {

	HashMap<Integer, String> log = new HashMap<Integer, String>();

	JFrame myFrame = new JFrame();
	JPanel myPanel = new JPanel();

	JButton add = new JButton("Add Entry");
	JButton search = new JButton("Search by ID");
	JButton view = new JButton("View List");

	public static void main(String[] args) {

		LogSearch myLog = new LogSearch();
		myLog.gui();
	}

	/*
	 * Crate a HashMap of Integers for the keys and Strings for the values. Create a
	 * GUI with three buttons. Button 1: Add Entry When this button is clicked, use
	 * an input dialog to ask the user to enter an ID number. After an ID is
	 * entered, use another input dialog to ask the user to enter a name. Add this
	 * information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID When this button is clicked, use an input dialog to
	 * ask the user to enter an ID number. If that ID exists, display that name to
	 * the user. Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List When this button is clicked, display the entire list in a
	 * message dialog in the following format: ID: 123 Name: Harry Howard ID: 245
	 * Name: Polly Powers ID: 433 Name: Oliver Ortega etc...
	 * 
	 * When this is complete, add a fourth button to your window. Button 4: Remove
	 * Entry When this button is clicked, prompt the user to enter an ID using an
	 * input dialog. If this ID exists in the HashMap, remove it. Otherwise, notify
	 * the user that the ID is not in the list.
	 *
	 */

	void gui() {

		add.addActionListener(this);
		search.addActionListener(this);
		view.addActionListener(this);

		myPanel.add(add);
		myPanel.add(search);
		myPanel.add(view);

		myFrame.add(myPanel);
		myFrame.pack();
		myFrame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == add) {
			String name = JOptionPane.showInputDialog("Please enter a name:");
			String number = JOptionPane.showInputDialog("Now enter an ID number:");
			int ID = Integer.parseInt(number);
			log.put(ID, name);
		}

		if (e.getSource() == search) {
			String find = JOptionPane.showInputDialog("Search by ID:");
			int searchID = Integer.parseInt(find);

			if (log.containsKey(searchID)) {

				System.out.println("The person at ID " + searchID + " is: " + log.get(searchID));

			}
			else {
				
				System.out.println("Sorry, the person you are looking for is not in our log. Try again by clicking 'Search by ID'");
				
			}

		}

		if (e.getSource() == view) {

			String list = "";
			
			for(int i : log.keySet()) {
				
				list += "ID: " + i + " Name: " + log.get(i) +"\n";
				
			}
			
			JOptionPane.showMessageDialog(null, list);
			
		}

	}
}
