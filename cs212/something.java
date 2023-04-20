import javax.swing.*;
import java.awt.*;
public class SampleGUI extends JFrame {
	JMenuBar    menuBar  = new JMenuBar();
	
	public SampleGUI(String title, int height, int width) {
		setTitle(title);
		setSize(height,width);
		setLocation  (400,200);
		createFileMenu();
		createEditMenu();
		setJMenuBar(menuBar);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	} //SSNGUI

	private void createFileMenu( ) {
		JMenuItem   item;
		//JMenuBar    menuBar  = new JMenuBar();
		JMenu       fileMenu = new JMenu("File");
		FileMenuHandler fmh  = new FileMenuHandler(this);

		item = new JMenuItem("Open");    //Open...
		item.addActionListener( fmh );
		fileMenu.add( item );

		fileMenu.addSeparator();           //add a horizontal separator line

		item = new JMenuItem("Quit");       //Quit
		item.addActionListener( fmh );
		fileMenu.add( item );

		//setJMenuBar(menuBar);
		menuBar.add(fileMenu);

	} //createMenu
	
	private void createEditMenu( ) {
		JMenuItem   item;
		//JMenuBar    menuBar  = new JMenuBar();
		JMenu       editMenu = new JMenu("Edit");
		EditMenuHandler emh  = new EditMenuHandler(this);

		item = new JMenuItem("Find");    //Find...
		item.addActionListener(emh);
		editMenu.add(item);

		editMenu.addSeparator();           //add a horizontal separator line

		item = new JMenuItem("Replace");       //Replace
		item.addActionListener( emh );
		editMenu.add(item );

		//setJMenuBar(menuBar);
		menuBar.add(editMenu);

	} //createMenu

} //SSNGUI