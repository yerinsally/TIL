N = int(input())
for i in range(1,N+1):
    # 0 제외해야 빈칸 출력되지 않음
    print(" "*(N-i) + "*"*i)