package jonee.swt.view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class TextSWT {
	/**
	 * @param args
	 *            SWT.V_SCROLL：带垂直滚动条。 SWT.H_SCROLL：带水平滚动条。
	 *            SWT.MULTI：可以输入多行，须回车换行。 SWT.WRAP：可以输入多行，到行尾后自动换行。
	 */
	public static void main(String[] args) {
		Display display = new Display();// 创建一个Display对象
		Shell shell = new Shell(display);// 创建一个主窗体
		shell.setLayout(new FillLayout());

		Text rowText = new Text(shell, SWT.NONE);// 普通文本框、、SWT.NONE：默认式样。
		rowText.setText("一行数据");
		// 密码
		Text pwdText = new Text(shell, SWT.PASSWORD);// 普通文本框、、SWT.NONE：默认式样。
		// 多行文本框
		Text dText1 = new Text(shell, SWT.WRAP | SWT.V_SCROLL);
		dText1.setText("一行数据WRAP");
		Text dText2 = new Text(shell, SWT.MULTI | SWT.V_SCROLL | SWT.H_SCROLL);
		dText2.setText("一行数据MULTI");
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
