def solution(my_string, queries):
    for i in range(len(queries)):
        a, b = queries[i][0], queries[i][1]
        my_string = my_string[:a]+my_string[a:b+1][::-1]+my_string[b+1:]
    return my_string