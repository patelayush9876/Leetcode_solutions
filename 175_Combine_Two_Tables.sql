# Write your MySQL query statement below
SELECT 
Person.firstname,
Person.lastName,
ddress.city,
Address.state from Person
left join Address
using (personId)