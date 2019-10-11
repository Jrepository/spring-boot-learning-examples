package indi.com.mapper;

import indi.com.entity.Emp;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jobob
 * @since 2019-09-19
 */
public interface EmpMapper {

    public Emp getEmpById(String id);

    public void deleteById(String id);

    public List<Emp> getEmps();

}
