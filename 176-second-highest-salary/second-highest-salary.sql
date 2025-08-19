
select max(salary) as SecondHighestSalary from
(select salary from Employee
group by salary
order by salary desc
limit 1 offset 1)as high
