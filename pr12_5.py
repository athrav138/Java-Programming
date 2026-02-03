dict1 = {"Google" : 14235 , "Facebook" : 22435, "Microsoft" :2433,"Adobe":45325}

print(dict1)
count = 0
for values in sorted(dict1.values(),reverse=True):
    if count==3 :
        break
    print(values)
    count += 1

asc = sorted(dict1.items(),reverse=True)
print(asc[:3])

