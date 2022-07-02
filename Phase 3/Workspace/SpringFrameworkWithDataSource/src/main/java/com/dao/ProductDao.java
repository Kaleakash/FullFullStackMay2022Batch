package com.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.bean.Product;
@Repository						// Dao layer specific annotation 
public class ProductDao {
	
//DataSource ds;					// we were searching DataSoure featuers using JNDI lookup 
//	@Autowired
//	DataSource ds;				// Search the database connection in XML file 
//	public int insertProductInfo(Product product) {
//		try {
//			Connection con = ds.getConnection();
//			PreparedStatement pstmt  = con.prepareStatement("insert into product values(?,?,?)");
//			pstmt.setInt(1, product.getPid());
//			pstmt.setString(2, product.getPname());
//			pstmt.setFloat(3, product.getPrice());
//			int res = pstmt.executeUpdate();
//			return res;
//		} catch (Exception e) {
//		System.out.println(e);
//		return 0;
//		}
//	}
//	
//	public List<Product> getAllProduct() {
//		List<Product> listOfProduct = new ArrayList<Product>();
//		try {
//			Connection con = ds.getConnection();
//			PreparedStatement pstmt  = con.prepareStatement("select * from product");
//			ResultSet rs= pstmt.executeQuery();
//			while(rs.next()) {
//				Product p = new Product();
//				p.setPid(rs.getInt(1));
//				p.setPname(rs.getString(2));
//				p.setPrice(rs.getFloat(3));
//				listOfProduct.add(p);
//			}
//			return listOfProduct;
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//		return null;
//	}
	
	@Autowired
	JdbcTemplate jdbcTemplate;				// DI for jdbcTemplate 
	
	public int insertProductInfo(Product product) {
		try {
			// insert, delete and update 
			return jdbcTemplate.update("insert into product values(?,?,?)", product.getPid(),product.getPname(),product.getPrice());
		} catch (Exception e) {
		System.out.println(e);
		return 0;
		}
	}
	
	
	public List<Product> getAllProduct() {
		try {
			//jdbcTemplate.q
			//return jdbcTemplate.query("select * from product", new MyProductRowMapper());
			
			return jdbcTemplate.query("select * from product", (ResultSet rs, int rowNum)  ->{		// it will map each record to object (product)
				Product p = new Product();
				p.setPid(rs.getInt(1));
				p.setPname(rs.getString(2));
				p.setPrice(rs.getFloat(3));
				return p;
			});
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
		
}


class MyProductRowMapper implements RowMapper<Product>{

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {		// it will map each record to object (product)
		// TODO Auto-generated method stub
		Product p = new Product();
		p.setPid(rs.getInt(1));
		p.setPname(rs.getString(2));
		p.setPrice(rs.getFloat(3));
		return p;
	}
	
	
}