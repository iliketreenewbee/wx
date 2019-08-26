package wxWeb.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.sf.json.JSONArray;
import wxWeb.domain.Order;
import wxWeb.service.OrderService;

@Controller
@RequestMapping("/WXOrder")
public class WXOrderCtrl {
	@Autowired
	@Qualifier("OrderService")
	private OrderService orderService;
	
	@RequestMapping("/SelectAll")
	public void selectAllControl (HttpServletResponse response) throws IOException {
		System.out.println("开始查询");
		List<Order> order_list = orderService.SelectAllServ();
		if(order_list.isEmpty()==false) {
			System.out.println(order_list.size());
		}
		JSONArray json = JSONArray.fromObject(order_list);
		String str = json.toString(); 
		response.getWriter().write(str);
	}
	
	@RequestMapping("/SelectWithBuyerId")
	public void selectWithBuyerId(int buyerId,HttpServletResponse response) throws IOException {
		List<Order> order_list = orderService.SelectWithBuyerIdServ(buyerId);
		JSONArray json = JSONArray.fromObject(order_list);
		String str = json.toString(); 
		response.getWriter().write(str);
	}
	
	@RequestMapping("/SelectWithSituation")
	public void selectWithSituation(String orderSituation,HttpServletResponse response) throws IOException {
		List<Order> order_list = orderService.SelectWithOrderSituationServ(orderSituation);
		JSONArray json = JSONArray.fromObject(order_list);
		String str = json.toString(); 
		response.getWriter().write(str);
	}
	
	/*
	 * @RequestMapping("/InsertOrder") public void insertOrder(HttpServletRequest
	 * request) { String BuyerName = request.getParameter("BuyerName"); int BuyerId
	 * = request.getParameter("BuyerId"); int flag =
	 * orderService.InsertOrderServ(buyerName, buyerId, content, totalPrice,
	 * orderTime, orderSituation, sendTime, address, pickCode) }
	 */
	
	@RequestMapping("/UpdateSituation")
	public void updateSituation(String orderSituation,int id,HttpServletResponse response) throws IOException {
		int flag = orderService.UpdateOrderSituationServ(id, orderSituation);
		if(flag == 1) {
			response.getWriter().write("更新成功");
		}
	}
}
