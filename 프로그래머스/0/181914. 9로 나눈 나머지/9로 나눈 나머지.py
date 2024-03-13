def solution(number):
    n = 0
    number_list = list(number)
    for i in number_list: 
        n += int(i)
    answer = n%9
    return answer