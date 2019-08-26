package wxWeb.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wxWeb.domain.Good;
import wxWeb.mapper.goodMapper;
import wxWeb.service.GoodService;

@Service("GoodService")
public class GoodServiceImpl implements GoodService {

	@Autowired
	private goodMapper GoodMapper;
	
	

	@Override
	public List<Good> selectAllServ() {
		// TODO Auto-generated method stub
		return GoodMapper.SelectAll();
	}

	@Override
	public Good selectWithIdServ(int id) {
		// TODO Auto-generated method stub
		return GoodMapper.SelectWithId(id);
	}

	@Override
	public int DeleteGoodServ(int id) {
		// TODO Auto-generated method stub
		return GoodMapper.DeleteGood(id);
	}

	@Override
	public List<Good> SelectWithKeyServ(String key) {
		// TODO Auto-generated method stub
		return GoodMapper.SelectWithKey(key);
	}

	@Override
	public int InsertGoodServ(String name, String pictrue, float price, float discount, float newPrice, String detail,
			String hot, String type, int inventory, int dailySaled, String isValue, String salePlace) {
		// TODO Auto-generated method stub
		return GoodMapper.InsertGood(name, pictrue, price, discount, newPrice, detail, hot, 
				type, inventory, dailySaled, isValue, salePlace);
	}

	@Override
	public int UpdatePriceServ(float price, float newPrice, float discount, int id) {
		// TODO Auto-generated method stub
		return GoodMapper.UpdatePrice(price, newPrice, discount, id);
	}

	@Override
	public int UpdateInventoryServ(int inventory, int id) {
		// TODO Auto-generated method stub
		return GoodMapper.UpdateInventory(inventory, id);
	}

	@Override
	public int UpdateDailySaledServ(int dailySaled, int id) {
		// TODO Auto-generated method stub
		return GoodMapper.UpdateDailySaled(dailySaled, id);
	}

	@Override
	public int UpdateTypeServ(String type, int id) {
		// TODO Auto-generated method stub
		return GoodMapper.UpdateType(type, id);
	}

	@Override
	public int UpdateNameServ(String name, int id) {
		// TODO Auto-generated method stub
		return GoodMapper.UpdateName(name, id);
	}

	@Override
	public int UpdateDetailServ(String Detail, int id) {
		// TODO Auto-generated method stub
		return GoodMapper.UpdateDetail(Detail, id);
	}

	@Override
	public int UpdateHotServ(String hot, int id) {
		// TODO Auto-generated method stub
		return GoodMapper.UpdateHot(hot, id);
	}

	@Override
	public int UpdateIsValueServ(String isValue, int id) {
		// TODO Auto-generated method stub
		return GoodMapper.UpdateIsValue(isValue, id);
	}

}
