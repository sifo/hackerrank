-- https://www.hackerrank.com/challenges/asian-population/problem

select sum(city.population) from city left join country on country.code = city.countrycode where country.continent = 'Asia';
