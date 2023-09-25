'''
Given an integer 'N', return all the devisors of 'N' in ascending order.
'''

from typing import List

def printDivisors(n: int) -> List[int]:
    # Write your code here
    div = []
    i = 1

    while i*i <= n:
        if n%i == 0:
            div.append(i)

            if i!=n//i:
                div.append(n//i)

        i += 1

    return sorted(div)