package wxWeb.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import wxWeb.domain.Buyer;

public interface BuyerMapper {
	
	//登录验证
	@Select("select * from buyer where name = #{name} and password = #{password}")
	Buyer SelectLogin(@Param("name")String name,@Param("passwoed")String password);
	
	//登录验证方式2
	@Select("select * from buyer where name = #{name}")
	List<Buyer> SelectLoginWithName(@Param("name")String name);
	
	//新增买家
	@Insert("insert into buyer (name,password,phone,address,level) "
			+ "values (#{name},#{password},#{phone},#{address},#{level})")
	int InsertBuyer(@Param("name")String name,@Param("password")String password,
			@Param("phone")String phone,@Param("address")String address,@Param("level")String level);
	
	//修改密码
	@Update("update buyer set password = #{password} where id = #{id}")
	int UpdatePassword(@Param("id")int id,@Param("password")String password);
	
	//修改名称
	@Update("update buyer set name = #{name} where id = #{id}")
	int UpdateName(@Param("id")int id,@Param("name")String name);
	
	//修改地址
	@Update("update buyer set address = #{address} where id = #{id}")
	int UpdateAddress(@Param("id")int id,@Param("address")String address);
		
	//修改联系电话
	@Update("update buyer set phone = #{phone} where id = #{id}")
	int UpdatePhone(@Param("id")int id,@Param("phone")String phone);
}
