package indi.com;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootJdbcApplicationTests {

    @Resource
    DataSource dataSource;

    @Resource
    JdbcTemplate jdbcTemplate;

    /**
     * 测试数据源
     * @throws SQLException
     */
    @Test
    public void contextLoads () throws SQLException {
        System.out.println("======="+dataSource.getClass());
        Connection connection = dataSource.getConnection();
        System.out.println("======="+connection);
        connection.close();
    }

    /**
     * 测试JdbcTemplate模板
     * @throws SQLException
     */
    @Test
    public void jdbcTemplateTest () throws SQLException {
        Integer count = jdbcTemplate.queryForObject("select count(*) from portal_um_user", Integer.class);
        System.out.println("数据个数："+count);

    }

}
