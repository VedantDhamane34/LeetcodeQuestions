# Write your MySQL query statement below
SELECT p.product_name, s.year, s.price FROM sales AS s
INNER JOIN product AS P
ON p.product_id = s.product_id;