-- 2022년 1월 저자별, 카테고리별 매출액
SELECT B.AUTHOR_ID, A.AUTHOR_NAME, B.CATEGORY, SUM(S.SALES*B.PRICE) AS TOTAL_SALES
FROM BOOK AS B
JOIN AUTHOR AS A ON A.AUTHOR_ID = B.AUTHOR_ID
JOIN BOOK_SALES AS S ON S.BOOK_ID = B.BOOK_ID
WHERE S.SALES_DATE LIKE '2022-01%'
GROUP BY B.AUTHOR_ID, B.CATEGORY
ORDER BY B.AUTHOR_ID, B.CATEGORY DESC