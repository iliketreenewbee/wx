package wxWeb.service;

import java.util.List;

import wxWeb.domain.PickPoint;

public interface PickPService {
	
	//模糊查询有效提货点
	List<PickPoint> SelectPickPointServ(String key);
		
	//新增提货点
	int InsertPickPointServ(String name);
		
	//修改提货点
	int UpdatePickPointServ(int id,String name);
		
	//删除提货点：把isValue置为flase
	int UpdatePickPointValueServ(int id,String isValue);
		
	//永久删除提货点
	int DeletePickPointServ(int id);
}
