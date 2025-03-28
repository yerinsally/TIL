-- FrontEnd 스킬을 포함한 개발자 : 비트연산자 사용

-- 1. DEVERLOPERS의 스킬을 세분화한 테이블 생성 후 스킬 조건 달기
-- 단, DISTINCT 사용 : 여러 FrontEnd 스킬 가진 개발자는 중복 추출되므로
/*
SELECT DISTINCT D.ID, D.EMAIL, D.FIRST_NAME, D.LAST_NAME
FROM DEVELOPERS AS D
JOIN SKILLCODES AS S ON (D.SKILL_CODE & S.CODE = S.CODE)
WHERE S.CATEGORY LIKE 'Front%'
ORDER BY D.ID
*/
-- 2. 더 직관적으로 푸는 방법
-- 모든 FrontEnd 스킬 더한 후, SKILL_CODE와 비트연산(&)하면 0 이상
-- 왜? FrontEnd 스킬을 포함한 경우, 비트연산(&)하면 1
SELECT ID, EMAIL, FIRST_NAME, LAST_NAME
FROM DEVELOPERS
WHERE SKILL_CODE & (SELECT SUM(CODE)
                    FROM SKILLCODES
                    WHERE CATEGORY = 'Front End') > 0
ORDER BY ID ASC;