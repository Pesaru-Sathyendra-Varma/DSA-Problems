/* Write your PL/SQL query statement below */
/* SELECT E1.name FROM Employee E1,Employee mgr WHERE mgr.id=E1.ManagerId  AND E1.salary > mgr.salary; */
SELECT EMP.name AS Employee FROM Employee EMP,Employee MGR
WHERE EMP.managerId=MGR.id AND EMP.salary>MGR.salary
