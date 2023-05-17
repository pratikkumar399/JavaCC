library(RWeka)
library(partykit)
library(caTools)

iris_data=iris
str(iris_data)
summary(iris_data)
spl=sample.split(iris_data,SplitRatio = 0.7)

dataTrain=subset(iris_data,spl==TRUE)
dataTest=subset(iris_data,spl==FALSE)
m1<-J48 (Species~.,dataTrain)

dataTestPred<- predict(m1,newdata=dataTest)
table_matrix<- table(dataTest$Species,dataTestPred)
print(table_matrix)

accuracy_test <- sum(diag(table_matrix))/sum(table_matrix)
cat("Test Accuracy is",accuracy_test)
pdf("Iris_decision_plot.pdf",paper = "a4")

plot(m1,type="simple")

dev.off()
