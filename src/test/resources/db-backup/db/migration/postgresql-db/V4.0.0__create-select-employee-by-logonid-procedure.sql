CREATE OR REPLACE PROCEDURE SelectEmployeeByLogonId (VARCHAR) LANGUAGE plpgsql
AS
$$ BEGIN
SELECT *
FROM Employee
WHERE logonid = $1;

END;
$$;

GRANT ALL
  ON PROCEDURE SelectEmployeeByLogonId
  TO "EMPLOYEE_APP_USER";