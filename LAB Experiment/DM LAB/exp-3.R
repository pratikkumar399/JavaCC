library("arules")
library("arulesViz")
library("RColorBrewer")

data("Groceries")

rules <- apriori(Groceries,parameter=list(supp=0.01,conf=0.3))
inspect(rules[1:10])
 arules::itemFrequencyPlot(Groceries,topN=15,
                       col=brewer.pal(8,'Pastel2'),
                       main='Relative Item Frequency Plot',
                       type="relative",
                       ylab="Item frequency(Relative)")
 
 