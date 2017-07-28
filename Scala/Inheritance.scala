class One{

	var A:Int = 95
	
	def Message(){
	println("Hello, My Friend")
	}
}
	
class Two extends One{

override def Message(){
	println("This is Class Two")
	}
}

var x:One = new One
x.Message()

var y:One = new Two
y.Message()

var z:One = new Two
z.Message()