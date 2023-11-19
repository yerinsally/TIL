def solution(ineq, eq, n, m):
    if ((ineq==">" and eq=="!") or (ineq==">" and eq=="=")) and (n>=m):
        answer = 1
    if ((ineq==">" and eq=="!") or (ineq==">" and eq=="=")) and (n<=m):
        answer = 0
    if ((ineq=="<" and eq=="!") or (ineq=="<" and eq=="=")) and (n<=m):
        answer = 1
    if ((ineq=="<" and eq=="!") or (ineq=="<" and eq=="=")) and (n>=m):
        answer = 0
    if ((ineq==">" or ineq=="<") and eq=="=") and n==m:
        answer = 1
    return answer