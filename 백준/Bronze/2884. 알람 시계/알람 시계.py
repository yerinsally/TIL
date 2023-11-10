H, M = map(int, input().split())
if H == 0:
    hour = (12*60 + M-45)//60
    min = (12*60 + M-45)%60
    if M >= 45:
        print(hour - 12, min)
    elif M < 45:
        print(hour + 12, min)
    elif hour == 12 and min == 0:
        print(23, 59)
elif H > 12:
    print(((H-12)*60 + M-45)//60 + 12, ((H-12)*60 + M-45)%60)
elif H <= 12:
    print((H*60 + M-45)//60, (H*60 + M-45)%60)