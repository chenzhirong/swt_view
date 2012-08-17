package jonee.swt.view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class TextSWT {
	/**
	 * @param args
	 *            SWT.V_SCROLL������ֱ�������� SWT.H_SCROLL����ˮƽ��������
	 *            SWT.MULTI������������У���س����С� SWT.WRAP������������У�����β���Զ����С�
	 */
	public static void main(String[] args) {
		Display display = new Display();// ����һ��Display����
		Shell shell = new Shell(display);// ����һ��������
		shell.setLayout(new FillLayout());

		Text rowText = new Text(shell, SWT.NONE);// ��ͨ�ı��򡢡�SWT.NONE��Ĭ��ʽ����
		rowText.setText("һ������");
		// ����
		Text pwdText = new Text(shell, SWT.PASSWORD);// ��ͨ�ı��򡢡�SWT.NONE��Ĭ��ʽ����
		// �����ı���
		Text dText1 = new Text(shell, SWT.WRAP | SWT.V_SCROLL);
		dText1.setText("һ������WRAP");
		Text dText2 = new Text(shell, SWT.MULTI | SWT.V_SCROLL | SWT.H_SCROLL);
		dText2.setText("һ������MULTI");
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
