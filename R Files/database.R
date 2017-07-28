#install.packages("RODBC")

#df <- read.csv("C:\\Users\\QAC\\Documents\\R\\train-titanic.csv")
require(RODBC)
dx <- odbcConnect("mysqldb", uid="root", pwd="root")
df <-  sqlQuery(dx, "SELECT * from table1")

print(df)