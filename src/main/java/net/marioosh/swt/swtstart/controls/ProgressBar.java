package net.marioosh.swt.swtstart.controls;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

/**
 * input text
 */
public class ProgressBar extends Composite {
	
	public ProgressBar(Composite parent, int style) {
		super(parent, style);
		buildControls();
	}

	private void buildControls() {
		RowLayout layout = new RowLayout();
		layout.center = true;
		setLayout(layout);
		
		Button send = new Button(this, SWT.PUSH);
		send.setText("Long running job");
		send.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent selectionevent) {
				

				IRunnableWithProgress runnable = new IRunnableWithProgress() {
					public void run(final IProgressMonitor progressMonitor) throws InterruptedException {
						progressMonitor.beginTask("Pobieranie danych...", 100);
						try {
							progressMonitor.internalWorked(25);
							Thread.sleep(1000);	// TEST
							if (progressMonitor.isCanceled()) {
								throw new InterruptedException();
							}														
							progressMonitor.internalWorked(25);
							Thread.sleep(1000);	// TEST
							if (progressMonitor.isCanceled()) {
								throw new InterruptedException();
							}														
							progressMonitor.internalWorked(25);
							Thread.sleep(1000);	// TEST
							if (progressMonitor.isCanceled()) {
								throw new InterruptedException();
							}							
							progressMonitor.internalWorked(25);
						} catch (final InterruptedException e) {
							getDisplay().asyncExec(new Runnable() {
								public void run() {
									MessageDialog dialog1 = new MessageDialog(getShell(), "Error", null, "Canceled", MessageDialog.ERROR, new String[] { "Ok" }, 0);
									dialog1.open();					
								}
							});							
						} catch (final Exception e) {
							getDisplay().asyncExec(new Runnable() {
								public void run() {
									MessageDialog dialog1 = new MessageDialog(getShell(), "Error", null, "Some error", MessageDialog.ERROR, new String[] { "Ok" }, 0);
									dialog1.open();					
								}
							});
						}
						progressMonitor.done();
					}
				};
				try {
					new ProgressMonitorDialog(getShell()).run(true, true, runnable);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
			}
		});
	}
}
