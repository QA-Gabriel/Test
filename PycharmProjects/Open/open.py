F = open("ABC.txt", "w")
F.write("Hello My Friends")
F.close()

r = open("ABC.txt", "r")
read = r.read()
print(read)
