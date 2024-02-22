def solution(l, r):
    answer = []
    for num in range(l, r+1):
        if all(digit in ['0','5'] for digit in str(num)):
            answer.append(num)
    if not answer: return [-1]
    return answer