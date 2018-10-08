package shradha.struts.demo.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import shradha.struts.demo.form.HelloUserForm;

public class HelloUserAction extends Action{

	@Override
	public ActionForward execute (ActionMapping mapping,
			                      ActionForm form,
			                      HttpServletRequest request,
			                      HttpServletResponse response) throws Exception {
									
		HelloUserForm helloUserForm = (HelloUserForm) form;
		ActionForward fw = mapping.getInputForward();
		
		if(helloUserForm!=null && helloUserForm.getUserName().equalsIgnoreCase("Shradha")) {
			fw = mapping.findForward("success");
		}
		else {
			ActionErrors actionErrors = new ActionErrors();
			actionErrors.add("", new ActionMessage("helloUser.msg.error"));
			saveErrors(request, actionErrors);
		}
			
		return fw;
		
		
		
	}
}
