class Math(x:Int, y:Int){
	
	var A:Int = x
	var B:Int = y
	
	def show(){
		println("A: " +A)
		println("B: " +B)	
	}
}

var M = new Math (2,5)
M.show()
