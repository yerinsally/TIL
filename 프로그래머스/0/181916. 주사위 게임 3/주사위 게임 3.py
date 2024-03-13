def solution(a, b, c, d):
    answer = 0
    count = {}
    for i in [a,b,c,d]:
        try: count[i] += 1
        except: count[i] = 1
    convert = {m:n for n,m in count.items()}
    du = [] #중복 원소 리스트
    du_x = [] #중복 아닌 원소 리스트
    for n,m in count.items():
        if m>=2: du.append(n)
        if m<2: du_x.append(n)
        if len(du_x)==0: answer=1111*n
        if len(du)==1 and len(du_x)==1: answer=(10*du[0]+du_x[0])**2
        if len(du)==2 and len(du_x)==0: answer=(du[0]+du[1])*abs(du[0]-du[1])
        if len(du)==1 and len(du_x)==2: answer=du_x[0]*du_x[1]
        if len(du)==0: answer=min(a,b,c,d)
    return answer