package com.tutoref.batch;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.tutoref.batch.entity.Product;

public class ProductMapper implements RowMapper<Product> {


	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		Product product = new Product();
		product.setId(rs.getInt("id"));
		product.setName(rs.getString("name"));
		product.setQuantity(rs.getInt("quantity"));
		product.setUnitPrice(rs.getDouble("unit_price"));
		return product;
	}

	
}
