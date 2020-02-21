-- Insert seed data
-- Employee table
INSERT INTO employee (ID_NUMBER, company, last_name, first_name, email_address, job_title, business_phone, home_phone, mobile_phone, fax_phone, address, city, state, zip_code, country, web_page, notes, logonId)
	VALUES (1,'Northwind Traders','Freehafer','Nancy','nancy@northwindtraders.com','Sales Representative','(123)555-0100','(123)555-0102',NULL,'(123)555-0103','123 1st Avenue','Seattle','WA','99999','USA','#http://northwindtraders.com#',NULL, 'nfreehafer');
INSERT INTO employee (ID_NUMBER, company, last_name, first_name, email_address, job_title, business_phone, home_phone, mobile_phone, fax_phone, address, city, state, zip_code, country, web_page, notes, logonId)
	VALUES (2,'Northwind Traders','Cencini','Andrew','andrew@northwindtraders.com','Vice President, Sales','(123)555-0100','(123)555-0102',NULL,'(123)555-0103','123 2nd Avenue','Bellevue','WA','99999','USA','http://northwindtraders.com#http://northwindtraders.com/#','Joined the company as a sales representative, was promoted to sales manager and was then named vice president of sales.', 'acencini');