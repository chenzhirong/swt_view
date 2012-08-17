package jonee.swt.view;

import java.awt.GridBagLayout;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class ButtonSWT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = new Display();// 创建一个Display对象
		Shell shell = new Shell(display);// 创建一个主窗体
		shell.setLayout(new FillLayout());
		Button but1 = new Button(shell, SWT.NONE);
		but1.setText("NONE");

		Button but2 = new Button(shell, SWT.PUSH | SWT.BORDER);
		but2.setText("PUSH");
		// 多选按钮
		Button check1 = new Button(shell, SWT.CHECK);
		check1.setText("CHECK1");
		Button check2 = new Button(shell, SWT.CHECK);
		check2.setText("CHECK2");
		// 单选按钮
		Button radio1 = new Button(shell, SWT.RADIO);
		radio1.setText("RADIO");
		Button radio2 = new Button(shell, SWT.RADIO);
		radio2.setText("RADIO");
		// 箭头按钮
		Button arrowLeft = new Button(shell, SWT.ARROW | SWT.LEFT);
		Button arrowRight = new Button(shell, SWT.RIGHT | SWT.ARROW);
		Button arrowUp = new Button(shell, SWT.UP | SWT.ARROW);
		Button arrowDown = new Button(shell, SWT.DOWN | SWT.ARROW);

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
