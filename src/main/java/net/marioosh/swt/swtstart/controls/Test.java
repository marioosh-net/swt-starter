package net.marioosh.swt.swtstart.controls;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

public class Test extends Composite {
	
	public Test(Composite parent, int style) {
		super(parent, style);
		populateControls(parent);
	}

	private void populateControls(Composite parent) {
		setLayout(new FillLayout());
		new Button(parent, SWT.PUSH).setText("Button");
		new Text(parent, SWT.BOLD).setText("Label");
	}
}
