from collections import Counter
def solution(k, tangerine):
    answer = 0
    counter = Counter(tangerine)
    sort_ = sorted(counter.items(),key=lambda x:x[1],reverse=True) #정렬된 딕셔너리로 귤 개수 맞추기(최소)
    for i in sort_:
        k -= i[1]
        answer += 1
        if k <= 0:
            break
    return answer