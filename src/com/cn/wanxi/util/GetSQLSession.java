package com.cn.wanxi.util;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.io.InputStream;

/**
 * Administrator
 * 连接数据库
 * 1.需要数据库的配置
 */
public class GetSQLSession {
/**
 * 线程存储类ThreadLocal，存储线程的，每一个线程都是相互独立的
 * mybatis默认开启sqlsession缓存。
 * 每一个用户一个sqlsession，即使是共有的信息也会存到自己的缓存中，
 * 其他的用户查，即使是同样的方法，同一份数据，也会重新查数据库，因为sqlsession对象不一样
 * <p>
 * 能走缓存的前提是，这些sqlsession对象都是同factory创建的
 * 不同线程，不同的sqlsession，并且每个线程只能有一个sqlsession
 * threadLocal 封装sqlsession对象
 * threadLocal存储的数据，只能是线程内有效
 */

    /**
     * 开启缓存
     *
     * @return
     */
    public static SqlSession getSqlSession() {
        String resource = "druid.xml";
        SqlSession sqlSession = null;
        SqlSessionFactory sqlSessionFactory = null;//开启工厂，一个工厂可以放多个SqlSession
        try {
// 打开资源文件
            InputStream inputStream = Resources.getResourceAsStream(resource);
// 开启sqlsession
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            if (sqlSession == null) {
                sqlSession = sqlSessionFactory.openSession(true);//所有的的sqlsession对象都是factory.openSession（）得到的

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sqlSession;
    }

}
