package wxWeb.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wxWeb.domain.Order;
import wxWeb.mapper.OrderMapper;
import wxWeb.service.OrderService;

@Service("OrderService")
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderMapper orderMapper;
	
	@Override
	public List<Order> SelectAllServ() {
		// TODO Auto-generated method stub
		return orderMapper.SelectAll();
	}

	@Override
	public List<Order> SelectWithBuyerIdServ(int buyerId) {
		// TODO Auto-generated method stub
		return orderMapper.SelectWithBuyerId(buyerId);
	}

	@Override
	public List<Order> SelectWithOrderSituationServ(String orderSituation) {
		// TODO Auto-generated method stub
		return orderMapper.SelectWithOrderSituation(orderSituation);
	}

	@Override
	public int InsertOrderServ(String buyerName, int buyerId, String content, float totalPrice, String orderTime,
			String orderSituation, String sendTime, String address, String pickCode) {
		// TODO Auto-generated method stub
		return orderMapper.InsertOrder(buyerName, buyerId, content, totalPrice, 
				orderTime, orderSituation, sendTime, address, pickCode);
	}

	@Override
	public int UpdateOrderSituationServ(int id, String orderSituation) {
		// TODO Auto-generated method stub
		return orderMapper.UpdateOrderSituation(id, orderSituation);
	}

}
