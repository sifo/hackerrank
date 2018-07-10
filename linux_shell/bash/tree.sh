# https://www.hackerrank.com/challenges/fractal-trees-all/problem

read n

h=32
res=""
base=(49)
for((k=0; k < 5; k++, h/=2))
do
    step=""
    for((i=0; i < $h; i++))
    do
        s=""
        for((j=0; j < 100; j++))
        do
            if [ $k -ge $n ]
            then
                s+="_"
            else
                half=$((h/2))
                if [[ " ${base[@]} " =~ " $j " ]] && [[ $i -ge $half ]]
                then
                    s+="1"
                else
                    flag=false
                    for b in ${base[@]}
                    do
                        if { [ $j = $((b+(h/2)-i)) ] || [ $j = $((b-(h/2)+i)) ]; } && [[ $i -le $half ]]
                        then
                            s+="1"
                            flag=true
                            break
                        fi
                    done
                    if [ $flag = false ]
                    then
                        s+="_"
                    fi
                fi
            fi
        done
        step="$step\n$s"
    done
    newbase=()
    for b in ${base[@]}
    do
        newbase+=($((b+h/2)))
        newbase+=($((b-h/2)))
    done
    base=${newbase[@]}
    res="$step$res"
done

line=""
for((j=0; j < 100; j++))
do
    line+="_"
done

res="$line$res"

echo -e $res
