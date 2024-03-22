def solution(targets):
    answer = 0
    bound = 0 #현재까지 격추 가능한 미사일의 최대 범위
    for s, e in sorted(targets):
        if bound > s: #이미 해당 범위에 요격할 수 있는 미사일 존재
            bound = min(bound, e)
        else: #새로운 요격 미사일 필요
            bound = e
            answer += 1
    return answer