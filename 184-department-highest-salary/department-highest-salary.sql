# Write your MySQL query statement below

select D.name as Department,E.name as Employee, E.salary as Salary from 
Employee E inner join Department D on E.departmentId=D.id where
E.salary=(
    select max(e2.salary) from Employee e2
    where e2.departmentId=E.departmentId
);