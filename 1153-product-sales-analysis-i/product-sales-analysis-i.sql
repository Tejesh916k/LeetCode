# Write your MySQL query statement below
select p.product_name,s.year,s.price
 from product p join sales s
 on p.product_id=s.product_id;
