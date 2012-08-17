package jonee.swt.view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;

public class TabfolderSWT {

	/**
	 * @param args
	 *            选项卡
	 */
	public static void main(String[] args) {
		Display display = new Display();// 创建一个Display对象
		Shell shell = new Shell(display);// 创建一个主窗体
		shell.setLayout(new FillLayout());
		shell.setSize(300, 200);

		TabFolder tabfolder1 = new TabFolder(shell, SWT.NONE);
		TabItem tabItem1 = new TabItem(tabfolder1, SWT.NONE);
		tabItem1.setText("tabItem1");
		
		

		{
			Group group = new Group(tabfolder1, SWT.None);
			tabItem1.setControl(group);
			group.setText("登陆");
			group.setLayout(new GridLayout());
			group.setBounds(20, 20, 500, 430);
			{
				Label label1 = new Label(group, SWT.NONE);
				label1.setText("USER");
				Text text = new Text(group, SWT.NONE | SWT.BORDER);
				Label label2 = new Label(group, SWT.NONE);
				label2.setText("password");
				Text text2 = new Text(group, SWT.NONE | SWT.BORDER);

			}
		}
		TabItem tabItem2 = new TabItem(tabfolder1, SWT.NONE);
		tabItem2.setText("tabItem12");
		
		{
			Group group = new Group(tabfolder1, SWT.None);
			tabItem2.setControl(group);
			group.setText("爱好");
			group.setLayout(new GridLayout());
			group.setBounds(20, 20, 500, 430);
			{
				Label label1 = new Label(group, SWT.NONE);
				label1.setText("USER");
				Text text = new Text(group, SWT.NONE | SWT.BORDER);
				Label label2 = new Label(group, SWT.NONE);
				label2.setText("password");
				Text text2 = new Text(group, SWT.NONE | SWT.BORDER);

			}
		}

		shell.open();
		while (!shell.isDisposed()) {// 如果shell没有关闭一直循环
			if (!display.readAndDispatch()) {// 如果dispaly不忙
				display.sleep();
			}
		}
		display.dispose();// 销毁

	}

}
