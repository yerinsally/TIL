-- 아이템 희귀도가 'RARE'인 아이템들의 다음 업그레이드 아이템
SELECT I.ITEM_ID, I.ITEM_NAME, I.RARITY
FROM ITEM_INFO AS I
JOIN ITEM_TREE AS T ON I.ITEM_ID=T.ITEM_ID
WHERE T.PARENT_ITEM_ID IN (SELECT ITEM_ID
                           FROM ITEM_INFO
                           WHERE RARITY = 'RARE'
)
ORDER BY I.ITEM_ID DESC