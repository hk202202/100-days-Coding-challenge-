# Write your MySQL query statement below
SELECT p.product_name AS product_name , s.year As year, s.price AS price
FROM Sales s
LEFT JOIN Product p USING(product_id);