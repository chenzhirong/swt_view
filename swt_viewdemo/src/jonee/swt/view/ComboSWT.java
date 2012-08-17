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
	 *            1．下拉框（Combo 类）的式样 SWT.NONE：默认式样。 SWT.READ_ONLY：只读。
	 *            SWT.SIMPLE：无须单击下拉框，列表会一直显示。 2．下拉框（Combo 类）的常用方法 add(String
	 *            string)：在 Combo 中增加一项。 add(String string,int index)：在 Combo 的第
	 *            index 项后插入一项。 deselectAll()：使 Combo 组件中的当前选择项置空。 removeAll()：将
	 *            Combo 中的所有选项清空。 setItems(String[] items)：将数组中的各项依次加入到 Combo 中。
	 *            select(int index)：将 Combo 的第 index+1 项设置为当前选择项。
	 */
	public static void main(String[] args) {
		Display display = new Display();// 创建一个Display对象
		Shell shell = new Shell(display);// 创建一个主窗体
		shell.setLayout(new FillLayout());

		final Combo combo1 = new Combo(shell, SWT.NONE);
		final Label value = new Label(shell, SWT.NONE);
		Button setValueBut = new Button(shell, SWT.NONE);
		setValueBut.setText("设置");
		setValueBut.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				combo1.removeAll();
				for (int i = 1; i <= 3; i++) {
					combo1.add("第" + i + "项");
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
		lookBut.setText("查看选中");

		shell.pack();
		shell.open();
		while (!shell.isDisposed()) {// 如果shell没有关闭一直循环
			if (!display.readAndDispatch()) {// 如果dispaly不忙
				display.sleep();
			}
		}
		display.dispose();// 销毁

	}
}
