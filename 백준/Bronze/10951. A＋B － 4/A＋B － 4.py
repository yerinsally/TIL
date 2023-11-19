# EOF 에러 처리 : 예외처리 필수
while True:
    try:
        A, B = map(int, input().split())
        print(A+B)
    except:
        break
# 아무것도 입력안하고 엔터를 쳤을 때 while문이 종료됨