# Write your MySQL query statement below
SELECT name,bonus
FROM (
    SELECT e.name AS name,b.bonus AS bonus FROM
    Employee e
    LEFT JOIN Bonus b
    ON e.empId=b.empId
) AS t WHERE (t.bonus < 1000 OR t.bonus IS NULL);