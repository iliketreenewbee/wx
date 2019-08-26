package wxWeb.service;

import wxWeb.domain.ShoppingCar;

public interface ShopCService {
	
	
	//创建购物车，每个用户一个购物车
	int InsertShopCServ(int buyerId);
		
	//更新购物车里面的商品
	int UpdateShopCServ(int buyerId,String content);
		
	//查找购物车
	ShoppingCar SelectShopCServ(int buyerId);
}
