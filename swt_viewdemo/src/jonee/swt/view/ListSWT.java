package jonee.swt.view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class ListSWT {
	/**
	 * @param args
	 *            1���б��List �ࣩ��ʽ�� SWT.NONE��Ĭ��ʽ���� SWT.V_SCROLL������ֱ��������
	 *            SWT.MULTI������ѡ�� SWT.SINGLE������ѡ��
	 */
	public static void main(String[] args) {
		Display display = new Display();// ����һ��Display����
		Shell shell = new Shell(display);// ����һ��������
		shell.setLayout(new FillLayout());
		shell.setSize(800, 300);

		final List list = new List(shell, SWT.NONE | SWT.MULTI);// ������ѡ��

		final Label value = new Label(shell, SWT.NONE);
		Button setValueBut = new Button(shell, SWT.NONE);
		setValueBut.setText("����");
		setValueBut.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				list.removeAll();
				for (int i = 1; i <= 10; i++) {
					list.add("��" + i + "��");
				}
				list.select(0);
				super.widgetSelected(e);
			}
		});
		Button lookBut = new Button(shell, SWT.NONE);
		lookBut.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				String[] info = list.getSelection();
				String data = "";
				for (int i = 0; i < info.length; i++) {
					data = data + info[i];

				}
				value.setText(data);
			}
		});
		lookBut.setText("�鿴ѡ��");

		shell.open();
		while (!shell.isDisposed()) {// ���shellû�йر�һֱѭ��
			if (!display.readAndDispatch()) {// ���dispaly��æ
				display.sleep();
			}
		}
		display.dispose();// ����

	}
}
