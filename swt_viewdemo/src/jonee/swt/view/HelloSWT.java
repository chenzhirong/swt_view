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
		Display display = new Display();// 创建一个Display对象
		Shell shell = new Shell(display);// 创建一个主窗体
		// shell.setSize(500, 3000);
		Text text = new Text(shell, SWT.NONE);// 实例化一个文本框
		text.setText("Hello SWT");// 设置文本内容
		// text.setBounds(x, y, width, height)
		text.pack();// 设置自动调节文本框大小
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
