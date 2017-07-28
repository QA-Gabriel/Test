From = int(input("From: "))
To = int(input("To: "))
if From > To:
    for From in range (From, To-1, -1):
        for count in range (1,11):
            print("%d x %d = %d" %(From, count, (From * count)))
else:
    for From in range (From, To+1, +1):
        for count in range (1,11):
            print("%d x %d = %d" %(From, count, (From*count)))

