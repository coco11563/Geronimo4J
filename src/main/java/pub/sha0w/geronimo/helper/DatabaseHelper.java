package pub.sha0w.geronimo.helper;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.log4j.Logger;
import pub.sha0w.geronimo.service.HbaseCellService;
import pub.sha0w.geronimo.util.PropsUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created by coco1 on 2017/2/13.
 */
public final class DatabaseHelper {
    private static final Logger LOGGER = Logger.getLogger(DatabaseHelper.class);

    private static final ThreadLocal<Connection> CONNECTION_HOLDER;

    private static final QueryRunner QUERY_RUNNER;

    private static final BasicDataSource DATA_SOURCE;

    static {
        CONNECTION_HOLDER = new ThreadLocal<>();

        QUERY_RUNNER = new QueryRunner();

        Properties conf = PropsUtil.loadProps("config.properties");
        String DRIVER = conf.getProperty("jdbc.driver");
        String URL = conf.getProperty("jdbc.url");
        String USERNAME = conf.getProperty("jdbc.username");
        String PASSWORD = conf.getProperty("jdbc.password");

        DATA_SOURCE = new BasicDataSource();
        DATA_SOURCE.setDriverClassName(DRIVER);
        DATA_SOURCE.setUrl(URL);
        DATA_SOURCE.setUsername(USERNAME);
        DATA_SOURCE.setPassword(PASSWORD);
        try {
            Class.forName("DRIVER");
        } catch (ClassNotFoundException e) {
            LOGGER.error("无法初始化数据库配置文件", e);
        }
    }


    public static Connection getConnection() {
        Connection conn = null;
        conn = CONNECTION_HOLDER.get();
        if (conn == null) {
            try {
                conn = DATA_SOURCE.getConnection();

            } catch (SQLException e) {
                LOGGER.error("失败的数据库连接", e);
            } finally {
                CONNECTION_HOLDER.set(conn);
            }
        }
        return conn;
    }
}
