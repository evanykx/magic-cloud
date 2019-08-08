package cn.ice.lab;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDatasource {
    @Resource
    DataSource dataSource;

    @Resource
    JdbcTemplate jdbcTemplate;

    @Test
    public void contextLoads(){
        Connection connection = null;
        try {
            connection = dataSource.getConnection();

        } catch (SQLException e) {
            System.err.println(e.toString());
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                }catch (SQLException e) {
                    // Ignore
                }
            }
        }
    }
}
