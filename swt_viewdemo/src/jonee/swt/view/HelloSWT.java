package jonee.swt.view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class HelloSWT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = new Display();// ����һ��Display����
		Shell shell = new Shell(display);// ����һ��������
		// shell.setSize(500, 3000);
		Text text = new Text(shell, SWT.NONE);// ʵ����һ���ı���
		text.setText("Hello SWT");// �����ı�����
		// text.setBounds(x, y, width, height)
		text.pack();// �����Զ������ı����С
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
