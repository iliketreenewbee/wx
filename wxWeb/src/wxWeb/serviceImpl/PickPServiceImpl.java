package wxWeb.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wxWeb.domain.PickPoint;
import wxWeb.mapper.PickPointMapper;
import wxWeb.service.PickPService;

@Service("PickPService")
public class PickPServiceImpl implements PickPService {

	@Autowired
	private PickPointMapper pickPMapper;
	
	@Override
	public List<PickPoint> SelectPickPointServ(String key) {
		// TODO Auto-generated method stub
		return pickPMapper.SelectPickPoint(key);
	}

	@Override
	public int InsertPickPointServ(String name) {
		// TODO Auto-generated method stub
		return pickPMapper.InsertPickPoint(name);
	}

	@Override
	public int UpdatePickPointServ(int id, String name) {
		// TODO Auto-generated method stub
		return pickPMapper.UpdatePickPoint(id, name);
	}

	@Override
	public int UpdatePickPointValueServ(int id, String isValue) {
		// TODO Auto-generated method stub
		return pickPMapper.UpdatePickPointValue(id, isValue);
	}

	@Override
	public int DeletePickPointServ(int id) {
		// TODO Auto-generated method stub
		return pickPMapper.DeletePickPoint(id);
	}

}
