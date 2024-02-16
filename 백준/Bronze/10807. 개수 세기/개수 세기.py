# 정수의 개수 N 입력
N = int(input())
# N개의 정수 입력
numbers = [int(x) for x in input().split()]
# 찾으려는 정수 v 입력
v = int(input())

# 배열에서 v의 인덱스 찾기 및 개수 세기
count = 0
for i in range(N):
    if numbers[i] == v:
        count += 1
print(count)
