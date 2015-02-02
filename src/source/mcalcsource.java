package source;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

public class mcalcsource {

	protected Shell shell;
	private Device display;
	public Text text;
	private StringBuilder strcalc;  

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			mcalcsource window = new mcalcsource();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell(SWT.CLOSE | SWT.TITLE | SWT.APPLICATION_MODAL);
		shell.setSize(249, 350);
		shell.setText("M'Calc!");
		strcalc = new StringBuilder();
		
		GridLayout gl = new GridLayout();
		gl.marginHeight = 0;
		gl.marginBottom = 0;
		gl.marginLeft = 0;
		gl.marginRight = 0;
		gl.marginWidth = 0;
		shell.setLayout(new FillLayout());

		Composite composite = new Composite(shell, SWT.NONE);
		composite.setLayout(gl);

		text = new Text(composite, SWT.RIGHT);
		Font initialFont = text.getFont();
		FontData[] fontData = initialFont.getFontData();
		for (int i = 0; i < fontData.length; i++) {
			fontData[i].setHeight(24);
		}
		Font newFont = new Font(display, fontData);
		text.setFont(newFont);
		GridData gd = new GridData();
		gd.heightHint = 58;
		gd.widthHint = 230;
		text.setLayoutData(gd);

		Composite composite_btn = new Composite(composite, SWT.BORDER);
		GridData gd_composite2 = new GridData(SWT.FILL, SWT.FILL, false, false,
				1, 1);
		gd_composite2.widthHint = 228;
		gd_composite2.heightHint = 254;
		composite_btn.setLayoutData(gd_composite2);
		GridLayout gl_b = new GridLayout();
		gl_b.numColumns = 5;
		composite_btn.setLayout(gl_b);

		Button btn_mc = new Button(composite_btn, SWT.NONE);
		GridData gd_btnNewButton = new GridData(SWT.CENTER, SWT.CENTER, false,
				false, 1, 1);
		gd_btnNewButton.heightHint = 33;
		gd_btnNewButton.widthHint = 43;
		btn_mc.setLayoutData(gd_btnNewButton);
		btn_mc.setText("MC");

