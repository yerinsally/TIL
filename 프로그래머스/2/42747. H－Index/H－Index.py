def solution(citations):
    citations.sort(reverse=True)
    n = len(citations)
    for i in range(n):
        if citations[i] < i+1: #길이
            return i
    return n