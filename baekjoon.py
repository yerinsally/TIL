A, B = map(int, input().split())
C = int(input())

# A = A + C // 60 
# B = B + C % 60
# if B >= 60: # 업데이트 된 분이 60분을 넘기면 1시간 더하기
#     A = A + 1
#     print(A%24, B-60)
# else:
#     print(A%24, B)

if B+C < 60:
    print(A, B+C)
elif B+C >= 60:
    if A+(B+C)//60 >= 24:
        print(A+(B+C)//60 - 24, (B+C)%60)
    else:
        print(A+(B+C)//60, (B+C)%60)





#a = 초기 시간
#b = 초기 분
#c = 걸리는 시간
#d = 분의 합
#e = 시의 합

# a, b = map(int, input().split())
# c = int(input())
# d = b + c
# if d % 60 == 0:
#     e = a + d // 60
#     d = 0
# else:
#     e = a + d // 60
#     d = b + d % 60

# if e > 24:
#     e = e - 24

# print(e, d)