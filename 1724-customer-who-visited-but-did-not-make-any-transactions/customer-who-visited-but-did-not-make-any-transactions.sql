# Write your MySQL query statement below
select customer_id ,COuNT(customer_id) AS count_no_trans
FROM Visits
LEFT JOIN Transactions ON Visits.visit_id = Transactions.visit_id
WHERE transaction_id IS NULL
Group by customer_id;