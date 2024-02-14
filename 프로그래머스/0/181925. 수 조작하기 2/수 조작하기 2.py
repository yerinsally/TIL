def solution(numLog):
    answer = ''
    for i in range(len(numLog)):
        if i == 0: continue
        if numLog[i] - numLog[i-1] == 1: answer+='w'
        if numLog[i] - numLog[i-1] == -1: answer+='s'
        if numLog[i] - numLog[i-1] == 10: answer+='d'
        if numLog[i] - numLog[i-1] == -10: answer+='a'
    return answer