package net.marioosh.swt.swtstart.controls;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

/**
 * testowy komponent (kontener) wyciagniety do osobnej klasy
 */
public class Test extends Composite {
	
	public Test(Composite parent, int style) {
		super(parent, style);
		buildControls();
	}

	private void buildControls() {
		setLayout(new FillLayout());
		new Button(this, SWT.PUSH).setText("Button");
		new Text(this, SWT.BOLD).setText("Label");
	}
}
