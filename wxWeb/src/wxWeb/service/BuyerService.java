package wxWeb.service;

import java.util.List;

import wxWeb.domain.Buyer;

public interface BuyerService {
	
	
	//登录验证
	Buyer SelectLoginServ(String name,String password);
	
	//登录验证方式2
	List<Buyer> SelectLoginWithNameServ(String name);
		
	//新增买家
	int InsertBuyerServ(String name,String password,String phone,String address,String level);
		
	//修改密码
	int UpdatePasswordServ(int id,String password);
		
	//修改名称
	int UpdateNameServ(int id,String name);
		
	//修改地址
	int UpdateAddressServ(int id,String address);
			
	//修改联系电话
	int UpdatePhoneServ(int id,String phone);
}
