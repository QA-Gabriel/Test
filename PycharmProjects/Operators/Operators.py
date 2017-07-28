class ONE:

    def __int__(self, a, b, c):

        self.A=a
        self.B=b
        self.C=c

    def __add__(self, R):
        C = ONE()
        C.A = self.A +R.A
        C.B = self.B + R.B
        C.C = self.C + R.C

    def __sub__(self, R):
        C=ONE()
        C.A = self.A - R.A
        C.B = self.B  - R.B
        C.C = self.C - R.C

    def __mult__(self, R):
        C = ONE()
        C.A = self.A * R.A
        C.B = self.B * R.B
        C.C = self.C * R.C

    def __div__(self, R):
        C = ONE()
        C.A = self.A / R.A
        C.B = self.B / R.B
        C.C = self.C / R.C

    def __str__(self):
        C = ONE()
        return (C.A + " " +  C.B +" " + C.C)


