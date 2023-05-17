getwd()

name<-c('Nikhil','Yash','DJ','Arsh')
country<-c("india","india","india","india")
city<-c('Garhwal','Jaipur','Guhawati','Chandigarh')
avg_sleep_hour<-c(21,23,24,25)
Data1<-data.frame(name,country,city,avg_sleep_hour)
print(Data)

library(RWeka)
library(rJava)
write.arff(Data1,file="Data1.arff")
getwd()

