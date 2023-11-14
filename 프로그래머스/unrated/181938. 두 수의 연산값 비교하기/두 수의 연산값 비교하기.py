def solution(a, b):
    A = str(a) + str(b)
    B = 2 * a * b
    if int(A) >= B:
        answer = int(A)
    else:
        answer = B
    return answer