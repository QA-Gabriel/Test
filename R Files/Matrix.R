Physics <-  c(95,30,93)
chemistry <- c(42,64,42)
Maths <- c(72,71,93)

Results <- cbind(Physics, chemistry, Maths)
colnames(Results) <- c("Physics","Chemistry","Maths")
rownames(Results) <- c("Shafeeq","Peter","Smith")

#print(Results["Shafeeq", "Chemistry"])

#print(sum(Results["Shafeeq", ]))
#print(Results)

Result <- function(x){
  r<-sum(x)
  print(sum(x)/3)
  p<- r * 100/300
  if(p>60){print("Pass")}else{
    print("Fail")
  }
}



#apply(Results,1,Result)


matrixa <- c("A","B")
matrixb <- c("C","D")

matrix1 <- rbind(matrixa,matrixb)


matrixc <- c(1,2)
matrixd <- c(3,4)

matrix2 <- rbind(matrixc,matrixd)

#print(matrix1)
#print(matrix2)

join <- function(x){
  r <- rbind(matrix2[]) 
  print (r) 
}

apply(matrix1,1,join)

