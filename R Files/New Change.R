
b = 0 
bill <- 22
amount <- 46
change <- amount - bill

pounds<- function(a){
  switch(a, 
         "50" = { b <<- b + 1}, "20" = { b <<- b + 1}, "10" = {b <<- b + 1}, "5" = {b <<- b + 1}, "2" = {b <<- b + 1}, "1" = {b <<- b + 1})
}

print (change)

if (change >= 50){
  num <- (change/50)
  cnum <- "50"
  for (i in 1:num){
    n <- pounds(cnum)}
  change <-
    b <<- 0
    print(n)
}
if (change >=20){
  num <- (change/20)
  cnum <-"20"
  for (i in 1:num){
    n <- pounds(cnum)}
    print(n)}
 

#print (num)

pennies <- function(a){
  switch(a, "50" = 0,"20" = 0, "10" = 0, "5" = 0 , "2" = 0, "1" = 0)
}

