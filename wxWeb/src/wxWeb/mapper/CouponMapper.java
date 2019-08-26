package wxWeb.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import wxWeb.domain.Coupon;

public interface CouponMapper {
	
	//根据用户查询优惠券
	@Select("select * from coupon where buyerId = #{buyerId}")
	List<Coupon> SelectCouponWithBuyer(@Param("buyerId")int buyerId);
	
	//新增优惠券
	@Insert("insert into coupon (discountMoney,discountType,condition,situation,type,fullMoney) values "
			+ "(#{discountMoney},#{discountType},#{condition},#{situation},#{type},#{fullMoney})")
	int InsertCoupon(@Param("discountMoney")float discountMoney,@Param("discountType")String discountType,
			@Param("condition")String condition,@Param("situation")String situation,
			@Param("type")String type,@Param("fullMoney")float fullMoney);
	
	//修改优惠券使用情况
	@Update("update coupon set situation = #{situation} where id = #{id}")
	int UpdateSituation(@Param("id")int id,@Param("situation")String situation);
	
	//根据类别查询优惠券
	@Select("select * from coupon where type = #{type}")
	List<Coupon> SelectWitnType(@Param("type")String type);
	
	//根据优惠类别查询优惠券
	@Select("select * from coupon where discountType = #{discountType}")
	List<Coupon> SelectWitnDiscountType(@Param("discountType")String discountType);
}
