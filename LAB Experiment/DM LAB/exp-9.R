# Generate random IQ values with mean = 30 and sd =2
IQ <- rnorm(40, 30, 2)

# Sorting IQ level in ascending order
IQ <- sort(IQ)
IQ

# Generate vector with pass and fail values of 40 students
result <- c(0, 0, 0, 1, 0, 0, 0, 0, 0, 1,
            1, 0, 0, 0, 1, 1, 0, 0, 1, 0,
            0, 0, 1, 0, 0, 1, 1, 0, 1, 1,
            1, 1, 1, 0, 1, 1, 1, 1, 0, 1)

# Data Frame
df <- as.data.frame(cbind(IQ, result))

# Print data frame
print(df)

# Plotting IQ on x-axis and result on y-axis
plot(IQ, result, xlab = "IQ Level",ylab = "Probability of Passing")


#Linear regression
lrm <- lm(result ~ IQ)

summary(lrm)
#find the result of a person with IQ 35
a<-data.frame(IQ=35)
predRes<-predict(lrm,a)
print(predRes)

# Create a logistic model
lgm = glm(result~IQ, family=binomial, df)
# Summary of the regression model
summary(lgm)

# Create a curve based on prediction using the regression model
curve(predict(lgm, data.frame(IQ=x), type="resp"), add=TRUE)



