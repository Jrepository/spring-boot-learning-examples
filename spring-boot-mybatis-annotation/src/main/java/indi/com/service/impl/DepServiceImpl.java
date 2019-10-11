package indi.com.service.impl;

import indi.com.entity.Dep;
import indi.com.mapper.DepMapper;
import indi.com.service.IDepService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-09-19
 */
@Service
public class DepServiceImpl implements IDepService {

    @Resource
    private DepMapper mapper;

    @Override
    public Dep getDepById(String id) {
        return mapper.getDepById(id);
    }

    @Override
    public List<Dep> getDeps() {
        return mapper.getDeps();
    }

    @Override
    public List<Dep> insertDep(Dep dep) {
        String id = UUID.randomUUID().toString();
        dep.setId(id);
        return mapper.insertDep(dep);
    }
}
