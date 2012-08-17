package jonee.swt.view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class ComboSWT {
	/**
	 * @param args
	 * 
	 *            1��������Combo �ࣩ��ʽ�� SWT.NONE��Ĭ��ʽ���� SWT.READ_ONLY��ֻ����
	 *            SWT.SIMPLE�����뵥���������б��һֱ��ʾ�� 2��������Combo �ࣩ�ĳ��÷��� add(String
	 *            string)���� Combo ������һ� add(String string,int index)���� Combo �ĵ�
	 *            index ������һ� deselectAll()��ʹ Combo ����еĵ�ǰѡ�����ÿա� removeAll()����
	 *            Combo �е�����ѡ����ա� setItems(String[] items)���������еĸ������μ��뵽 Combo �С�
	 *            select(int index)���� Combo �ĵ� index+1 ������Ϊ��ǰѡ���
	 */
	public static void main(String[] args) {
		Display display = new Display();// ����һ��Display����
		Shell shell = new Shell(display);// ����һ��������
		shell.setLayout(new FillLayout());

		final Combo combo1 = new Combo(shell, SWT.NONE);
		final Label value = new Label(shell, SWT.NONE);
		Button setValueBut = new Button(shell, SWT.NONE);
		setValueBut.setText("����");
		setValueBut.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				combo1.removeAll();
				for (int i = 1; i <= 3; i++) {
					combo1.add("��" + i + "��");
				}
				combo1.select(0);
				super.widgetSelected(e);
			}
		});
		Button lookBut = new Button(shell, SWT.NONE);
		lookBut.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				value.setText(combo1.getText());

			}
		});
		lookBut.setText("�鿴ѡ��");

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
