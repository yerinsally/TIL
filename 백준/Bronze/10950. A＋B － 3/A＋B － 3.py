T = int(input())

for i in range(T):
    if i == T:
        break
    else:
        A, B = map(int, input().split())
        print(A+B)