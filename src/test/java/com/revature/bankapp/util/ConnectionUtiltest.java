package com.revature.bankapp.util;

import java.sql.Connection;

import org.junit.Test;

import junit.framework.TestCase;

public class ConnectionUtiltest extends TestCase {
	@Test
    public void testConnection() {
        Connection connection = ConnectionUtil.getConnection();
        assertNotNull(connection);
    }


}
