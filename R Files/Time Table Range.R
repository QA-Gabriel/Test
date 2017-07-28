num <- as.numeric(readline("Time Table?:  "))
range <- as.numeric(readline("Range: "))

for (a in 1:range){
  a<-sprintf("%i x %i = %i" , num, a, (a*num))
  print(a)
  }

 
from <- as.numeric(readline("From: "))
to <- as.numeric(readline("To: "))

for 