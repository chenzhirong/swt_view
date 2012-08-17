package jonee.swt.view;

import java.awt.GridBagLayout;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class ButtonSWT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = new Display();// ����һ��Display����
		Shell shell = new Shell(display);// ����һ��������
		shell.setLayout(new FillLayout());
		Button but1 = new Button(shell, SWT.NONE);
		but1.setText("NONE");

		Button but2 = new Button(shell, SWT.PUSH | SWT.BORDER);
		but2.setText("PUSH");
		// ��ѡ��ť
		Button check1 = new Button(shell, SWT.CHECK);
		check1.setText("CHECK1");
		Button check2 = new Button(shell, SWT.CHECK);
		check2.setText("CHECK2");
		// ��ѡ��ť
		Button radio1 = new Button(shell, SWT.RADIO);
		radio1.setText("RADIO");
		Button radio2 = new Button(shell, SWT.RADIO);
		radio2.setText("RADIO");
		// ��ͷ��ť
		Button arrowLeft = new Button(shell, SWT.ARROW | SWT.LEFT);
		Button arrowRight = new Button(shell, SWT.RIGHT | SWT.ARROW);
		Button arrowUp = new Button(shell, SWT.UP | SWT.ARROW);
		Button arrowDown = new Button(shell, SWT.DOWN | SWT.ARROW);

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
