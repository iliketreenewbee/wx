package wxWeb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import wxWeb.domain.Order;
import wxWeb.service.OrderService;

@Controller
@RequestMapping("/PCOrder")
public class OrderCtrl {
	@Autowired
	@Qualifier("OrderService")
	private OrderService orderService;
	
	@RequestMapping("/SelectAll")
	public String selectAllControl (Model model) {
		System.out.println("¿ªÊ¼²éÑ¯");
		List<Order> order_list = orderService.SelectAllServ();
		if(order_list.isEmpty()==false) {
			System.out.println(order_list.size());
		}
		model.addAttribute("order_list",order_list);
		return "success";
	}
	
	@RequestMapping("/SelectWithBuyerId")
	public String selectWithBuyerId(String buyerId,Model model) {
		int buyerId_int = 0;
		try {
		    buyerId_int = Integer.parseInt(buyerId);
		} catch (NumberFormatException e) {
		    e.printStackTrace();
		}
		List<Order> order_list = orderService.SelectWithBuyerIdServ(buyerId_int);
		model.addAttribute("order_list",order_list);
		return"success";
	}
	
	@RequestMapping("/SelectWithSituation")
	public String selectWithSituation(String orderSituation,Model model) {
		List<Order> order_list = orderService.SelectWithOrderSituationServ(orderSituation);
		model.addAttribute("order_list",order_list);
		return"success";
	}
}
