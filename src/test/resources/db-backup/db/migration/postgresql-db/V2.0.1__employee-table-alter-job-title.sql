-- Altering the employee table and increasing the character count of job_title
ALTER TABLE EMPLOYEE
ALTER COLUMN job_title TYPE VARCHAR(50);