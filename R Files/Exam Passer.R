
maths<-readline("Maths Score: ")
chem<-readline("Chemistry Score: ")
physics<-readline("Physics Score: ")

a <-0

if (maths < 60) 
  a <- a+1
if (chem < 60)
  a <- a+1
if (physics < 60)
  a <- a+1
  
 
if (a == 1)
  print("Retake Exam") else 
    if (a == 2) print ("Retake course") else 
      if (a == 3) print("Go Home") else
        print ("Well Done")