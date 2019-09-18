package indi.com.mapper;

import indi.com.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 注意：要确保写的sql能在数据库连接工具中正确执行
 */
@Mapper
public interface UserMapper {
    @Select("select * from \"USER\" u where u.id = '${value}'")
    User getUserById(String id);

    @Select("select * from \"USER\" where \"name\" like '%${value}%'")
    List<User> getUserByName(String name);

    @Select("select * from \"USER\"")
    List<User> getUsers();
}