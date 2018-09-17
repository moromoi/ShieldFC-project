/* 	Implement a function that matches between man and woman, according the following rules: 
-	Make sure that singles which want kids will not be matched with single which don’t want kids.
-	A man over the age of 30 can only date women over the age of 27
-	The man and the woman should not be working for the same company
-	The man and the woman should be working in the same U.S. state
*/


select 
	men.name as men_name, men.gender as men_gender, men.age as men_age, men_company.company_name as men_company_company_name,
	women.name as women_name, women.gender as women_gender, women.age as women_age, women_company.company_name as women_company_company_name
from tbl_userinfo men
join tbl_userinfo women
join tbl_status men_status on men.status = men_status.id
join tbl_status women_status on women.status = women_status.id
join tbl_company men_company on men.company = men_company.id
join tbl_company women_company on women.company = women_company.id
where 
	(
		men.gender = 'M' and women.gender = 'F'
	)  and
	(
		(
			men_status.status = 'single want kids' and women_status.status <> 'single doesn''t want kids'
		) or (
			men_status.status = 'single doesn''t want kids' and women_status.status <> 'single want kids'
		)
	) and
	(
		(men.age >= 30 and women.age >= 27) or (men.age < 30)
	) and 
	(
		men.company <> women.company
	) and 
	(
		men_company.state <> women_company.state
	)



