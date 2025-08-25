# Write your MySQL query statement below
SELECT p.product_name, s.year, s.price FROM sales AS s
LEFT JOIN product AS P
ON p.product_id = s.product_id;