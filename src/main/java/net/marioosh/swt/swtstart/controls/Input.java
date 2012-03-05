package net.marioosh.swt.swtstart.controls;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * input text
 */
public class Input extends Composite {
	
	public Input(Composite parent, int style) {
		super(parent, style);
		buildControls();
	}

	private void buildControls() {
		RowLayout layout = new RowLayout();
		layout.center = true;
		setLayout(layout);
		
		new Label(this, SWT.BOLD).setText("Name");
		final Text text = new Text(this, SWT.SINGLE | SWT.BORDER);
		text.setBackground(getShell().getDisplay().getSystemColor(SWT.COLOR_WHITE));
		
		Button send = new Button(this, SWT.PUSH);
		send.setText("Send");
		send.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent selectionevent) {
				MessageDialog dialog = new MessageDialog(getShell(), "Input", null, text.getText(), MessageDialog.INFORMATION, new String[] { "Ok" }, 0);
				dialog.open();							
			}
		});
		
		Button clear = new Button(this, SWT.PUSH);
		clear.setText("Clear");
		clear.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent selectionevent) {
				text.setText("");
			}
		});
		
	}
}
