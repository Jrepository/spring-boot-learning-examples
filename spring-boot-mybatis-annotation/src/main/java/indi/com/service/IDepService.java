package indi.com.service;

import indi.com.entity.Dep;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jobob
 * @since 2019-09-19
 */
public interface IDepService {

    public Dep getDepById(String id);

    public List<Dep> getDeps();

    public List<Dep> insertDep(Dep dep);

}
