# Write your MySQL query statement below
select sp.name from SalesPerson sp where sales_id not in 
(select o.sales_id from orders o join company c
on c.com_id=o.com_id where c.name = "Red" );