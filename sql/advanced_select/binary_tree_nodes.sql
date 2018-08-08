-- https://www.hackerrank.com/challenges/binary-search-tree-1/problem

select
    n as n1,
    case
        when p is null then 'Root'
        when (select count(*) from bst where p=n1) > 0 then 'Inner'
        else 'Leaf'
    end
    as node_type
from bst
order by n;
