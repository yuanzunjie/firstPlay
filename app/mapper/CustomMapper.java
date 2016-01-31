package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import model.Custom;

public interface CustomMapper {

	@Select("select * from custom")
	List<Custom> getAll();

}
