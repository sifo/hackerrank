/* https://www.hackerrank.com/challenges/occupations/problem */

/* http://www.artfulsoftware.com/infotree/qrytip.php?id=78

The first example on the link gives us the idea to first transform the table as follow:

id col_id name      occupation
1  1      Aamina    Doctor
1  2      Ashley    Professor
2  2      Belvet    Professor
3  2      Britney   Professor
1  3      Christeen Singer
1  4      Eve       Actor
2  3      Jane      Singer
2  4      Jennifer  Actor
3  3      Jenny     Singer
2  1      Julia     Doctor
3  4      Ketty     Actor
4  3      Kristeen  Singer
4  2      Maria     Professor
5  2      Meera     Professor
6  2      Naomi     Professor
3  1      Priya     Doctor
7  2      Priyanka  Professor
4  4      Samantha  Actor

col_id: depends on occupation
id: incremental value by occupation

And then, we can easily pivot by following the link first example.
*/

SET @a=0;
SET @b=0;
SET @c=0;
SET @d=0;

select
    GROUP_CONCAT(if(col_id = 1, name, NULL)) AS 'doctor',
    GROUP_CONCAT(if(col_id = 2, name, NULL)) AS 'professor',
    GROUP_CONCAT(if(col_id = 3, name, NULL)) AS 'singer',
    GROUP_CONCAT(if(col_id = 4, name, NULL)) AS 'actor'
from (
    select
        case
            when occupation = 'Doctor' then @a:=@a+1
            when occupation = 'Professor' then @b:=@b+1
            when occupation = 'Singer' then @c:=@c+1
            when occupation = 'Actor' then @d:=@d+1
            else null
        end as id,
        case
            when occupation = 'Doctor' then 1
            when occupation = 'Professor' then 2
            when occupation = 'Singer' then 3
            when occupation = 'Actor' then 4
            else null
        end as col_id,
        name,
        occupation
    from occupations
    order by name asc
) as sub_table
group by id;
