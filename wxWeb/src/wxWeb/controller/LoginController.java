package wxWeb.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import wxWeb.domain.Buyer;
import wxWeb.service.BuyerService;

public class LoginController {
	
	//自动注入BuyerService
	@Autowired
	private BuyerService buyerService;
	
	//管理员登录
	@RequestMapping
	public String UserLogin(String name,String password,HttpServletRequest request) {
		Buyer User = buyerService.SelectLoginServ(name, password);
		if(User != null) {
			if(User.getLevel().equals("管理员") ) {
				request.setAttribute("massage", "此账号不是管理员，请重新输入！");
				return "success";
			}else {
				request.setAttribute("massage", "此账号不是管理员，请重新输入！");
				return "fail";
			}
		}else {
			request.setAttribute("massage", "账号与密码不匹配，请重新输入！");
			return "fail";
		}
	}
}
