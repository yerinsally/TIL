def solution(str1, str2):
    answer = ''
    for str1, str2 in zip(str1, str2):
        answer = answer + str1 + str2
    return answer