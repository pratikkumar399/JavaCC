#creating the data containing 500 random values

data <- rnorm(500)
print(data)
#adding 10 random outliers to this data.
data[1:10] <- c(46,9,15,-90,42,50,-82,74,61,-32)

#draw boxpolot and an outlier is defined as a data point that is located outside the whiskers of the box plot.
boxplot(data)

#remove the outlier of the provided data boxplot.stats() function in R
data <- data[!data %in% boxplot.stats(data)$out]

#draw boxplot to verify whether ouliers removed or not
boxplot(data)
