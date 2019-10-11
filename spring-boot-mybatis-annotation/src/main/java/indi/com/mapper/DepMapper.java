package indi.com.mapper;

import indi.com.entity.Dep;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 使用注解的方式
 */
@Mapper
public interface DepMapper {

    @Select("select * from dep where id=#{id}")
    public Dep getDepById(String id);

    @Select("select * from dep")
    public List<Dep> getDeps();


    @Select("insert into dep(id,dep_name)values(#{id},#{depName})")
    public List<Dep> insertDep(Dep dep);
}
