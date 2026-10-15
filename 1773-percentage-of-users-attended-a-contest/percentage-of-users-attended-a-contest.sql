# Write your MySQL query statement below
SELECT 
    contest_id,
    Round(COUNT(user_id)/(SELECT COUNT(*) FROM Users)*100,2) as percentage 
FROM Register 
GROUP BY contest_id
order by percentage desc , contest_id asc
