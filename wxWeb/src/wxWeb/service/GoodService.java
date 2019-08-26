package wxWeb.service;

import java.util.List;

import wxWeb.domain.Good;

public interface GoodService {
	
	//查询所有商品
	List<Good> selectAllServ ();	
	
	//根据id查询商品
	Good selectWithIdServ (int id);	
	
	//永久删除商品
	int DeleteGoodServ(int id);	
	
	//模糊查询，可查询商品名，类别，详情里面的别名
	List<Good> SelectWithKeyServ(String key);	
	
	//增加商品
	int InsertGoodServ(String name,String pictrue,float price,float discount,float newPrice,String detail,
			String hot,String type,int inventory,int dailySaled,String isValue,String salePlace);
	
	//更新商品价格
	int UpdatePriceServ(float price,float newPrice,float discount,int id);	
	
	//更新商品库存
	int UpdateInventoryServ(int inventory,int id);
	
	//更新商品日销量
	int UpdateDailySaledServ(int dailySaled,int id);
	
	//修改商品种类
	int UpdateTypeServ(String type,int id);
	
	//修改商品名称
    int UpdateNameServ(String name,int id);
    
    //修改商品详情
  	int UpdateDetailServ(String Detail,int id);
  	
    //设置商品热度
  	int UpdateHotServ(String hot,int id);
  	
    //设置商品上下架
  	int UpdateIsValueServ(String isValue,int id);
}
