/* Implement a function that  finds accounts that have less than 20 days
 until their account expires and return them as a results list,
 Create this test as failure test: success is : 10 records ,
 return 12 records and explain the failure reason (returns an extra records in test results),
 for this please print name, plan type and how many days left. */

select users.name, plans.plan_name, acc.expiration_days
from tbl_userinfo users
join tbl_account acc on users.account = acc.id
join tbl_plan plans on acc.plan_id = plans.id
where acc.expiration_days < 20
