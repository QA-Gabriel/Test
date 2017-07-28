var num = 4583

def Convert(num: Int){

if (num >=999){
	var n1 = (num / 1000)
	Units(n1)
	print(" Thousand")
}

}


def Units(num: Int){

num match {
	case 1 => print("One")
	case 2 => print("Two")
	case 3 => print("Three")
	case 4 => print("Four")
	case 5 => print("Five")
	case 6 => print("Six")
	case 7 => print("Seven")
	case 8 => print("Eight")
	case 9 => print("Nine")
	case 10 => print("Ten")
	case 11 => print("Eleven")
	case 12 => print("Twelve")
	case 13 => print("Thirteen")
	case 14 => print("Fourteen")
	case 15 => print("Fifteen")
	case 16 => print("Sixteen")
	case 17 => print("Seventeen")
	case 18 => print("Eighteen")
	case 19 => print("Nineteen")
	}
}

Convert(num)


