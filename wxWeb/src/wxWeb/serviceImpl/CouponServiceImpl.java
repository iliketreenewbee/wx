package wxWeb.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wxWeb.domain.Coupon;
import wxWeb.mapper.CouponMapper;
import wxWeb.service.CouponService;

@Service("CouponService")
public class CouponServiceImpl implements CouponService {

	@Autowired
	private CouponMapper couponMapper;
	
	@Override
	public List<Coupon> SelectCouponWithBuyerServ(int buyerId) {
		// TODO Auto-generated method stub
		return couponMapper.SelectCouponWithBuyer(buyerId);
	}

	@Override
	public int InsertCouponServ(float discountMoney, String discountType, String condition, String situation,
			String type, float fullMoney) {
		// TODO Auto-generated method stub
		return couponMapper.InsertCoupon(discountMoney, discountType, condition, situation, type, fullMoney);
	}

	@Override
	public int UpdateSituationServ(int id, String situation) {
		// TODO Auto-generated method stub
		return couponMapper.UpdateSituation(id, situation);
	}

	@Override
	public List<Coupon> SelectWitnTypeServ(String type) {
		// TODO Auto-generated method stub
		return couponMapper.SelectWitnType(type);
	}

	@Override
	public List<Coupon> SelectWitnDiscountTypeServ(String discountType) {
		// TODO Auto-generated method stub
		return couponMapper.SelectWitnDiscountType(discountType);
	}

}
