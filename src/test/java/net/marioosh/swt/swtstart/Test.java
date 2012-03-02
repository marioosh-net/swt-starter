package net.marioosh.swt.swtstart;


import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;

public class Test {

	/**
	 * @param args
	 */

		public static void main(String[] args) {

			Display display = new Display();
			final Shell shell = new Shell(display);
			shell.setLayout(new GridLayout(3, false));

			Button b = new Button(shell, SWT.PUSH);
			b.setText("Button 0");

			final Button bHidden = new Button(shell, SWT.PUSH);
			bHidden.setText("Button 1");
			GridData data = new GridData();
			data.exclude = true;
			data.horizontalSpan = 2;
			data.horizontalAlignment = SWT.FILL;
			bHidden.setLayoutData(data);

			b = new Button(shell, SWT.PUSH);
			b.setText("Button 2");
			b = new Button(shell, SWT.PUSH);
			b.setText("Button 3");
			b = new Button(shell, SWT.PUSH);
			b.setText("Button 4");

			b = new Button(shell, SWT.CHECK);
			b.setText("hide");
			b.setSelection(true);
			b.addListener(SWT.Selection, new Listener() {
				public void handleEvent(Event e) {
					Button b = (Button) e.widget;
					GridData data = (GridData) bHidden.getLayoutData();
					data.exclude = b.getSelection();
					bHidden.setVisible(!data.exclude);
					shell.layout(false);
				}
			});
			shell.setSize(400, 400);
			shell.open();
			while (!shell.isDisposed()) {
				if (!display.readAndDispatch())
					display.sleep();
			}
			display.dispose();
		}	

		/*
		public static void main(String[] args) {
			final Display display = new Display();
			Shell shell = new Shell(display);
			shell.setLayout(new FillLayout());
			Browser browser = null;
			try {
				browser = new Browser(shell, SWT.NONE);
			} catch (SWTError e) {

			}
			if (browser != null) {
				browser.setUrl("http://www.eclipse.org");
			}
			shell.open();
			while (!shell.isDisposed()) {
				if (!display.readAndDispatch())
					display.sleep();
			}
			display.dispose();
		}
		*/
		
}
