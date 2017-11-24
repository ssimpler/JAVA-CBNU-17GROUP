package login;

import javax.swing.JFrame;

public class MainProcess
{
	LoginView loginView;
	TestFrm testFrm;
	
	public static void main(String[] args)
	{
		MainProcess main = new MainProcess();
		main.loginView = new LoginView();
		main.loginView.setMain(main);
	}

	public void showFrameTest()
	{
		loginView.dispose();
		this.testFrm = new TestFrm();
	}
}
