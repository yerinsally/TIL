SELECT A.ITEM_ID, A.ITEM_NAME, A.RARITY
FROM ITEM_INFO AS A
LEFT OUTER JOIN ITEM_TREE AS B ON A.ITEM_ID=B.PARENT_ITEM_ID
WHERE B.PARENT_ITEM_ID IS NULL
GROUP BY A.ITEM_ID
ORDER BY A.ITEM_ID DESC