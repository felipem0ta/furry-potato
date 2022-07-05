from csv import reader

opened_file = open("/home/felipe/Workspace/furry-potato/Python/PrisonBreak (Begginer's Project)/datasets/AppleStore.csv")

read_file = reader(opened_file)
apps_data = list(read_file)

print(apps_data[:5])
print(len(apps_data))

rating_sum = 0
for row in apps_data[1:]:
    rating = row[7]
    rating_sum = rating_sum + float(rating)

avg_rating_sum = rating_sum/len(apps_data[1:])    

print(rating_sum)
print(avg_rating_sum)