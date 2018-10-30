package jp.co.sample.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import jp.co.sample.domain.User1;



/**
 * リポジトリ.
 * 
 * @author junpei.oyama
 *
 */
@Repository
public class UserDao {
	
	/** NamedParameterJdbcTemplateをDI */
	@Autowired
	private NamedParameterJdbcTemplate template;
	
	/** RowMapperを定義 */
	private static final RowMapper<User1> EMPLOYEE_ROW_MAPPER = (rs, i) -> {
		User1 user = new User1();
		user.setId(rs.getInt("id"));
		user.setName(rs.getString("name"));
		user.setAge(rs.getString("age"));
		user.setAddress(rs.getString("address"));
		return user;
	};
	
	
	/**
	 * 主キー検索を行うload()メソッドを定義
	 * 
	 * @param id User1のid
	 * @return 検索されたuser
	 */
	public User1 load(Integer id) {
		
		String sql = "SELECT name, age, address FROM info WHERE id=:id";
		
		SqlParameterSource param = new MapSqlParameterSource().addValue("id", id);
		
		User1 user = template.queryForObject(sql, param, EMPLOYEE_ROW_MAPPER);
		
		return user;
		
	}
	
	
}
