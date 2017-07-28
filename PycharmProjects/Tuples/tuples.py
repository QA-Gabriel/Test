x = 0
String1 = "QA Consulting"
String2 = "Office for National Statistics"
vowels = ['a', 'e', 'u', 'i', 'o']

for x in range(len(String1)):
    if String1[x].lower() in vowels:
        print(String1[x])

x = 0
vowels = ['a', 'e', 'u', 'i', 'o', ' ']
print(" ")

for x in range(len(String2)):
    if String2[x].lower() not in vowels:
        print(String2[x])
