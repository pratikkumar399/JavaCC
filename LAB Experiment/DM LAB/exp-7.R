str(iris)
# Installing Packages
install.packages("ClusterR")
install.packages("cluster")
# Loading package
library(ClusterR)
library(cluster)
library(caret)

# Removing initial label of Species from original dataset
iris_data <- iris[, -5]
iris_data

# Fitting K-Means clustering Model to training dataset
set.seed(240) # Setting seed
km <- kmeans(iris_data, centers = 3, nstart = 20)
km

#Cluster identification for each observation
km$cluster
# Confusion Matrix
cm <- table(iris$Species, kmeans.re$cluster)
cm

# Model Evaluation and visualization
plot(iris_data[c("Sepal.Length", "Sepal.Width")])
plot(iris_data[c("Sepal.Length", "Sepal.Width")],col = km$cluster)
plot(iris_data[c("Sepal.Length", "Sepal.Width")],col = km$cluster,main = "K-means with 3 clusters")
## Plotting cluster centers
km$centers
km$centers[, c("Sepal.Length", "Sepal.Width")]
# cex is font size, pch is symbol
points(km$centers[, c("Sepal.Length", "Sepal.Width")],col = 1:3, pch = 8, cex = 3)
## Visualizing clusters
y_kmeans <- km$cluster
clusplot(iris_data[, c("Sepal.Length", "Sepal.Width")],
         y_kmeans,
         lines = 0,
         shade = TRUE,
         color = TRUE,
         labels = 2,
         plotchar = FALSE,
         span = TRUE,
         main = paste("Cluster iris"),
         xlab = 'Sepal.Length',
         ylab = 'Sepal.Width')

