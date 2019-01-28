import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.dnd.*;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.internal.SWTEventListener;

import org.eclipse.swt.widgets.Button;

public class CityWindow {
	
	

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		
		int operations = DND.DROP_MOVE | DND.DROP_COPY;
		
		City c = new City("Mini-Spokane");
		
		Person[] people = {new Person(), new Person("Johnny", 21),
	            new Police(), new Police("Bryant", 55, Role.Chief),
	            new Teacher(), new Teacher("Sharie", 34, 15, "CS Professor"),
	            new Kid(), new Kid("Bobbie", 12, "KitKat", true)};

		CityHall cityhall = new CityHall("MS City Hall");
		School[] schools = {new School("MS K-12 School"), new School("MS College")};
		
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setVisible(true);
		shell.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
		shell.setSize(800, 400);
		shell.setText("SWT Application");
		
		Label lblCityName = new Label(shell, SWT.BORDER | SWT.HORIZONTAL | SWT.SHADOW_IN | SWT.RIGHT);
		lblCityName.setTouchEnabled(true);
		lblCityName.setFont(SWTResourceManager.getFont("MS Gothic", 12, SWT.BOLD | SWT.ITALIC));
		lblCityName.setForeground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
		lblCityName.setBackground(SWTResourceManager.getColor(SWT.COLOR_MAGENTA));
		lblCityName.setAlignment(SWT.CENTER);
		lblCityName.setBounds(310, 10, 180, 22);
		lblCityName.setText(c.toString());
		
		Label lblRoad = new Label(shell, SWT.NONE);
		lblRoad.setImage(SWTResourceManager.getImage(CityWindow.class, "/resources/road-texture.jpg"));
		lblRoad.setBounds(0, 273, 782, 80);
		
		Label lblInfo = new Label(shell, SWT.BORDER);
		lblInfo.setFont(SWTResourceManager.getFont("Segoe UI Semilight", 9, SWT.NORMAL));
		lblInfo.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		lblInfo.setBounds(496, 0, 286, 120);
		lblInfo.setText("Nothing selected.");
		
		Button btnCityHall = new Button(shell, SWT.NONE);
		btnCityHall.setCursor(SWTResourceManager.getCursor(SWT.CURSOR_HAND));
		btnCityHall.setImage(SWTResourceManager.getImage(CityWindow.class, "/resources/City hall.jpg"));
		btnCityHall.setBounds(10, 167, 100, 100);
		
		Label lblSchool1 = new Label(shell, SWT.NONE);
		lblSchool1.setCursor(SWTResourceManager.getCursor(SWT.CURSOR_HAND));
		lblSchool1.setImage(SWTResourceManager.getImage(CityWindow.class, "/resources/School.jpg"));
		lblSchool1.setBounds(496, 167, 100, 100);
		
		Label lblSchool2 = new Label(shell, SWT.NONE);
		lblSchool2.setCursor(SWTResourceManager.getCursor(SWT.CURSOR_HAND));
		lblSchool2.setImage(SWTResourceManager.getImage(CityWindow.class, "/resources/School.jpg"));
		lblSchool2.setBounds(623, 167, 100, 100);
		
		Label lblPerson = new Label(shell, SWT.NONE);
		lblPerson.setBackground(SWTResourceManager.getColor(SWT.COLOR_CYAN));
		lblPerson.setBounds(169, 139, 50, 50);
		lblPerson.setText("Person");
		
		
		Label lblPerson_1 = new Label(shell, SWT.NONE);
		lblPerson_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_CYAN));
		lblPerson_1.setBounds(324, 139, 50, 50);
		lblPerson_1.setText("Person");
		
		Label lblPolice = new Label(shell, SWT.NONE);
		lblPolice.setBackground(SWTResourceManager.getColor(SWT.COLOR_BLUE));
		lblPolice.setBounds(250, 205, 50, 50);
		lblPolice.setText("Police");
		
		Label lblTeacher = new Label(shell, SWT.NONE);
		lblTeacher.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
		lblTeacher.setBounds(381, 205, 50, 50);
		lblTeacher.setText("Teacher");
		btnCityHall.addMouseListener(new MouseListener() {

			@Override
			public void mouseDoubleClick(MouseEvent arg0) {
			}

			@Override
			public void mouseDown(MouseEvent arg0) {
				lblInfo.setText(cityhall.toString());
			}

			@Override
			public void mouseUp(MouseEvent arg0) {
			}
		
		});
		
		lblSchool1.addMouseListener(new MouseListener() {

			@Override
			public void mouseDoubleClick(MouseEvent arg0) {
			}

			@Override
			public void mouseDown(MouseEvent arg0) {
				lblInfo.setText(schools[0].toString());
			}

			@Override
			public void mouseUp(MouseEvent arg0) {
			}
		
		});
		
		lblSchool2.addMouseListener(new MouseListener() {

			@Override
			public void mouseDoubleClick(MouseEvent arg0) {
			}

			@Override
			public void mouseDown(MouseEvent arg0) {
				lblInfo.setText(schools[1].toString());
			}

			@Override
			public void mouseUp(MouseEvent arg0) {
			}
		
		});
		
		lblPerson.addMouseListener(new MouseListener() {

			@Override
			public void mouseDoubleClick(MouseEvent arg0) {
			}

			@Override
			public void mouseDown(MouseEvent arg0) {
				lblInfo.setText(people[0].toString());
			}

			@Override
			public void mouseUp(MouseEvent arg0) {
			}
		
		});
		lblPerson_1.addMouseListener(new MouseListener() {

			@Override
			public void mouseDoubleClick(MouseEvent arg0) {
			}

			@Override
			public void mouseDown(MouseEvent arg0) {
				lblInfo.setText(people[1].toString());
			}

			@Override
			public void mouseUp(MouseEvent arg0) {
			}
		
		});
		
		lblPolice.addMouseListener(new MouseListener() {

			@Override
			public void mouseDoubleClick(MouseEvent arg0) {
			}

			@Override
			public void mouseDown(MouseEvent arg0) {
				lblInfo.setText(people[3].toString());
			}

			@Override
			public void mouseUp(MouseEvent arg0) {
			}
		
		});
		
		lblTeacher.addMouseListener(new MouseListener() {

			@Override
			public void mouseDoubleClick(MouseEvent arg0) {
			}

			@Override
			public void mouseDown(MouseEvent arg0) {
				lblInfo.setText(people[5].toString());
			}

			@Override
			public void mouseUp(MouseEvent arg0) {
			}
		
		});

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
