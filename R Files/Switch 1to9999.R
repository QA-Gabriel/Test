
num <- 3

belowTwenty<- function(a){
  switch(a, "1" = "One","2" = "Two", "3" = "Three","4" = "Four","5" = "Five","6" = "Six","7" = "Seven","8" = "Eight","9" = "Nine","10" = "Ten","11" = "Eleven","12" = "Twelve","13" = "Thirteen","14" = "Fourteen","15" = "Fifteen","16" = "Sixteen","17" = "Seventeen","18" = "Eighteen", "19" = "Nineteen")}

tens <- function(a){
  a <- a-1
  switch(a, "Twenty", "Thirty","Fourty","Fifty", "Sixty", "Seventy", "Eighty", "Ninety")
}

if (num >= 1000){
  print(sprintf("%s Thousand", belowTwenty(as.integer(num/1000))))
  num <- num - (as.integer(num/1000) * 1000)
  }
  if (num >= 100){
    print(sprintf("%s Hundred", belowTwenty(as.integer(num/100))))
    num <- num - (as.integer(num/100) * 100)}
    if (num >=20){
      print(tens(num/10))
      num <- num - (as.integer(num/10) * 10)}
      if (num<20){
        print(belowTwenty(num))
      }
    