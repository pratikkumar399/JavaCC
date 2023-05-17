library("RWeka")

N = read.arff("Data.arff")
print(N)

print(head(N,2))
print(tail(N,2))

dim(N)

names(N)

N["name"]

max(N["height"])

min(height)

sum(height)

mean(height)

median(sort(height))

sd(height)

summary(N)

attributes(N)
typeof("name")
