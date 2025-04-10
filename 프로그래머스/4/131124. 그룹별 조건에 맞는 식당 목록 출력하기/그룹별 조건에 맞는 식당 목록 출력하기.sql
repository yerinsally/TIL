-- 가장 리뷰가 많은 수 추출 : 여러 회원이 최대 리뷰 수 가질 수 있음
-- REVIEW_COUNT 테이블 : 리뷰 수 카운트하는 테이블 -> WHERE에서 MAX 쓰도록
WITH REVIEW_COUNT AS (SELECT MEMBER_ID, COUNT(REVIEW_ID) AS CNT
                      FROM REST_REVIEW
                      GROUP BY MEMBER_ID
)
SELECT M.MEMBER_NAME, R.REVIEW_TEXT, DATE_FORMAT(R.REVIEW_DATE,'%Y-%m-%d') AS REVIEW_DATE
FROM MEMBER_PROFILE AS M
JOIN REST_REVIEW AS R ON M.MEMBER_ID = R.MEMBER_ID
JOIN REVIEW_COUNT AS C ON M.MEMBER_ID = C.MEMBER_ID
WHERE C.CNT = (SELECT MAX(CNT) FROM REVIEW_COUNT)
ORDER BY REVIEW_DATE, R.REVIEW_TEXT