package jonee.swt.view;

/**
 * Composite �ĳ��÷�����
 getLayout()���õ����ֹ�������
 getLayoutData()���õ��������ݡ�
 getParent()���õ����ɸ������ĸ�������
 getShell()���õ����ɸ������� Shell��
 layout()���������ϵ�������²��֣��൱��ˢ�¡�
 * @author Administrator
 *
 */

import org.eclipse.swt.SWT;

import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Display;

public class CompositeSWT {

	public static void main(String[] args) {
		Display display = new Display();// ����һ��display����
		final Shell shell = new Shell(display);// shell�ǳ����������
		shell.setText("����ʾ��");
		Composite composite1 = new Composite(shell, SWT.NONE);
		composite1.setBounds(10, 10, 100, 50);
		Composite composite2 = new Composite(shell, SWT.BORDER);
		composite2.setBounds(120, 10, 100, 50);
		Label lb1 = new Label(composite1, SWT.NONE);
		lb1.setText("���1");
		lb1.pack();
		Label lb2 = new Label(composite2, SWT.NONE);
		lb2.setText("���2");
		lb2.pack();
		shell.pack();
		shell.open();

		while (!shell.isDisposed()) {
			// ���������û�йر���һֱѭ��

			if (!display.readAndDispatch()) { // ���display��æ

			}
			display.sleep();
		}
		display.dispose();
	}

}
