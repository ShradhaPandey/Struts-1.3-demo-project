package shradha.struts.demo.form;

import org.apache.struts.action.ActionForm;

public class HelloUserForm extends ActionForm{
	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	

}
