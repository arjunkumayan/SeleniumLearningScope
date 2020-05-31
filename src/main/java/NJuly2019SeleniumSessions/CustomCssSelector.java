package NJuly2019SeleniumSessions;

public class CustomCssSelector {

	public static void main(String[] args) {

		
		//xpath: //input[@id='username']
		//xpath : //input[@id='username' and @type='email']

		//css: #username
		//input#username
		//css:  input[id='username']
		//css: input[id='username'][type='email']
		
		// .form-control
		// input.form-control
		// input.form-control.private-form__control.login-email
		// input.form-control.private-form__control.login-password.m-bottom-3
		// input.m-bottom-3
		// button.login-submit
		
		// input[id*='username'] -- contains text
		// input[id^='username'] -- starting text
		// input[id$='username'] -- ending text
		
		// div>input[id='username']
		
	}

}
