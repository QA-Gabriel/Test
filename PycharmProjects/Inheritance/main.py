class parent(object):
    def breathe(self):
        print("Breathing")

class Child1(parent):
    def run(self):
        print("Running")

class Child2(parent):
    def walk(self):
        print("Walking!")

class Baby(Child2, parent):
    def cry(self):
        print("Crying")

Gab = Child1()
YoungGab = Baby()

print("Baby Does: ")
YoungGab.breathe()
YoungGab.cry()
YoungGab.walk()
print("\n")
print("Gabriel Does: ")
Gab.run()
Gab.breathe()

