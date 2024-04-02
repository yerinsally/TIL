WITH 
A AS (SELECT MAX(SIZE_OF_COLONY) AS VAL, EXTRACT(YEAR FROM DIFFERENTIATION_DATE) AS YEAR 
      FROM ECOLI_DATA 
      GROUP BY YEAR
),
B AS (SELECT ID, EXTRACT(YEAR FROM DIFFERENTIATION_DATE) AS YEAR, SIZE_OF_COLONY
      FROM ECOLI_DATA
)

SELECT A.YEAR, A.VAL-B.SIZE_OF_COLONY AS YEAR_DEV, B.ID
FROM A, B
WHERE A.YEAR = B.YEAR
ORDER BY YEAR, YEAR_DEV