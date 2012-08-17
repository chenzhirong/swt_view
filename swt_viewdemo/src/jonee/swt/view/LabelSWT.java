package jonee.swt.view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class LabelSWT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = new Display();// 创建一个Display对象
		Shell shell = new Shell(display);// 创建一个主窗体
		shell.setLayout(new FillLayout());

		Label label1 = new Label(shell, SWT.PUSH);
		label1.setText("标签一");
		Label label2 = new Label(shell, SWT.PUSH);
		label2.setText("标签二");
		label2.setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_RED));
		label2.setFont(new Font(display, "黑体", 15, SWT.PUSH));// 设置字体
		Label label3 = new Label(shell, SWT.HORIZONTAL | SWT.SEPARATOR
				| SWT.BORDER);
		Label label4 = new Label(shell, SWT.SEPARATOR | SWT.BORDER);

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
