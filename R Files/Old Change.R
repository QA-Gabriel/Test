bill <- 22.54
amount <- 30

fifty <-  0
twenty <- 0 
ten <- 0 
five <- 0
two <- 0 
one <- 0 
fiftyp <-  0
twentyp <- 0 
tenp <- 0 
fivep <- 0
twop <- 0 
onep <- 0 

change <- amount - bill

if (change >=  50){
  n = floor(change/50)
  for (i in 1:n){
  fifty <- fifty + 1}
  change <- (change %% 50)
}
if (change >= 20){
  n = floor(change/20)
  for (i in 1:n){
  twenty <- twenty + 1}
  change <- (change %% 20)
}
if (change >= 10){
  ten <- ten + 1
  change <- (change %% 10)
}
if (change >= 5){
  five <- five + 1
  change <- (change %% 5)
}
if (change >= 2){
  n = floor(change/2)
  for (i in 1:n){
  two <- two + 1}
  change <- (change %% 2)
}
if (change >= 1){
  one <- one + 1
  change <- (change %% 1)
}
if (change >= .5){
  fiftyp <- fiftyp + 1
  change <- (change %% .5)
}
if (change >= .2){
  n = floor(change/.2)
  for (i in 1:n){
  twentyp <- twentyp + 1}
  change <- (change %% .2)
}
if (change >= .1){
  tenp <- tenp + 1
  change <- (change %% .1)
}
if (change >= .05){
  fivep <- fivep + 1
  change <- (change %% .05)
} 

if (change > 0){

  onep <- onep + 1
  
}

print(sprintf("Five: %i", five))
print(sprintf("Two: %i",two))
print(sprintf("One: %i:",one))
print(sprintf("Fifty Pence: %i", fiftyp))
print(sprintf("Twenty Pence: %i", twentyp))
print(sprintf("Ten Pence: %i", tenp))
print(sprintf("Five Pence: %i", fivep))
print(sprintf("Two Pence: %i", twop))
print(sprintf("One Pence: %i", onep))

