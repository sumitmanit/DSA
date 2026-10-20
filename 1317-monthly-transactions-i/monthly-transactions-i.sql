# Write your MySQL query statement below
select 
DATE_FORMAT(trans_date , '%Y-%m') AS month, 
country ,
Count(id) as trans_count , 
Sum(state='approved') as approved_count , 
Sum(amount) as trans_total_amount  ,
Sum(Case When state='approved' Then amount Else 0 End) as approved_total_amount 
from Transactions 
Group by month , country