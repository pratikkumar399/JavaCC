# Structure
str(iris)
#Performing Naive Bayes on Dataset
#Using Naive Bayes algorithm on the dataset which includes 11 persons and 6 variables or attributes
# Installing Packages
install.packages("e1071")
install.packages("caTools")
install.packages("caret")
# Loading package
library(e1071)
library(caTools)
library(caret)

iris_data = iris
str(iris_data)
summary(iris_data)
# Splitting data into train and test data
spl = sample.split(iris_data, SplitRatio = 0.7)
dataTrain = subset(iris_data, spl==TRUE)
dataTest = subset(iris_data, spl==FALSE)
dataTrain
dataTest
# Feature Scaling
train_scale <- scale(dataTrain[, 1:4])
test_scale <- scale(dataTest[, 1:4])
# Fitting Naive Bayes Model to training dataset
#set.seed(120) # Setting Seed
classifier_cl <- naiveBayes(Species ~ ., data = dataTrain)
classifier_cl
# Predicting on test data'
y_pred <- predict(classifier_cl, newdata = dataTest)
# Confusion Matrix
cm <- table(dataTest$Species, y_pred)
cm
# Model Evaluation
confusionMatrix(cm)
