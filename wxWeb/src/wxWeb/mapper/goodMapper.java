package wxWeb.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Delete;

import wxWeb.domain.Good;

/*
 * goodMapper接口
 * */
public interface goodMapper {
	/*
	 * 查询所有商品
	 * */
	@Select("select * from good where isValue = 'true' ")
	List<Good> SelectAll();
	
	//根据id查询商品
	@Select("select * from good where id = #{id}")
	Good SelectWithId(@Param("id")int id);
	
	//永久删除商品
	@Delete("delete from good where id = #{id}")
	int DeleteGood(@Param("id")int id);
	
	//模糊查询，可查询商品名，类别，详情里面的别名
	@Select("select * from good where name like concat('%',#{key},'%') "
			+ "or type like concat('%',#{key},'%') "
			+ "or detail like concat('%',#{key},'%')")
	List<Good> SelectWithKey(@Param("key")String key);
	
	//增加商品
	@Insert("insert into good (name,pictrue,price,discount,newPrice,detail,hot,type,inventory,dailySaled,isValue,salePlace) "
			+ "values(#{name},#{pictrue},#{price},#{discount},#{newPrice},"
			+ "#{detail},#{hot},#{type},#{inventory},#{dailySaled},#{isValue},#{salePlcae)")
	int InsertGood(@Param("name")String name,@Param("pictrue")String pictrue,@Param("price")float price,
			@Param("discount")float discount,@Param("newPrice")float newPrice,@Param("detail")String detail,
			@Param("hot")String hot,@Param("type")String type,@Param("inventory")int inventory,
			@Param("dailySaled")int dailySaled,@Param("isValue")String isValue,@Param("salePlace")String salePlace);
	
	//更新商品价格
	@Update("update good set price = #{price},newPrice = #{newPrice}, discount = #{discount} where id = #{id}")
	int UpdatePrice(@Param("price")float price,@Param("newPrice")float newPrice,@Param("discount")float discount,@Param("id")int id);
	
	//更新商品库存
	@Update("update good set inventory = #{inventory} where id = #{id}")
	int UpdateInventory(@Param("inventory")int inventory,@Param("id")int id);
	
	//更新商品日销量
	@Update("update good set dailySaled = #{dailySaled} where id = #{id}")
	int UpdateDailySaled(@Param("dailySaled")int dailySaled,@Param("id")int id);
	
	//修改商品种类
	@Update("update good set type = #{type} where id = #{id}")
	int UpdateType(@Param("type")String type,@Param("id")int id);
	
	//修改商品名称
	@Update("update good set name = #{name} where id = #{id}")
	int UpdateName(@Param("name")String name,@Param("id")int id);
	
	//修改商品详情
	@Update("update good set Detail = #{Detail} where id = #{id}")
	int UpdateDetail(@Param("Detail")String Detail,@Param("id")int id);
	
	//设置商品热度
	@Update("update good set hot = #{hot} where id = #{id}")
	int UpdateHot(@Param("hot")String hot,@Param("id")int id);
	
	//设置商品上下架
	@Update("update good set isValue = #{isValue} where id = #{id}")
	int UpdateIsValue(@Param("isValue")String isValue,@Param("id")int id);
}
