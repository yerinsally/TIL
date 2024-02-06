def solution(num_list):
    answer = []
    a = len(num_list)-1
    b = len(num_list)-2
    for num in num_list:
        answer.append(num)
        if num_list[a] > num_list[b]:
            c = num_list[a]-num_list[b]
        else:
            c = num_list[a]*2
    answer.append(c)
    return answer