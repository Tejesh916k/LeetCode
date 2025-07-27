# Write your MySQL query statement below

select e.name as employee from Employee e INNER JOIN Employee m on e.managerId=m.id where
m.salary<e.salary;