
-- Drop the Employee Table if it exists
DROP TABLE IF EXISTS EMPLOYEE;

-- Drop the Employee Sequence if it exists
DROP SEQUENCE IF EXISTS EMPLOYEE_SEQ;

--Create the Employee table
    CREATE TABLE EMPLOYEE (
        ID_NUMBER BIGINT NOT NULL,
        VERSION_ID BIGINT DEFAULT 0 NOT NULL,
        address VARCHAR(50),
        city VARCHAR(30),
        country VARCHAR(30),
        state VARCHAR(2),
        zip_code INTEGER,
        business_phone VARCHAR(15),
        company VARCHAR(30),
        email_address VARCHAR(50),
        fax_phone VARCHAR(15),
        first_name VARCHAR(30),
        home_phone VARCHAR(15),
        job_title VARCHAR(30),
        last_name VARCHAR(30),
        mobile_phone VARCHAR(15),
        notes VARCHAR(255),
        web_page VARCHAR(100),
        LOGONID VARCHAR(20) NOT NULL,
        PRIMARY KEY (ID_NUMBER)
    );

-- Create the employee sequence
CREATE SEQUENCE EMPLOYEE_SEQ AS BIGINT START 20 INCREMENT 1 MINVALUE 20 OWNED BY EMPLOYEE.ID_NUMBER;

-- Creating a Unique index for LOGONID
CREATE UNIQUE INDEX CONCURRENTLY IDX_EMPLOYEE_LOGONID ON EMPLOYEE (ID_NUMBER);
ALTER TABLE EMPLOYEE ADD CONSTRAINT UC_EMPLOYEE_LOGONID UNIQUE USING INDEX IDX_EMPLOYEE_LOGONID;

GRANT INSERT, SELECT, UPDATE, DELETE 
ON TABLE employee 
TO "EMPLOYEE_APP_USER";

GRANT USAGE
  ON SEQUENCE EMPLOYEE_SEQ
  TO "EMPLOYEE_APP_USER";