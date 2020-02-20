--Creating the view to check implementation
CREATE VIEW view_logonid_and_fullname 
AS
SELECT emp.LOGONID,
       emp.FULL_NAME,
       concat(emp.FIRST_NAME,' ',emp.LAST_NAME) AS TRUE_FULL_NAME
FROM employee emp
ORDER BY TRUE_FULL_NAME DESC;

GRANT SELECT
  ON view_logonid_and_fullname
  TO "EMPLOYEE_APP_USER";