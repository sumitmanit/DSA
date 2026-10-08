SELECT id
FROM (
    SELECT id,
           recordDate,
           temperature,
           LAG(temperature) OVER (ORDER BY recordDate) AS prev_temperature,
           LAG(recordDate) OVER (ORDER BY recordDate) AS prev_date
    FROM Weather
) AS t
WHERE temperature > prev_temperature
  AND DATEDIFF(recordDate, prev_date) = 1;