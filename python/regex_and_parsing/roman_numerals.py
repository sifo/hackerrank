# https://www.hackerrank.com/challenges/validate-a-roman-number/problem
#
# https://stackoverflow.com/questions/267399/how-do-you-match-only-valid-roman-numerals-with-a-regular-expression
# except we need to exclude MMMM (4000)

regex_pattern = r'^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$'

import re
print(str(bool(re.match(regex_pattern, input()))))
