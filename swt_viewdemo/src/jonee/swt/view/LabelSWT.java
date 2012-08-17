package jonee.swt.view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class LabelSWT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = new Display();// ����һ��Display����
		Shell shell = new Shell(display);// ����һ��������
		shell.setLayout(new FillLayout());

		Label label1 = new Label(shell, SWT.PUSH);
		label1.setText("��ǩһ");
		Label label2 = new Label(shell, SWT.PUSH);
		label2.setText("��ǩ��");
		label2.setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_RED));
		label2.setFont(new Font(display, "����", 15, SWT.PUSH));// ��������
		Label label3 = new Label(shell, SWT.HORIZONTAL | SWT.SEPARATOR
				| SWT.BORDER);
		Label label4 = new Label(shell, SWT.SEPARATOR | SWT.BORDER);

		shell.pack();
		shell.open();
		while (!shell.isDisposed()) {// ���shellû�йر�һֱѭ��
			if (!display.readAndDispatch()) {// ���dispaly��æ
				display.sleep();
			}
		}
		display.dispose();// ����

	}

}
