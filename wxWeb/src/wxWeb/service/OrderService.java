package wxWeb.service;

import java.util.List;

import wxWeb.domain.Order;

public interface OrderService {
	
	
	//查询所有订单
	List<Order> SelectAllServ();
		
	//根据买家id查询订单
	List<Order> SelectWithBuyerIdServ(int buyerId);
		
	//根据订单状态查询订单
	List<Order> SelectWithOrderSituationServ(String orderSituation);
		
	//新增订单,id自增、contactPhone默认不变
	int InsertOrderServ(String buyerName,int buyerId,String content,float totalPrice,String orderTime,
			String orderSituation,String sendTime,String address,String pickCode);
		
	//更新订单状态
	int UpdateOrderSituationServ(int id,String orderSituation);
}
