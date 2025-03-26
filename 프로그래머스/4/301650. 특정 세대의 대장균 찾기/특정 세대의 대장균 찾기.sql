-- 3세대의 개체
SELECT E3.ID
FROM ECOLI_DATA AS E3
WHERE E3.PARENT_ID IN (-- 2세대의 개체
                        SELECT E2.ID
                        FROM ECOLI_DATA AS E2
                        WHERE E2.PARENT_ID IN (-- 1세대의 부모 개체
                                                SELECT E1.ID
                                                FROM ECOLI_DATA AS E1
                                                WHERE E1.PARENT_ID IS NULL))

