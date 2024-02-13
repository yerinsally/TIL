def solution(n, control):
    my_list = list(control)
    for i in my_list:
        if i == "w": n += 1
        if i == "s": n -= 1
        if i == "d": n += 10
        if i == "a": n -= 10
    return n