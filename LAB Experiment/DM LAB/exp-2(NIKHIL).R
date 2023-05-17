library("RWeka")

M = read.arff("Data.arff")
print(M)

print(head(M,2))
print(tail(M,2))

dim(M)

names(M)

M["name"]

max(M["avg_sleep_hour"])

min(avg_sleep_hour)

sum(avg_sleep_hour)

mean(avg_sleep_hour)

median(sort(avg_sleep_hour))

sd(avg_sleep_hour)

summary(M)