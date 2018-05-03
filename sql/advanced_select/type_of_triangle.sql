-- https://www.hackerrank.com/challenges/what-type-of-triangle/problem

select
    case
        when A>=(B+C) or B>=(A+C) or C>=(A+B) then 'Not A Triangle'
        when A=B and B=C then 'Equilateral'
        when (A=B and B!=C) or (B=C and C!=A) or (C=A and B!=C) then 'Isosceles'
        else 'Scalene'
    end
from triangles;
