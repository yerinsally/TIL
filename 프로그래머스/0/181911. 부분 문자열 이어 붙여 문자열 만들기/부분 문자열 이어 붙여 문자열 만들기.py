def solution(my_strings, parts):
    answer = ''
    for i in range(len(my_strings)):
        char = my_strings[i]
        k = char[parts[i][0]:parts[i][1]+1]
        answer += k
    return answer