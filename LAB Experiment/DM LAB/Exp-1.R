getwd()

name<-c('Nabha','Nikhil','Yash','DJ','Arsh')
height<-c(180,175,177,172,169)
city<-c('Delhi','Garhwal','Jaipur','Guhawati','Chandigarh')
avg_sleep_hour<-c(20,21,23,24,25)
Data<-data.frame(rating,name,height,city,avg_sleep_hour)
print(Data)

library(RWeka)
library(rJava)
write.arff(Data,file="Data.arff")
getwd()

