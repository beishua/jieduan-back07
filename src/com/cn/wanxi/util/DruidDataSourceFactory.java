package com.cn.wanxi.util;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.datasource.DataSourceFactory;
import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 第三方连接池druid
 * 1.为什么要用连接池？
 * 1）统一创建，统一销毁
 * 2）节约时间
 * 2.为什么要用druid？相比JDBC的优缺点？
 * 1）处理的数据量规模较大。
 * 2）可以进行数据的实时查询展示。
 * 3）它的查询模式是交互式的，这也说明其查询并发能力有限。
 * 3.怎么用？
 * 1.首先要下载druid包。因为是第三方druid-1.1.21.jar
 * 2.要重写druid的DataSource
 * 3.修改配置文件mybatis-config1.xml
 * 4.在得到SqlSession的时候要把读取的配置文件修改成我们druid的配置
 */
public class DruidDataSourceFactory implements DataSourceFactory {
    private Properties props;

    @Override
    public void setProperties(Properties properties) {
        this.props = properties;
    }

    @Override
    public DataSource getDataSource() {
        DruidDataSource dds = new DruidDataSource();
        dds.setDriverClassName(this.props.getProperty("driver"));
        dds.setUrl(this.props.getProperty("url"));
        dds.setUsername(this.props.getProperty("username"));
        dds.setPassword(this.props.getProperty("password"));
// 其他配置可以根据MyBatis主配置文件进行配置
        try {
            dds.init();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dds;
    }
}