		btn_mc.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				setTextBtn("1");
				}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Some methods
			}
		});

		Button btn_mr = new Button(composite_btn, SWT.NONE);
		btn_mr.setLayoutData(gd_btnNewButton);
		btn_mr.setText("MR");
		

		Button btn_ms = new Button(composite_btn, SWT.NONE);
		btn_ms.setLayoutData(gd_btnNewButton);
		btn_ms.setText("MS");

		Button btn_mp = new Button(composite_btn, SWT.NONE);
		btn_mp.setLayoutData(gd_btnNewButton);
		btn_mp.setText("M+");

		Button btn_mm = new Button(composite_btn, SWT.NONE);
		btn_mm.setLayoutData(gd_btnNewButton);
		btn_mm.setText("M-");

		Button button = new Button(composite_btn, SWT.NONE);
		button.setLayoutData(gd_btnNewButton);
		button.setText("MC");

		Button btnCe = new Button(composite_btn, SWT.NONE);
		btnCe.setLayoutData(gd_btnNewButton);
		btnCe.setText("CE");

		Button btnC = new Button(composite_btn, SWT.NONE);
		btnC.setLayoutData(gd_btnNewButton);
		btnC.setText("C");

		Button button_3 = new Button(composite_btn, SWT.NONE);
		button_3.setLayoutData(gd_btnNewButton);
		button_3.setText("MC");

		Button btn_sqrt = new Button(composite_btn, SWT.NONE);
		btn_sqrt.setLayoutData(gd_btnNewButton);
		btn_sqrt.setText("sqrt");

		Button btn_7 = new Button(composite_btn, SWT.NONE);
		btn_7.setImage(SWTResourceManager.getImage(this.getClass(),
				"/btn_img/7.png"));
		btn_7.setLayoutData(gd_btnNewButton);
		btn_7.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				setTextBtn("7");
				}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Some methods
			}
		});

		Button btn_8 = new Button(composite_btn, SWT.NONE);
		btn_8.setImage(SWTResourceManager.getImage(this.getClass(),
				"/btn_img/8.png"));
		btn_8.setLayoutData(gd_btnNewButton);
		btn_8.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				setTextBtn("8");
				}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Some methods
			}
		});

		Button btn_9 = new Button(composite_btn, SWT.NONE);
		btn_9.setImage(SWTResourceManager.getImage(this.getClass(),
				"/btn_img/9.png"));
		btn_9.setLayoutData(gd_btnNewButton);
		btn_9.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				setTextBtn("9");
				}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Some methods
			}
		});

		Button button_8 = new Button(composite_btn, SWT.NONE);
		button_8.setLayoutData(gd_btnNewButton);
		button_8.setText("\\");

		Button btn_Proc = new Button(composite_btn, SWT.NONE);
		btn_Proc.setLayoutData(gd_btnNewButton);
		btn_Proc.setText("proc");

		Button btn_4 = new Button(composite_btn, SWT.NONE);
		btn_4.setImage(SWTResourceManager.getImage(this.getClass(),
				"/btn_img/4.png"));
		btn_4.setLayoutData(gd_btnNewButton);

		Button btn_5 = new Button(composite_btn, SWT.NONE);
		btn_5.setImage(SWTResourceManager.getImage(this.getClass(),
				"/btn_img/5.png"));
		btn_5.setLayoutData(gd_btnNewButton);
		btn_5.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				setTextBtn("5");
				}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Some methods
			}
		});

		Button btn_6 = new Button(composite_btn, SWT.NONE);
		btn_6.setImage(SWTResourceManager.getImage(this.getClass(),
				"/btn_img/6.png"));
		btn_6.setLayoutData(gd_btnNewButton);
		btn_6.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				setTextBtn("6");
				}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Some methods
			}
		});
		Button button_13 = new Button(composite_btn, SWT.NONE);
		button_13.setLayoutData(gd_btnNewButton);
		button_13.setText("*");

		Button btnx = new Button(composite_btn, SWT.NONE);
		btnx.setLayoutData(gd_btnNewButton);
		btnx.setText("1\\x");

		Button btn_1 = new Button(composite_btn, SWT.NONE);
		btn_1.setImage(SWTResourceManager.getImage(this.getClass(),
				"/btn_img/11.png"));
		btn_1.setLayoutData(gd_btnNewButton);

		Button button_16 = new Button(composite_btn, SWT.NONE);
		button_16.setImage(SWTResourceManager.getImage(this.getClass(),
				"/btn_img/22.png"));
		button_16.setLayoutData(gd_btnNewButton);
		button_16.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				setTextBtn("2");
				}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Some methods
			}
		});

		Button button_17 = new Button(composite_btn, SWT.NONE);
		button_17.setImage(SWTResourceManager.getImage(this.getClass(),
				"/btn_img/3.png"));
		button_17.setLayoutData(gd_btnNewButton);
		button_17.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				setTextBtn("3");
				}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Some methods
			}
		});

		Button button_18 = new Button(composite_btn, SWT.NONE);
		button_18.setLayoutData(gd_btnNewButton);
		button_18.setText("-");
		button_18.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				setTextBtn("-");
				}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Some methods
			}
		});

		Button btnplus = new Button(composite_btn, SWT.NONE);
		GridData gd_button_19 = new GridData(SWT.LEFT, SWT.FILL, false, false,
				1, 2);
		gd_button_19.widthHint = 39;
		gd_button_19.heightHint = 31;
		btnplus.setLayoutData(gd_button_19);
		btnplus.setText("=");
		btnplus.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				setTextBtn("=");
				}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Some methods
			}
		});

		Button btn_zero = new Button(composite_btn, SWT.NONE);
		btn_zero.setImage(SWTResourceManager.getImage(this.getClass(),
				"/btn_img/0.png"));
		GridData gd_btn_zero = new GridData(SWT.FILL, SWT.CENTER, false,
				false, 2, 1);
		gd_btn_zero.heightHint = 34;
		gd_btn_zero.widthHint = 43;
		btn_zero.setLayoutData(gd_btn_zero);
		btn_zero.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				setTextBtn("0");
				}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Some methods
			}
		});
		

		Button button_22 = new Button(composite_btn, SWT.NONE);
		button_22.setLayoutData(gd_btnNewButton);
		button_22.setText(",");
		button_22.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				setTextBtn(",");
				}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Some methods
			}
		});

		Button button_23 = new Button(composite_btn, SWT.NONE);
		GridData gd_button_23 = new GridData(SWT.LEFT, SWT.CENTER, false,
				false, 1, 1);
		gd_button_23.heightHint = 32;
		gd_button_23.widthHint = 40;
		button_23.setLayoutData(gd_button_23);
		button_23.setText("+");
		button_23.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				setTextBtn("+");
				}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Some methods
			}
		});

		
		new Label(composite_btn, SWT.NONE);
		new Label(composite_btn, SWT.NONE);
		new Label(composite_btn, SWT.NONE);
		new Label(composite_btn, SWT.NONE);
		new Label(composite_btn, SWT.NONE);

		Menu menu = new Menu(shell, SWT.BAR);
		shell.setMenuBar(menu);

		MenuItem mntmView = new MenuItem(menu, SWT.NONE);
		mntmView.setText("View");

		MenuItem mntmEdit = new MenuItem(menu, SWT.NONE);
		mntmEdit.setText("Edit");

		MenuItem mntmHelp = new MenuItem(menu, SWT.NONE);
		mntmHelp.setText("Help");

	}
	
	public void setTextBtn(String s){
		strcalc.append(s);
		text.setText(strcalc.toString());
	}

}
