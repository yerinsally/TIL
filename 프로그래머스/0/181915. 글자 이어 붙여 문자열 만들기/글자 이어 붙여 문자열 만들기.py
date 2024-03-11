def solution(my_string, index_list):
    answer = ''
    my_string_list = list(my_string)
    for i in index_list:
        answer += my_string_list[i]
    return answer