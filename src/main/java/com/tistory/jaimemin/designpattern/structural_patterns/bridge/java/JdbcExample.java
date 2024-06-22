package com.tistory.jaimemin.designpattern.structural_patterns.bridge.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("org.h2.Driver"); // 구체적인 쪽은 Driver (MySql은 MySqlDriver, H2는 h2Driver, etc.)

		/**
		 * 추상화 쪽에 해당함
		 * 새로운 DB가 만들어진닫고 해서 추상화된 코드(JDBC API)가 바뀌진 않음
		 * 드라이버만 바뀜
		 *
		 * OCP가 잘 적용되어 있음
		 */
		try (Connection conn = DriverManager.getConnection("jdbc:h2:mem:~/test", "sa", "")) {
			String sql = "CREATE TABLE  ACCOUNT " +
				"(id INTEGER not NULL, " +
				" email VARCHAR(255), " +
				" password VARCHAR(255), " +
				" PRIMARY KEY ( id ))";

			Statement statement = conn.createStatement();
			statement.execute(sql);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
