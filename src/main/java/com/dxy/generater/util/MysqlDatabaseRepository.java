package com.dxy.generater.util;

import com.alibaba.druid.pool.DruidAbstractDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.dxy.generater.entity.DatabaseInfo;
import org.apache.commons.lang3.StringUtils;

import javax.sql.DataSource;
import java.util.HashMap;

public class MysqlDatabaseRepository implements DatabaseRepository{

    private DataSource dataSource;

    public MysqlDatabaseRepository(DatabaseInfo databaseInfo) {
        try {
            HashMap<String, String> map = new HashMap<>();
            map.put("url",databaseInfo.getUrl());
            map.put("username",databaseInfo.getUserName());
            map.put("password",databaseInfo.getPassword());
            map.put("type","com.zaxxer.hikari.HikariDataSource");
            map.put("driver-class-name","com.mysql.cj.jdbc.Driver");
            this.dataSource = DruidDataSourceFactory.createDataSource(map);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public <T> void execute(String sql) {
        if(StringUtils.isBlank(sql)){

        };
    }
}
