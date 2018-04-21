-- https://www.hackerrank.com/challenges/weather-observation-station-4/problem

select (select count(*) from station) - (select count(distinct city) from station);
select count(city) - count(distinct city) from station;
