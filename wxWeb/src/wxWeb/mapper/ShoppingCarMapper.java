package wxWeb.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import wxWeb.domain.ShoppingCar;

public interface ShoppingCarMapper {
	
	//创建购物车，每个用户一个购物车
	@Insert("insert into shoppingcar (buyerId) values (#{buyerId})")
	int InsertShopC(@Param("buyerId")int buyerId);
	
	//更新购物车里面的商品
	@Update("update shoppingcar set content = #{content} where buyerId = #{buyerId}")
	int UpdateShopC(@Param("buyerId")int buyerId,@Param("content")String content);
	
	//查找购物车
	@Select("select * from shoppingcar where buyerId = #{buyerId}")
	ShoppingCar SelectShopC(@Param("buyerId")int buyerId);
}
