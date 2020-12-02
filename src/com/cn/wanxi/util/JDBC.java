package com.cn.wanxi.util;
import java.sql.*;
/**
 * 连接数据库工具类
 */
public class JDBC {
    //    连接数据库 的时候需要有几个参数：1.连接地址，2.我们需要驱动，3.我需要用户名和密码
//    定义属性的时候，不要使用public  ，
//    如果想给其他人调用，我们直接给别人一个公有的接口，getUrl()，
//    因为这里几个参数都是固定的，而且经常用，而且不能随便new对象。所以这里我们需要常量
//    常量的定义，final最终，不变，常量标识符（命名规则）全是大写。
//    这里因为我们随时需要调用，所以这里写static。
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/jianshen?characterEncoding=utf8&useUnicode=true&useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String DRIVER ="com.mysql.cj.jdbc.Driver";//mysql驱动
    private static final String USER ="jianshen";//用户名
    private static final String PASSWORD = "sql.12345";//密码

    //    连接数据库需要的几个特殊类，
//    1.Connection 得到连接
//    2.PreparedStatement
//    3.ResultSet
    private static Connection connection = null;
    private static PreparedStatement preparedStatement = null;
    private static ResultSet resultSet;

    /**
     * 得到连接
     *
     * @return
     */
    private static Connection getConnection() {
        try {
            Class.forName(DRIVER);//反射的时候学到，加载驱动
            if (connection == null) {
                connection = DriverManager.getConnection(URL, USER, PASSWORD);//建立连接
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
//数据库操作，增删查改
//   增加删除和修改的操作都是一样，所以我们需要将这几个方法合并在一起
//    如果需要调用增加删除修改，则需要传递一条执行语句，sql语句

    /**
     * 增加删除修改
     *
     * @param sql
     * @return
     */
    public static int excuteUpdate(String sql) {
        connection = getConnection();//连接数据库操作
        int count = 0;
        try {
            preparedStatement = connection.prepareStatement(sql);//编译sql语句
            count = preparedStatement.executeUpdate();//执行sql语句
        } catch (SQLException e) {

            e.printStackTrace();
        } finally {
            close();
        }
        return count;
    }

    /**
     * 得到查询后的结果集
     *
     * @param sql
     * @return
     */
    public static ResultSet getResultSet(String sql) {
        getConnection();//连接数据库操作
        try {
            preparedStatement = connection.prepareStatement(sql);//编译sql语句
            resultSet = preparedStatement.executeQuery();//执行查询语句

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    public static void close() {
        if (connection != null) {
            try {
                connection.close();
                connection = null;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (preparedStatement != null) {
            try {
                preparedStatement.close();
                preparedStatement = null;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (resultSet != null) {
            try {
                resultSet.close();
                resultSet = null;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static ResultSet find(String sql) {
        return resultSet;
    }
}
