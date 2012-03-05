package net.marioosh.swt.swtstart.controls;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Text;

public class FileOpenDialog extends Composite {
	
	public FileOpenDialog(Composite parent, int style) {
		super(parent, style);
		buildControls();
	}

	private void buildControls() {
		RowLayout layout = new RowLayout();
		layout.center = true;
		layout.spacing = 5;
		setLayout(layout);

		final Text file = new Text(this, SWT.BORDER | SWT.SINGLE | SWT.READ_ONLY);
		Button open = new Button(this, SWT.PUSH);
		open.setText("Open file");
		open.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent selectionevent) {
				FileDialog dialog = new FileDialog(getShell(), SWT.SINGLE);
				String filePath = dialog.open();
				file.setText(filePath);
			}
		});
	}
}
