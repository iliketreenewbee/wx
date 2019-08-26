package wxWeb.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wxWeb.domain.ShoppingCar;
import wxWeb.mapper.ShoppingCarMapper;
import wxWeb.service.ShopCService;

@Service("ShopCService")
public class ShopCServiceImpl implements ShopCService {

	@Autowired
	private ShoppingCarMapper shopCMapper;
	
	@Override
	public int InsertShopCServ(int buyerId) {
		// TODO Auto-generated method stub
		return shopCMapper.InsertShopC(buyerId);
	}

	@Override
	public int UpdateShopCServ(int buyerId, String content) {
		// TODO Auto-generated method stub
		return shopCMapper.UpdateShopC(buyerId, content);
	}

	@Override
	public ShoppingCar SelectShopCServ(int buyerId) {
		// TODO Auto-generated method stub
		return shopCMapper.SelectShopC(buyerId);
	}

}
