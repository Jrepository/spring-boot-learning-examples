package indi.com.config;
/*****************************************
 * Copyright (c) 2017, 测试
 * All rights reserved
 * 文 件 名 : MybatisPlusGenerator.java
 * 摘   要 :
 * 版   本 : 1.0
 * 作   者 : zhong
 * 创建日期 : 2019/1/11  9:12
 *****************************************/

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.converts.SqlServerTypeConvert;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.config.rules.IColumnType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhong
 * @version 1.0
 */
public class MybatisPlusGenerator {
    static String baseSrc = "E:\\demo";
    public static void main(String[] args) {
        AutoGenerator generator = new AutoGenerator();
        generator.setTemplateEngine(new FreemarkerTemplateEngine());

        GlobalConfig gc = new GlobalConfig();
        gc.setAuthor("author");
        gc.setOutputDir(baseSrc);
        gc.setFileOverride(true);
        gc.setActiveRecord(true);
        // XML 二级缓存
        gc.setEnableCache(false);
        gc.setBaseColumnList(false);
        gc.setBaseResultMap(false);
        //生成成功是否打开文件夹
        gc.setOpen(false);

        // 自定义文件命名，注意 %s 会自动填充表实体属性！
        gc.setMapperName("%sMapper");
        gc.setXmlName("%sMapper");
        gc.setServiceName("%sService");
        gc.setServiceImplName("%sServiceImpl");
        gc.setControllerName("%sController");
        generator.setGlobalConfig(gc);


        //替换原来的模板
        TemplateConfig templateConfig = new TemplateConfig();
        //自定义模板
       // templateConfig.setMapper("xxx-mapper.java");
        generator.setTemplate(templateConfig);

        DataSourceConfig dsc = new DataSourceConfig();
//        dsc.setDbType(DbType.SQL_SERVER);
        dsc.setDbType(DbType.ORACLE);
        dsc.setTypeConvert(new SqlServerTypeConvert() {
            @Override
            public IColumnType processTypeConvert(GlobalConfig globalConfig, String fieldType) {
                System.out.println("转换类型：" + fieldType);
                if (fieldType.startsWith("NUMBER")) {
                    return DbColumnType.BIG_DECIMAL;
                }
                if ("INTEGER".equals(fieldType)) {
                    return DbColumnType.INTEGER;
                }
//                if (fieldType.toLowerCase().startsWith("datetime")) {
//                    return DbColumnType.LOCAL_DATE_TIME;
//                }
                return super.processTypeConvert(globalConfig, fieldType);
            }
        });
        dsc.setDriverName("oracle.jdbc.driver.OracleDriver")
                .setUsername("username")
                .setPassword("password")
                .setUrl("jdbc:oracle:thin:@127.0.0.1:1521:orcl");

//        dsc.setDriverName("com.mysql.jdbc.Driver")
//                .setUsername("root")
//                .setPassword("admin")
//                .setUrl("jdbc:mysql://localhost:3306/heps");
//        dsc.setDriverName("net.sf.log4jdbc.sql.jdbcapi.DriverSpy")
//                .setUsername("xxx")
//                .setPassword("xxx")
//                .setUrl("jdbc:log4jdbc:sqlserver://127.0.0.1;database=Z_HEPS");
        generator.setDataSource(dsc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        // 全局大写命名 ORACLE 注意
        // strategy.setCapitalMode(true);
        // 此处可以修改为您的表前缀
//        strategy.setTablePrefix(new String[] { "JC_" });
        // 表名生成策略
        strategy.setNaming(NamingStrategy.underline_to_camel);
        // 需要生成的表名称，多个用英文逗号分隔
        String [] strings =  new String[]{"PORTAL_UM_DEPT"};

//        String [] strings =  new String[]{"HEPS_SEND_MQ_LOG"};
//        for(int i=0;i<strings.length;i++){
//            strings[i] = strings[i].toLowerCase();
//        }

        strategy.setInclude(strings);
//        strategy.setEntityLombokModel(true);
        generator.setStrategy(strategy);

        // 包配置
        PackageConfig pc = new PackageConfig();
        //设置生成代码输出路径
        Map<String, String> pathInfo = new HashMap<>();
        pathInfo.put("entity_path", "E:\\demo\\src\\main\\java\\indi\\com\\entity");
        pathInfo.put("mapper_path", "E:\\demo\\src\\main\\java\\indi\\com\\dao");
        pathInfo.put("xml_path", "E:\\demo\\src\\main\\resources\\mapper");
        pathInfo.put("service_path", "E:\\demo\\src\\main\\java\\indi\\com\\service");
        pathInfo.put("service_impl_path", "E:\\demo\\src\\main\\java\\indi\\com\\service\\impl");
        pathInfo.put("controller_path", "E:\\demo\\src\\main\\java\\indi\\com\\controller");
        pc.setPathInfo(pathInfo);

        //设置生成代码的包名称
        pc.setParent("indi.com");
        pc.setEntity("entity");
        pc.setMapper("mapper");
        pc.setService("service");
        pc.setServiceImpl("service.impl");
        pc.setController("controller");

        // pc.setModuleName("test");
        generator.setPackageInfo(pc);
        generator.execute();
    }

}
