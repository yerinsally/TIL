def solution(a, d, included):
    answer = 0
    list = []
    for i in range(len(included)):
        n = a+d*i
        list.append(n)
    for i in range(len(included)):
        if included[i] == True:
            answer += list[i]
    return answer