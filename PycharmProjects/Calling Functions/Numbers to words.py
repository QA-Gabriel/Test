def main():
    num = int(input("Enter Number: "))
    numConverter(num)

def numConverter(num):
    if (num >= 1000):
        print(units(int(num/1000)) + " Thousand")
        num = (num/100 % 10) * 100
    if (num >= 100):
        print(units(int(num/100)) + " Hundred")
        num = num - ((num/100) * 100)
    if (num >=20):
        print(tens(int(num/10) * 10))
        num = num %10
    if (num<20):
        print(units(num))

def units(num):
   X = {0:"", 1:"One", 2:"Two", 3:"Three", 4:"Four", 5:"Five", 6:"Six", 7:"Seven", 8:"Eight", 9:"Nine", 10: "Ten", 11:"Eleven", 12:"Twelve", 13:"Thirteen", 14:"Fourteen", 15:"Fifteen", 16:"Sixteen", 17:"Seventeen", 18:"Eighteen", 19:"Nineteen"}
   for b in X:
       if num==b:
        unit = (X[num])
        return unit

def tens(num):
    Y = {20: "Twenty", 30: "Thirty", 40: "Fourty", 50: "Fifty", 60: "Sixty", 70: "Seventy", 80: "Eighty", 90: "Ninety"}
    for b in Y:
       if num == b:
        ten = (Y[num])
        return ten

main()
