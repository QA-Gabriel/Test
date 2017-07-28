var phy = 59
var chem = 70
var maths = 70
var pass = 0

var total = phy + chem + maths
var per = total/3

total = phy + chem + maths

if (phy >= 60){
	pass = pass + 1
	println("You've Passed Physics")
}
if (chem >= 60){
	pass = pass + 1
	println("You've Passed Chemistry")
}
if (maths >= 60){
	pass = pass + 1
	println("You've Passed Maths")
}


println("Total: " + total)
print("Percentage: "+per+"%")