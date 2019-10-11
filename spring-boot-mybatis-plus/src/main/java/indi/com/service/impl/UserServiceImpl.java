package indi.com.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import indi.com.entity.User;
import indi.com.mapper.UserMapper;
import indi.com.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-09-19
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
