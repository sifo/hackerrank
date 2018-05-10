-- https://www.hackerrank.com/challenges/earnings-of-employees/problem

select max(salary*months), count(*) from employee where salary*months=(select max(salary*months) from employee order by salary);
