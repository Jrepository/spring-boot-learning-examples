package indi.com.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.math.BigDecimal;

/**
*
*   此处使用的ORACLE数据库，USER表需要加上双引号
*
* @author jiangPengFei
* @since 2019-09-19
*/
@TableName("\"USER\"")
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    @TableField("ID")
    private String id;

    @TableField("NAME")
    private String name;

    @TableField("AGE")
    private BigDecimal age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getAge() {
        return age;
    }

    public void setAge(BigDecimal age) {
        this.age = age;
    }
}
