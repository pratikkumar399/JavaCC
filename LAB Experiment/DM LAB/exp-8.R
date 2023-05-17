# Load required packages

library(datasets) # contains iris dataset
library(cluster)  # clustering algorithms
install.packages("factoextra")
library(factoextra) # visualization
install.packages("purrr")
library(purrr) # to use map_dbl() function

# Load and preprocess the dataset

df<- iris[, 1:4]
df<- na.omit(df)
df<- scale(df)
# Dissimilarity matrix
d <- dist(df, method="euclidean")
d
hc1 <- hclust(d, method = "complete")
plot(hc1, cex = 0.6, hang=-1)
sub_grps<- cutree(hc1, k=3)
fviz_cluster(list(data = df, cluster = sub_grps))

plot(hc1, cex = 0.6, hang=-1)
rect.hclust(hc1, k = 3, border=2:4)

