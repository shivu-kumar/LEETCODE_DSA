# Write your MySQL query statement below
select Department , Employee , Salary From 
(
    select 
    d.name as Department ,
    e.name as Employee ,
    e.salary as Salary ,
    dense_rank() over (partition by e.departmentId order by e.salary desc) as dense_rank_num
    from Employee e
    left join Department d
    on e.departmentId=d.id
) as t
where t.dense_rank_num=1;