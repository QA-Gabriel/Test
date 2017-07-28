#install.packages("ggplot2")
#install.packages('ggplot2', dep = TRUE)
#print(OrchardSprays)
library(ggplot2)
require("ggplot2")

a <-  ggplot(OrchardSprays, aes(treatment, decrease))
 a <- a + geom_jitter()+geom_boxplot()


print(a)

#b <- boxplot(a,aes(hwy))
