# Write your MySQL query statement below
Select w1.id
from weather w1 , weather w2  
 where DATEDIFF (w1.recordDate ,W2.recordDate)=1 AND 
 w1.temperature > w2.temperature;