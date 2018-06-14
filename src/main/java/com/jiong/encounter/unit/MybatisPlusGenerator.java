package com.jiong.encounter.unit;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.TemplateConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class MybatisPlusGenerator {

    public static void main(String[] args) {

        AutoGenerator mpg = new AutoGenerator().setGlobalConfig(// 全局配置
                new GlobalConfig()
                        .setOutputDir("C:\\Users\\JiongZhu\\IdeaProjects\\encounter\\src\\main\\java\\")//代码输出目录
                        .setAuthor("jiongzhu")//作者
                        .setFileOverride(true)//覆盖
                        .setActiveRecord(true)//活动记录
        ).setDataSource(// 数据源配置
                new DataSourceConfig()
                        .setDbType(DbType.MYSQL)// 数据库类型
                        .setDriverName("com.mysql.jdbc.Driver")
                        .setUsername("root")
                        .setPassword("524536@Zhxy")
                        .setUrl("jdbc:mysql://localhost:3306/encounter?useUnicode=true&characterEncoding=utf-8&useSSL=false")
        ).setStrategy(// 策略配置
                new StrategyConfig()
                        .setNaming(NamingStrategy.underline_to_camel)// 表名生成策略
                        .setInclude((new String[]{"users"})) // 需要生成的表
                        .setEntityLombokModel(true)
        ).setPackageInfo(// 包配置
                new PackageConfig()
                        .setParent("com.jiong.encounter")// 自定义包路径
                        .setEntity("entity")
                        .setMapper("mapper")
        ).setTemplate(
                new TemplateConfig().setXml(null).setService(null).setServiceImpl(null).setController(null)
        );
        // 执行生成
        mpg.execute();
    }
}

