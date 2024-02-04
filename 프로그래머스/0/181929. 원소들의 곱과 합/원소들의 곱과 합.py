def solution(num_list):
    answer = 0
    num1 = 1
    num0 = 0
    for num in num_list:
        num1 *= num
        num0 += num
        if num1 > num0*num0:
            answer = 0
        else:
            answer = 1
    return answer