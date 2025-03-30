package com.graduationdesign.workstudy.utils;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.sql.Types;
import java.util.Collections;

public class MybatisPlusGenerator {
    static final String url = "jdbc:mysql://localhost:3306/work_study?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=UTC";    // 数据库地址
    static final String username = "root";  // 数据库用户名
    static final String password = "123456";  // 数据库密码
    static final String authorName = "lmt"; // 作者名
    static final String parentPackageNameResource = "com/graduationdesign/workstudy";  // mapper.xml路径
    static final String parentPackageNameJava = "com.graduationdesign.workstudy";  // java 文件父包名
    // 要生成代码对应的数据表名
    static final String tableNames = "users,student_info,department,position,application,attendance,salary,notice,slides,student,health_info,family_member,student_record";


    /**
     * 程序的入口点，用于配置和执行代码生成器
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        // 创建代码生成器实例并配置相关参数
        FastAutoGenerator.create(url, username, password)
                // 1.全局配置
                .globalConfig(builder -> {
                    builder.author(authorName)                // 设置作者
                            .enableSpringdoc()               // 开启 swagger 模式
                            // 获取当前工程路径并定位到项目java目录下
                            .outputDir(System.getProperty("user.dir") + "/src/main/java");            // 指定输出目录
                })

                // 2.数据源配置
                .dataSourceConfig(builder -> builder.typeConvertHandler((globalConfig, typeRegistry, metaInfo) -> {
                    int typeCode = metaInfo.getJdbcType().TYPE_CODE;
                    if (typeCode == Types.SMALLINT) {
                        // 自定义类型转换
                        return DbColumnType.INTEGER;
                    }
                    return typeRegistry.getColumnType(metaInfo);

                }))

                // 3.包名策略配置
                .packageConfig(builder -> {
                    builder.parent(parentPackageNameJava) // 设置父包名
                            .entity("entity")
                            .mapper("mapper")
                            .service("service")
                            .serviceImpl("service.impl")
                            .controller("controller")
                            //.moduleName("system") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, System.getProperty("user.dir") + "/src/main/resources/" + parentPackageNameResource + "/mapper")); // 设置mapperXml生成路径
                })
                // 策略配置
                .strategyConfig(builder -> {
                    builder.addInclude(tableNames.split(",")) // 设置需要生成的表名
                            // 覆盖已生成文件
                            .entityBuilder()
                            .enableLombok() // 开启Lombok
                            .enableTableFieldAnnotation() // 启用字段注解
                            .naming(NamingStrategy.underline_to_camel) // 表名转实体命名策略
                            .columnNaming(NamingStrategy.underline_to_camel) // 列名转属性命名策略
                            .enableFileOverride()
                            // 关键配置：启用枚举字段映射
                            .mapperBuilder().enableFileOverride()
                            .serviceBuilder().enableFileOverride().formatServiceFileName("%sService");
                    //.addTablePrefix("t_", "c_"); // 设置过滤表前缀

                })

                // 配置模板
                .templateConfig(builder -> {
                    //builder.controller("");         // 不生成controller
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
