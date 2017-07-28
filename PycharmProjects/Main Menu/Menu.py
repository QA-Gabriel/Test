import sys

def selectNumbers():
    no1 = int(input("Enter 1st Number: "))
    no2 = int(input("Enter 2nd Number: "))
    return no1, no2

def mainMenu():

    choice = int(input(" 1 - Addition \n 2 - Subtraction \n 3 - Division \n 4- Multiplication \n 5 - Times Table \n 6 - Quit \n Enter Choice: "))
    no1,no2 = selectNumbers()
    if choice == 1:
        print(addition(no1,no2))
        rep()
    elif choice == 2:
        print (subtraction(no1,no2))
    elif choice == 3:
        print (division(no1,no2))
    elif choice == 4:
        print (multiplication(no1,no2))
    elif choice == 5:
        print(timestable(no1,no2))
    elif choice == 6:
        quit()

def addition(no1,no2):
    ans = no1 + no2
    return ans

def subtraction(no1, no2):
    ans = no1 - no2
    return ans

def division(no1, no2):
    ans = no1 / no2
    return ans

def multiplication(no1, no2):
    ans =  no1 * no2
    return ans

def timestable(no1, no2):
    if no1 > no2:
        for no1 in range(no1, no2 - 1, -1):
            for count in range(1, 11):
                print("%d x %d = %d" % (no1, count, (no1 * count)))
    else:
        for no1 in range(no1, no2 + 1, +1):
            for count in range(1, 11):
                print("%d x %d = %d" % (no1, count, (no1 * count)))
def quit():
    exit()

def rep():
    a = input("Do you want to repeat the process? Y/N: ")
    if a ==("Y"):
        selectNumbers()



mainMenu()


