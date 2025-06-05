-- 조회수가 가장 높은 게시물은 하나만 존재 : 먼저 최다 조회수 BOARD_ID만 추출
SELECT CONCAT('/home/grep/src/', BOARD_ID, '/', FILE_ID, FILE_NAME, FILE_EXT) AS FILE_PATH
FROM USED_GOODS_FILE
WHERE BOARD_ID = (SELECT BOARD_ID
                  FROM USED_GOODS_BOARD
                  ORDER BY VIEWS DESC
                  LIMIT 1)
ORDER BY FILE_ID DESC