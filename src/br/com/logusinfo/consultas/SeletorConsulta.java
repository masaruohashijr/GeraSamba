package br.com.logusinfo.consultas;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import br.com.logusinfo.consultas.events.ConsultasComboSelection;
import br.com.logusinfo.consultas.events.GerarSelection;
import br.com.logusinfo.consultas.services.ConsultasService;

public class SeletorConsulta {

	Display d;
	Shell s;

	public SeletorConsulta() {
		d = new Display();
		s = new Shell(d);
		s.setLocation(350, 100);
		s.setSize(500, 500);
		s.setText("Gera Samba");
		s.setLayout(new GridLayout(1, false));
		new Label(s, SWT.NONE).setText("Consultas");
		final Combo c = new Combo(s, SWT.DROP_DOWN | SWT.WRAP);
		GridData data = new GridData();
		data.widthHint = 300;
		c.setLayoutData(data);
		c.setBounds(50, 50, 300, 100);
		
		ConsultasService consultasService = new ConsultasService();

		c.setItems(consultasService.getTitulosConsultas());
		c.addSelectionListener(new ConsultasComboSelection());

		Button button = new Button(s, SWT.BUTTON1);
		button.setText("Gera");
		
		Text textArea = new Text(s, SWT.MULTI | SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
	    textArea.setLayoutData(new GridData(GridData.FILL_BOTH));

	    button.addSelectionListener(new GerarSelection(c, textArea));
		
		s.open();
		while (!s.isDisposed()) {
			if (!d.readAndDispatch())
				d.sleep();
		}
		d.dispose();
	}

	public static void main(String[] argv) {
		new SeletorConsulta();
	}
}
