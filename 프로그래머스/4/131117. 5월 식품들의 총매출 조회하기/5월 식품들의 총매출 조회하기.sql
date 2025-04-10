-- 2022/05의 PRODUCT_ID별 주문량의 합 테이블
WITH O AS (SELECT PRODUCT_ID, SUM(AMOUNT) AS SUM
           FROM FOOD_ORDER
           WHERE PRODUCE_DATE LIKE '2022-05%'
           GROUP BY PRODUCT_ID
)

SELECT P.PRODUCT_ID, P.PRODUCT_NAME, P.PRICE*O.SUM AS TOTAL_SALES
FROM FOOD_PRODUCT AS P
JOIN O ON P.PRODUCT_ID=O.PRODUCT_ID
ORDER BY TOTAL_SALES DESC, P.PRODUCT_ID


