/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package abic.tas.assetTicket.struts.action;

import abic.tas.assetTicket.hibernate.LoginDAO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import abic.tas.assetTicket.struts.form.LoginForm;

/** 
 * MyEclipse Struts
 * Creation date: 01-07-2014
 * 
 * XDoclet definition:
 * @struts.action path="/login" name="loginForm" input="login.jsp" scope="request" validate="true"
 */
public class LoginAction extends Action {
	/*
	 * Generated Methods
	 */

	/** 
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		LoginForm loginForm = (LoginForm) form;// TODO Auto-generated method stub
		LoginDAO user = new LoginDAO();
		 	
		if (user.verifica_utente(loginForm.getUserName(), loginForm.getPassword())){
			
			if(loginForm.getUserName().equals("admin")){ 
				return mapping.findForward("successAdmin");
			}else if(loginForm.getUserName().equals("manager")){
				return mapping.findForward("successManager");
			}else if(loginForm.getUserName().equals("user")){
				return mapping.findForward("successUser");
			}
		}else{
			return mapping.findForward("failure");
		}
		return mapping.findForward("failure");
		
	}
}