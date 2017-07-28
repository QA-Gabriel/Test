msg = input("Enter Word: ")
F=open("NewFile.txt","w")
F.write(msg)
F.close()
F=open("NewFile.txt","r")
a = F.read()
replace = input("Replace?: ")

for chr in a:
    if replace == chr:
        print (replace)




