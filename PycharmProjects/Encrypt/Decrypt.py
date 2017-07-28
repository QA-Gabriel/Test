file = open("ENC.txt", "r")
a = file.read()

#print (a)
for i in range(0, len(a)):
    let = (ord(a[i]))
    let = let - len(a)
    b =(chr(let))
    print (b,sep=" ", end="", flush=True)

#file.close()
#a = open("ABC.txt", "r")
#b = a.read()
#y = [0] * len(b)
#for i in range(0, len(b)):
#    asc = (ord(b[i]))
 #   asc = asc + len(b)
  #  y[i] = (chr(asc))
#y = " ".join(y)
#f = open("ENC.txt", "w")
#f.write(str(y))
#print(y)
