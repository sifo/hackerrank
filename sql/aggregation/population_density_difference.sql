-- https://www.hackerrank.com/challenges/population-density-difference/problem

select (select population from city order by population desc limit 1) - (select population from city order by population asc limit 1);

select max(population) - min(population) from city;
