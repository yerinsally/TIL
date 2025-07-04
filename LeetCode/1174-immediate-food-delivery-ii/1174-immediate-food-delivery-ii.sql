-- 고객의 첫번째 주문 테이블
WITH FIRST AS (
    SELECT *
    FROM DELIVERY
    WHERE (CUSTOMER_ID, ORDER_DATE) IN (SELECT CUSTOMER_ID, MIN(ORDER_DATE) FROM DELIVERY GROUP BY CUSTOMER_ID)
    GROUP BY CUSTOMER_ID
)
SELECT ROUND((SUM(IF(ORDER_DATE = CUSTOMER_PREF_DELIVERY_DATE,1,0))/COUNT(*))*100,2) AS IMMEDIATE_PERCENTAGE
FROM FIRST