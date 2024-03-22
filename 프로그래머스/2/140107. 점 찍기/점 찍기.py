# def solution(k, d):
#     answer = 0
#     ab = []
#     dist = []
#     for i in range(d+1):
#         if i % k == 0:
#             ab.append(i)
#     for j in ab:
#         for q in ab:
#             dist.append([j,q])
#     for n in range(len(dist)):
#         if (dist[n][0])**2+(dist[n][1])**2 <= d**2:
#             answer+=1
#     return answer
# def solution(k, d):
#     answer = 0
#     for i in range(d+1):
#         if i % k == 0:
#             for j in range(d+1):
#                 if j % k == 0:
#                     if i*i + j*j <= d*d:
#                         answer += 1
#     return answer
def solution(k, d):
    answer = 0
    for x in range(0, d+1 ,k):
        max_y = int((d**2 - x**2)**0.5) #원의 방정식 이용해서 y의 최댓값 도출
        answer += (max_y // k) + 1 #max_y까지 가능한 값의 개수
    return answer