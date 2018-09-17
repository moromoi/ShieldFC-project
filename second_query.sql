/* Implement a function that display list of people that earn up to 15K dollars and live in California */

select users.name, comps.company_name, comps.city
from tbl_userinfo users
join tbl_company comps on users.Company = comps.id
where users.salary <= 15 and comps.state ='California'

