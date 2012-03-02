package net.marioosh.swt.swtstart;

import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridLayout;
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
		 * shell
		 */
		getShell().setText("Sample App");
		// getShell().setImage(new Image (getShell().getDisplay(), Start.class.getResourceAsStream (APP_ICON)));
		getShell().setMinimumSize(700, 340);
		// getShell().setLayout(new GridLayout(1, true));

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
