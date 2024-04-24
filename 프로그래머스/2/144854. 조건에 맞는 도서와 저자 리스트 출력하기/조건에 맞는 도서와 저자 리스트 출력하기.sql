SELECT A.BOOK_ID, B.AUTHOR_NAME, DATE_FORMAT(A.PUBLISHED_DATE,'%Y-%m-%d') AS PUBLISHED_DATE
FROM BOOK AS A
LEFT JOIN AUTHOR AS B ON A.AUTHOR_ID=B.AUTHOR_ID
WHERE A.CATEGORY LIKE '경제'
ORDER BY PUBLISHED_DATE