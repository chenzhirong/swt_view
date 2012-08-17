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
	 *            1．列表框（List 类）的式样 SWT.NONE：默认式样。 SWT.V_SCROLL：带垂直滚动条。
	 *            SWT.MULTI：允许复选。 SWT.SINGLE：允许单选。
	 */
	public static void main(String[] args) {
		Display display = new Display();// 创建一个Display对象
		Shell shell = new Shell(display);// 创建一个主窗体
		shell.setLayout(new FillLayout());
		shell.setSize(800, 300);

		final List list = new List(shell, SWT.NONE | SWT.MULTI);// 创建复选框

		final Label value = new Label(shell, SWT.NONE);
		Button setValueBut = new Button(shell, SWT.NONE);
		setValueBut.setText("设置");
		setValueBut.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				list.removeAll();
				for (int i = 1; i <= 10; i++) {
					list.add("第" + i + "项");
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
		lookBut.setText("查看选中");

		shell.open();
		while (!shell.isDisposed()) {// 如果shell没有关闭一直循环
			if (!display.readAndDispatch()) {// 如果dispaly不忙
				display.sleep();
			}
		}
		display.dispose();// 销毁

	}
}
