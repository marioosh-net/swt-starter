package net.marioosh.swt.swtstart;

import net.marioosh.swt.swtstart.controls.Tabs;
import net.marioosh.swt.swtstart.controls.Test;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Start extends ApplicationWindow {

	final static String APP_ICON = "Apple-256.png";

	public Start() {
		super(null);
	}
	
	@Override
	protected boolean showTopSeperator() {
		return false;
	}

	protected Control createContents(final Composite parent) {

		/**
		 * app title, icon, size
		 */
		getShell().setText("Sample App");
		getShell().setImage(new Image (parent.getDisplay(), ClassLoader.getSystemResourceAsStream(APP_ICON)));
		getShell().setMinimumSize(700, 340);
		
		/**
		 * main window layout
		 * getShell() equals parent
		 */
		parent.setLayout(new GridLayout(1, false));

		/**
		 * button example
		 */
		Button button = new Button(parent, SWT.PUSH);
		button.setText("Button");
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				MessageDialog dialog = new MessageDialog((Shell) parent, "Title", null, "Message ..... .", MessageDialog.INFORMATION, new String[] { "Ok" }, 0);
				dialog.open();							
			}
		});
		
		/**
		 * some controls in outside class
		 */
		new Test(parent, SWT.NULL);
		
		/**
		 * tabs controls
		 */
		Tabs tabs = new Tabs(parent, SWT.NONE);
		Composite tab1Container = (Composite) tabs.getTab(0).getControl();
		tab1Container.setLayout(new FillLayout());
		new Button(tab1Container, SWT.PUSH).setText("Tab1 button");
		
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
