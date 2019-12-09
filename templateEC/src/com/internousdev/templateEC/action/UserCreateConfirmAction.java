package com.internousdev.templateEC.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class UserCreateConfirmAction extends ActionSupport implements SessionAware{
	private String loginUserId;
	private String loginPassword;
	private String userName;
	private Map<String,Object>session;
	private String errorMessage;

	public String execute(){
		String result = SUCCESS;
		if(!(loginUserId.equals(""))
				&&!(loginPassword.equals(""))
				&&!(userName.equals(""))){
			session.put("loginUserId", loginUserId);
			session.put("loginPassword", loginPassword);
			session.put("usserName", userName);
		}else{
			setErrorMessage("未入力の項目があります");
			result = ERROR;
		}
		return result;
	}
	public String getLoginUserId(){
		return loginUserId;
	}
	public void setLoginUserId(String loginUserId){
		this.loginUserId = loginUserId;
	}

}
