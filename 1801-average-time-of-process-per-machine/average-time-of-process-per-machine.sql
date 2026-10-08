# Write your MySQL query statement below

    select machine_id,
    Round(Avg(endTime - startTime),3) as processing_time 
    From  (
        SELECT machine_id,process_id,
           Max(CASE WHEN activity_type = 'start' THEN timestamp END) AS startTime,
           Max(CASE WHEN activity_type = 'end' THEN timestamp END) AS endTime
    FROM Activity
    group by machine_id,process_id
    ) as t
    group by machine_id



