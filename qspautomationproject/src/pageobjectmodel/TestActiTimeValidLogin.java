package pageobjectmodel;

import java.io.IOException;

public class TestActiTimeValidLogin extends BaseTest{
	
	public static void main(String[] args) throws IOException {
		//1
		BaseTest bt =new BaseTest();
		bt.setUp();
		Flib flib = new Flib();
		String validUsername = flib.readPropertyFile("./data/config.properties", "username");
		String validPassword = flib.readPropertyFile("./data/config.properties", "password");
		
		LoginPage lp = new LoginPage(driver);
		lp.actiTimevalidLogin(validUsername, validPassword);
	}

}
