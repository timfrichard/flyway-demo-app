/**
 * Property of Gifted Concepts LLC.
 */
package com.sparkys.app.flyway.config;

import javax.sql.DataSource;

import org.apache.commons.lang3.Validate;
import org.hsqldb.jdbc.JDBCDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

/**
 * @author Tim Richard
 *
 */
@Configuration
@Profile({ "hsql-persisted-profile" })
public class HSQLPersistedSQLDataSourceConfig {

    private static final String DB_APPLICATION_USER_NAME_PROP = "com.sparkys.online.orders.employee.db.user.name";
    private static final String DB_APPLICATION_USER_PASSWORD_PROP = "com.sparkys.online.orders.employee.db.user.password";
    private static final String DB_LOGIN_TIMEOUT_PROP = "com.sparkys.online.orders.employee.db.login.timeout";
    private static final String DB_SCHEMA_NAME_PROP = "com.sparkys.online.orders.employee.db.schema.name";
    private static final String DB_URL_PROP = "com.sparkys.online.orders.employee.db.url";
    private static final String PUBLIC_SCHEMA = "PUBLIC";

    @Autowired
    private Environment env;

    @Bean
    @Primary
    public DataSource dataSource() throws Exception {

	final String dbURL = env.getProperty(DB_URL_PROP);
	Validate.notBlank(dbURL, "The database URL has been left blank.");

	final JDBCDataSource ds = new JDBCDataSource();
	ds.setDatabaseName(env.getProperty(DB_SCHEMA_NAME_PROP, PUBLIC_SCHEMA));
	ds.setUrl(dbURL);
	ds.setLoginTimeout(
	        Integer.valueOf(env.getProperty(DB_LOGIN_TIMEOUT_PROP, "30")));
	ds.setPassword(env.getProperty(DB_APPLICATION_USER_PASSWORD_PROP));
	ds.setUser(env.getProperty(DB_APPLICATION_USER_NAME_PROP));

	return ds;
    }

}
