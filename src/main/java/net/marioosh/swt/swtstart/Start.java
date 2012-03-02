package net.marioosh.swt.swtstart;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;

public class Start extends ApplicationWindow {

	final static String APP_ICON = "Apple-256.png";

	public Start() {
		super(null);
	}

	protected Control createContents(Composite parent) {

		/**
		 * app title, icon, size
		 */
		getShell().setText("Sample App");
		getShell().setImage(new Image (getShell().getDisplay(), ClassLoader.getSystemResourceAsStream(APP_ICON)));
		getShell().setMinimumSize(700, 340);
		
		/**
		 * main window layout
		 */
		getShell().setLayout(new GridLayout(1, true));

		/**
		 * button example
		 */
		Button button = new Button(getShell(), SWT.PUSH);
		button.setText("Button");
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				MessageDialog dialog = new MessageDialog(getShell(), "Title", null, "Message ..... .", MessageDialog.INFORMATION, new String[] { "Ok" }, 0);
				dialog.open();							
			}
		});
		
		// parent.pack();
		return parent;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Start awin = new Start();
		awin.setBlockOnOpen(true);
		awin.open();
		Display.getCurrent().dispose();
	}

}
