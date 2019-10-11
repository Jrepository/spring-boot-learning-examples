package indi.com.service.impl;

import indi.com.entity.Emp;
import indi.com.mapper.EmpMapper;
import indi.com.service.IEmpService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-09-19
 */
@Service
public class EmpServiceImpl implements IEmpService {
    @Resource
    private EmpMapper empMapper;

    @Override
    public Emp getEmpById(String id) {
        return empMapper.getEmpById(id);
    }
}
