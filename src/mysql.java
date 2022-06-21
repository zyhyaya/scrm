import com.mysql.jdbc.Driver;

import java.sql.*;

/**
 * 类名：Test
 * 读书破万卷，下笔如有神
 * 代码反行之，算法记于心
 * 作者：劫恋李
 * 日期：2021/6/13 21:28
 * 版本：V1.0
 */
public class mysql {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("1.用户注册成功");
        //通过驱动管理器获取数据库链接对象
        // 2.建立连接
        String url="jdbc:mysql://localhost:3306/luntan?serverTimezone=UTC";
        //jdbc:mysql //
        Connection connection = DriverManager.getConnection(url, "sa", "1234");
        System.out.println("2.数据库链接成功");

    }
}
