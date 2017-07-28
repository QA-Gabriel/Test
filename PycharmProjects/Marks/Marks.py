class Results:
    def __init__(self, p = 0, m = 0, c = 0):
        self.__phy=p
        self.__mat=m
        self.__chem=c

    def physics(self, p):
        if (p >= 0 and p<=150):
            self.__phy = p
        else:
            print("Invalid Physics Marks")

    def maths(self, m):
        if (m >= 0 and m <= 150):
            self.__mat = m
        else:
            print("Invalid Maths Marks")

    def chemistry(self, c):
        if (c >= 0 and c <= 150):
            self.__chem = c
        else:
            print("Invalid Chemistry Marks")

    def calculations(self):
        self.total = (self.__phy +  self.__mat + self.__chem)
        #self.per = ("Physics: %d \nMaths: %d \nChemistry: %d" %((int(self.__phy)/1.5) (int(self.__mat)/1.5) (int(self.__chem)/1.5)) )
        
    def showResults(self):
        print("Total: %d" % (self.total))
        print(self.per)

    def passMark(self):
        passmark = 100
        examfail = 0
        if (self.__phy < passmark):
            examfail = examfail + 1
        if (self.__chem < passmark):
            examfail = examfail + 1
        if (self.__mat < passmark):
            examfail = examfail + 1

        if (examfail == 1):
            print("Retake Exam")
        elif (examfail == 2):
            print("Retake Course")
        elif (examfail == 3):
            print("You Suck")
        else:
            print("Well Done, You've Passed All 3")

Peter = Results()
Peter.physics(120)
Peter.chemistry(102)
Peter.maths(112)
Peter.calculations()
Peter.showResults()
Peter.passMark()



