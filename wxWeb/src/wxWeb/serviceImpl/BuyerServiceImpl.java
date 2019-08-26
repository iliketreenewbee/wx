package wxWeb.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wxWeb.domain.Buyer;
import wxWeb.mapper.BuyerMapper;
import wxWeb.service.BuyerService;

@Service("BuyerService")
public class BuyerServiceImpl implements BuyerService {

	@Autowired
	private BuyerMapper buyerMapper;
	
	@Override
	public Buyer SelectLoginServ(String name, String password) {
		// TODO Auto-generated method stub
		return buyerMapper.SelectLogin(name, password);
	}

	@Override
	public List<Buyer> SelectLoginWithNameServ(String name) {
		// TODO Auto-generated method stub
		return buyerMapper.SelectLoginWithName(name);
	}

	@Override
	public int InsertBuyerServ(String name, String password, String phone, String address, String level) {
		// TODO Auto-generated method stub
		return buyerMapper.InsertBuyer(name, password, phone, address, level);
	}

	@Override
	public int UpdatePasswordServ(int id, String password) {
		// TODO Auto-generated method stub
		return buyerMapper.UpdatePassword(id, password);
	}

	@Override
	public int UpdateNameServ(int id, String name) {
		// TODO Auto-generated method stub
		return buyerMapper.UpdateName(id, name);
	}

	@Override
	public int UpdateAddressServ(int id, String address) {
		// TODO Auto-generated method stub
		return buyerMapper.UpdateAddress(id, address);
	}

	@Override
	public int UpdatePhoneServ(int id, String phone) {
		// TODO Auto-generated method stub
		return buyerMapper.UpdatePhone(id, phone);
	}

}
