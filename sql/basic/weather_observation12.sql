-- https://www.hackerrank.com/challenges/weather-observation-station-12/problem

select distinct city from station where city rlike "^[^aeiou].*[^aeiou]$";
