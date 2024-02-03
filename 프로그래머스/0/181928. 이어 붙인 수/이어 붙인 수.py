def solution(num_list):
    answer = 0
    num1 = 0
    num2 = 0
    for num in num_list:
        if num % 2 == 1:
            num1 = num1*10 + num
        else:
            num2 = num2*10 + num
    answer = num1 + num2
    return answer

# 10을 곱하는 이유 : 자릿수를 올려주기 위해서임
# 예를 들어, [5,7,8,3]에서 처음 num1 = 5 -> 5*10 + 7 = 57 -> 57*10 + 3 = 573, num2 = 0*10 + 8 = 8