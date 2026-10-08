# Write your MySQL query statement below
select t.name , b.bonus
from employee t
left join bonus b
on t.empId = b.empId
where b.bonus<1000 or b.bonus is null 