from collections import Counter
def solution(weights):
    answer = 0
    counter = Counter(weights)
    for i in counter: #i=weight 값, counter[i]=개수
        answer += counter[i] * (counter[i] - 1) // 2 #조합의 개수 : nC2 n!/2!(n - 2)!
        answer += counter[i] * counter[i * 3 / 2] #3/2, 2(4/2), 4/3 비율이면 짝꿍의 쌍 생성 
        answer += counter[i] * counter[i * 2]
        answer += counter[i] * counter[i * 4 / 3]
    return answer