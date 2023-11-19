import sys
T = int(sys.stdin.readline().strip())
# 문자열을 저장하고 싶은 경우 : rstrip
for i in range(T):
    A, B = map(int, sys.stdin.readline().split())
    print(A+B)