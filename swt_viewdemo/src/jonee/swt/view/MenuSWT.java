package jonee.swt.view;

/**
 * SWT.BAR���˵������������˵���
 SWT.DROP_DOWN�������˵��������Ӳ˵���
 SWT.POP_UP������Ҽ�����ʽ�˵���
 2��MenuItem ��ʽ��
 SWT.CASCADE�����Ӳ˵��Ĳ˵��
 SWT.CHECK��ѡ�к�ǰ����ʾһ��С����
 SWT.PUSH����ͨ�Ͳ˵���
 SWT.RADIO��ѡ�к�ǰ����ʾһ��Բ�㡣
 SWT.SEPARATOR���ָ�����
 3�������˵���һ�㲽�裺
 �����Ƚ���һ���˵�������Ҫʹ�� SWT.BAR ���ԡ�
 Menu mainMenu=new Menu(shell,SWT.BAR);
 ���ڴ�����ָ����Ҫ��ʾ�Ĳ˵�����
 shell.setMenuBar(mainMenu);
 �۴��������˵����Ҫʹ�� SWT.CASCADE ���ԡ�
 MenuItem fileItem=new MenuItem(mainMenu,SWT.CASCADE);
 fileItem.setText("�ļ�&F");
 �ܴ����붥���˵�����ص�����ʽ�˵���
 Menu fileMenu=new Menu(shell,SWT.DROP_DOWN);
 �ݽ������˵����������˵�������
 fileItem.setMenu(fileMenu);
 �����˵��Ĵ���ֻ���ظ����ϲ���ۡ��ݡ�ע�⣺������������ Menu ����ĵ�һ����
 ������ shell������ MenuItem ����ĵ�һ�������Ǹ� MenuItem ���ڵ� Menu �������ĳ
 Menu ��ĳ MenuItem ���Ӳ˵�����Ҫ����������MenuItem.setMenu(Menu)��Դ�������£�
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
		Display display = new Display();// ����һ��display����
		final Shell shell = new Shell(display);// shell�ǳ����������
		shell.setText("�˵�ʾ��");
		Menu mainMenu = new Menu(shell, SWT.BAR);
		shell.setMenuBar(mainMenu);
		// Menu mainMenu=new Menu(shell,SWT.POP_UP); //��������ʽ�˵�
		// shell.setMenu(mainMenu); //��������ʽ�˵�
		{
			// "�ļ�"��
			MenuItem fileItem = new MenuItem(mainMenu, SWT.CASCADE);
			fileItem.setText("�ļ�&F");
			// "�ļ�"�˵�

			Menu fileMenu = new Menu(shell, SWT.DROP_DOWN);
			fileItem.setMenu(fileMenu);
			{
				// "�½�"��
				MenuItem newFileItem = new MenuItem(fileMenu, SWT.CASCADE);
				newFileItem.setText("�½�&N");
				// "�½�"�˵�
				Menu newFileMenu = new Menu(shell, SWT.DROP_DOWN);
				newFileItem.setMenu(newFileMenu);
				{
					// "�½���Ŀ"��
					MenuItem newProjectItem = new MenuItem(newFileMenu,
							SWT.PUSH);
					newProjectItem.setText("��Ŀ\tCtrl+Shift+N");
					// ���ÿ�ݼ�
					newProjectItem.setAccelerator(SWT.CTRL + SWT.SHIFT + 'N');
					// ����¼�����
					newProjectItem.addSelectionListener(new SelectionAdapter() {
						public void widgetSelected(SelectionEvent e) {
							Text text = new Text(shell, SWT.MULTI | SWT.BORDER
									| SWT.WRAP);
							text.setBounds(10, 10, 100, 30);
							text.setText("��ѡ���ˡ��½���Ŀ��");
						}
					});
					new MenuItem(newFileMenu, SWT.SEPARATOR);
					new MenuItem(newFileMenu, SWT.PUSH).setText("��");
					new MenuItem(newFileMenu, SWT.PUSH).setText("��");
				}
				MenuItem openFileItem = new MenuItem(fileMenu, SWT.CASCADE);
				openFileItem.setText("��&O");
				MenuItem exitItem = new MenuItem(fileMenu, SWT.CASCADE);
				exitItem.setText("�˳�&E");
			}
			MenuItem helpItem = new MenuItem(mainMenu, SWT.CASCADE);
			helpItem.setText("����&H");
		}
		shell.pack();
		shell.open();

		while (!shell.isDisposed()) {
			// ���������û�йر���һֱѭ��

			if (!display.readAndDispatch()) { // ���display��æ

				display.sleep();
			}
		}
		display.dispose();
		// ����

		// ����display

	}
}
