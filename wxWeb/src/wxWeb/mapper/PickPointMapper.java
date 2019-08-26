package wxWeb.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import wxWeb.domain.PickPoint;

public interface PickPointMapper {
	
	//模糊查询有效提货点
	@Select("select * from pickpoint where isValue = 'true' and name like concat('%',#{key},'%')")
	List<PickPoint> SelectPickPoint(@Param("key")String key);
	
	//新增提货点
	@Insert("insert into pickpoint (name) values (#{name})")
	int InsertPickPoint(@Param("name")String name);
	
	//修改提货点
	@Update("update pickpoint set name = #{name} where id = @{id}")
	int UpdatePickPoint(@Param("id")int id,@Param("name")String name);
	
	//删除提货点：把isValue置为flase
	@Update("update pickpoint set isValue = #{isValue} where id = @{id}")
	int UpdatePickPointValue(@Param("id")int id,@Param("isValue")String isValue);
	
	//永久删除提货点
	@Delete("delete from pickpoint where id = #{id}")
	int DeletePickPoint(@Param("in")int id);
}
