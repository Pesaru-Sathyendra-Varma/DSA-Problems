/* Write your PL/SQL query statement below */
Select class from Courses GROUP BY class having Count(*)>=5;