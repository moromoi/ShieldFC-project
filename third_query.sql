/* list of people that earn 15K-30K dollars and don’t live in California */

select users.name, comps.company_name, comps.city
from tbl_userinfo users
join tbl_company comps on users.Company = comps.id
where users.salary between 15 and 30 and comps.state <> 'California'
