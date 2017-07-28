class Results{

private var Phy:Int = 0

def Physics_=(A:Int){

	if (A>=0 & A<=150){
		Phy = A}
	else{
		println("Incorrect Score")
		}
}

def Physics:Int={
	return Phy
}
}

var Total:Int = 0
var Peter = new Results()
Peter.Physics = 70
Total = Peter.Physics + 100


println(Total)
	

