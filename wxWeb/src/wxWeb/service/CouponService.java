package wxWeb.service;

import java.util.List;

import wxWeb.domain.Coupon;

public interface CouponService {
	
	
	//根据用户查询优惠券
	List<Coupon> SelectCouponWithBuyerServ(int buyerId);
		
	//新增优惠券
	int InsertCouponServ(float discountMoney,String discountType,String condition,
			String situation,String type,float fullMoney);
		
	//修改优惠券使用情况
	int UpdateSituationServ(int id,String situation);
		
	//根据类别查询优惠券
	List<Coupon> SelectWitnTypeServ(String type);
		
	//根据优惠类别查询优惠券
	List<Coupon> SelectWitnDiscountTypeServ(String discountType);
}
