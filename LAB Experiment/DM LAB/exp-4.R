library("arules")
library("arulesViz")
install.packages("fim4r")
data("Mushroom")
print(Mushroom)
summary(Mushroom)

fprules <- fim4r(Mushroom,method = "fpgrowth",target="rules",supp=70,conf=60)

fprules()

inspect(fprules[1:5])

plot(fprules)

x<-as(fprules,"data.frame")
print(x)

write.csv(x,file="mushroomrules.csv")