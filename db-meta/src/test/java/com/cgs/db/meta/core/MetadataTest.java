package com.cgs.db.meta.core;

import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cgs.db.meta.retriever.MetaCrawler;
import com.cgs.db.util.JDBCUtils;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config.xml")
public class MetadataTest {

	@Autowired
	private MetaLoader metaLoader;
	private DatabaseMetaData dmd;
	
	@Before
	public void getCurrentTime() {
		dmd = ((MetaLoaderImpl)metaLoader).getMetaCrawler().getDbm();
	}
	
	@Test
	public void typeInfo() {
		ResultSet rs = null;
		try {
			System.out.println("-------------------");
			//rs = dmd.getTableTypes();
			rs = dmd.getTypeInfo();
			while (rs.next()) {
				System.out.println(rs.getObject(1));
			}
			System.out.println("-------------------");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.closeResultSet(rs);
			closeConn();
		}
	}
	
	public void closeConn() {
		try {
			JDBCUtils.closeConnection(dmd.getConnection());
		} catch (SQLException e) {
			//do nothing
		}
	}
	
}
