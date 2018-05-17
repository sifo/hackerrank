-- https://www.hackerrank.com/challenges/average-population-of-each-continent/problem

select country.continent, floor(avg(city.population))
from city left join country on country.code=city.countrycode
where continent is not null group by country.continent;
