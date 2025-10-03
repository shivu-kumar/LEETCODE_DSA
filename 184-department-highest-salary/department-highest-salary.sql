SELECT Department, Employee, Salary
FROM (
  SELECT 
    d.name AS Department,
    e.name AS Employee,
    e.salary AS Salary,
    DENSE_RANK() OVER (PARTITION BY e.departmentId ORDER BY e.salary DESC) AS dense_rank_num
  FROM Employee e
  LEFT JOIN Department d ON e.departmentId = d.id
) AS t
WHERE t.dense_rank_num = 1;
