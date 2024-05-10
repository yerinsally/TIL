-- ORDER BY에 함수 사용하는 경우
SELECT A.ANIMAL_ID, A.NAME
FROM ANIMAL_INS AS A
INNER JOIN ANIMAL_OUTS AS B ON A.ANIMAL_ID=B.ANIMAL_ID
ORDER BY DATEDIFF(B.DATETIME,A.DATETIME) DESC
LIMIT 2