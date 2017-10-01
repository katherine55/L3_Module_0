package IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class GuestBook implements ActionListener {

	JFrame myFrame;
	JPanel myPanel;
	JButton add;
	JButton view;

	ArrayList<String> guestbook = new ArrayList<String>();

	public static void main(String[] args) {

		GuestBook gary = new GuestBook();
		gary.gui();

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == add) {

			String name = JOptionPane.showInputDialog("Plese enter a name:");
			guestbook.add(name);

		}

		if (e.getSource() == view) {

			for (int i = 0; i < guestbook.size(); i++) {
				System.out.println("Guest #" + (i + 1) + ": " + guestbook.get(i));

			}
		}
	}

	void gui() {

		myFrame = new JFrame();
		myPanel = new JPanel();
		add = new JButton("Add Name");
		view = new JButton("View Names");

		add.addActionListener(this);
		view.addActionListener(this);

		myPanel.add(add);
		myPanel.add(view);
		myFrame.add(myPanel);
		myFrame.pack();
		myFrame.setVisible(true);
	}

	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners

}
