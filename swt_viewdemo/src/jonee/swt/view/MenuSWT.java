package jonee.swt.view;

/**
 * SWT.BAR：菜单栏，用于主菜单。
 SWT.DROP_DOWN：下拉菜单，用于子菜单。
 SWT.POP_UP：鼠标右键弹出式菜单。
 2．MenuItem 的式样
 SWT.CASCADE：有子菜单的菜单项。
 SWT.CHECK：选中后前面显示一个小勾。
 SWT.PUSH：普通型菜单。
 SWT.RADIO：选中后前面显示一个圆点。
 SWT.SEPARATOR：分隔符。
 3．建立菜单的一般步骤：
 ①首先建立一个菜单栏，需要使用 SWT.BAR 属性。
 Menu mainMenu=new Menu(shell,SWT.BAR);
 ②在窗体中指定需要显示的菜单栏。
 shell.setMenuBar(mainMenu);
 ③创建顶级菜单项，需要使用 SWT.CASCADE 属性。
 MenuItem fileItem=new MenuItem(mainMenu,SWT.CASCADE);
 fileItem.setText("文件&F");
 ④创建与顶级菜单项相关的下拉式菜单。
 Menu fileMenu=new Menu(shell,SWT.DROP_DOWN);
 ⑤将顶级菜单项与下拉菜单关联。
 fileItem.setMenu(fileMenu);
 二级菜单的创建只需重复以上步骤③～⑤。注意：本例创建所有 Menu 对象的第一个参
 数都是 shell；创建 MenuItem 对象的第一个参数是该 MenuItem 所在的 Menu 对象；如果某
 Menu 是某 MenuItem 的子菜单，则还要建立关联：MenuItem.setMenu(Menu)。源代码如下：
 * @author Administrator
 *
 */

import org.eclipse.swt.widgets.*;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.events.*;
import org.eclipse.swt.*;

public class MenuSWT {
	public static void main(String[] args) {
		Display display = new Display();// 创建一个display对象。
		final Shell shell = new Shell(display);// shell是程序的主窗体
		shell.setText("菜单示例");
		Menu mainMenu = new Menu(shell, SWT.BAR);
		shell.setMenuBar(mainMenu);
		// Menu mainMenu=new Menu(shell,SWT.POP_UP); //创建弹出式菜单
		// shell.setMenu(mainMenu); //创建弹出式菜单
		{
			// "文件"项
			MenuItem fileItem = new MenuItem(mainMenu, SWT.CASCADE);
			fileItem.setText("文件&F");
			// "文件"菜单

			Menu fileMenu = new Menu(shell, SWT.DROP_DOWN);
			fileItem.setMenu(fileMenu);
			{
				// "新建"项
				MenuItem newFileItem = new MenuItem(fileMenu, SWT.CASCADE);
				newFileItem.setText("新建&N");
				// "新建"菜单
				Menu newFileMenu = new Menu(shell, SWT.DROP_DOWN);
				newFileItem.setMenu(newFileMenu);
				{
					// "新建项目"项
					MenuItem newProjectItem = new MenuItem(newFileMenu,
							SWT.PUSH);
					newProjectItem.setText("项目\tCtrl+Shift+N");
					// 设置快捷键
					newProjectItem.setAccelerator(SWT.CTRL + SWT.SHIFT + 'N');
					// 添加事件监听
					newProjectItem.addSelectionListener(new SelectionAdapter() {
						public void widgetSelected(SelectionEvent e) {
							Text text = new Text(shell, SWT.MULTI | SWT.BORDER
									| SWT.WRAP);
							text.setBounds(10, 10, 100, 30);
							text.setText("你选择了“新建项目”");
						}
					});
					new MenuItem(newFileMenu, SWT.SEPARATOR);
					new MenuItem(newFileMenu, SWT.PUSH).setText("包");
					new MenuItem(newFileMenu, SWT.PUSH).setText("类");
				}
				MenuItem openFileItem = new MenuItem(fileMenu, SWT.CASCADE);
				openFileItem.setText("打开&O");
				MenuItem exitItem = new MenuItem(fileMenu, SWT.CASCADE);
				exitItem.setText("退出&E");
			}
			MenuItem helpItem = new MenuItem(mainMenu, SWT.CASCADE);
			helpItem.setText("帮助&H");
		}
		shell.pack();
		shell.open();

		while (!shell.isDisposed()) {
			// 如果主窗体没有关闭则一直循环

			if (!display.readAndDispatch()) { // 如果display不忙

				display.sleep();
			}
		}
		display.dispose();
		// 休眠

		// 销毁display

	}
}
