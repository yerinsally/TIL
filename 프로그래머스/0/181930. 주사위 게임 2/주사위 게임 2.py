def solution(a, b, c):
    answer = 0
    n = a+b+c
    if a!=b and b!=c and a!=c:
        answer = n
    elif (a==b and b!=c and a!=c)or(b==c and a!=c and a!=b)or(a==c and a!=b and b!=c):
        answer = n*(a*a+b*b+c*c)
    elif a==b==c:
        answer = n*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c)
    return answer
