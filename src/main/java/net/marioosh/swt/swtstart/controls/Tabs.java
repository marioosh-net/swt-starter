package net.marioosh.swt.swtstart.controls;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;

/**
 * 1. zakladki (TabItem) dodajemy do folderu zakladek (TabFolder) ustawiajac parent jako obiekt TabFolder
 * 2. setControl na TabItem przydziela dana kontrolke (np kontener Composite) do danej zakladki
 */
public class Tabs extends Composite {
	private TabFolder tabFolder;

	public TabFolder getTabFolder() {
		return tabFolder;
	}
	
	public Tabs(Composite parent, int style) {
		super(parent, style);
		buildControls();
	}

	private void buildControls() {
		setLayout(new FillLayout());
		tabFolder = new TabFolder(this, SWT.NULL);
		
		TabItem tab1 = new TabItem(tabFolder, SWT.NULL);
		tab1.setText("Tab 1");
		tab1.setControl(new Composite(tabFolder, SWT.NULL));
        
        TabItem tab2 = new TabItem(tabFolder, SWT.NULL);
        tab2.setText("Tab 2");
        tab2.setControl(new Composite(tabFolder, SWT.NULL));
        
        TabItem tab3 = new TabItem(tabFolder, SWT.NULL);
        tab3.setText("Tab 3");
        tab3.setControl(new Composite(tabFolder, SWT.NULL));
	}
	
	public TabItem getTab(int index) {
		return tabFolder.getItem(index);
	}
}
