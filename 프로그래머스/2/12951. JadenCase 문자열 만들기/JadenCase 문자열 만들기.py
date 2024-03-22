def solution(s):
    answer = ''
    str_list = s.split(' ')
    res = []
    for char in str_list:
        if char!="":
            res.append(char[0].upper()+char[1:].lower())
        else:
            res.append("")
    answer = " ".join(res)
    return answer