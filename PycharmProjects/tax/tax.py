Grade=0
CTO = input("CTO? - Y or N: ")
Salary = input("Enter Salary: ")
if CTO!="Y":
    Grade = input("Enter Grade: ")
Dept = input("Enter Department: ")

G = int(Grade)
S = int(Salary)

if S > 15000:
    if CTO == ("Y"):
        S = S * 1.05
    else:
        if Dept==("IT"):
            if G <= 10 & G >=1:
                S = (S * 0.91) * 1.05
            elif G >= 11 & G <=20:
                S = (S * 0.85) * 1.05
        elif Dept==("HR"):
            if G <= 10:
                S = S * 0.91
            elif G >= 11 & G >= 20:
                S = S * 0.83
            else: S = S * 0.98

print ("Dept: %s | Grade: %s | Salary: %d  " %(Dept, Grade, S))


