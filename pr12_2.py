dict1 = {
        "A":"adfgtharv",
        "D":"zaog",
        "C":"gat",
        "B":"Bhfgarat"
        }

print(dict1)
print(dict1.items())
print(dict1.keys())
print(dict1.values())
print(dict(sorted(dict1.items()))) # Ascending order sort by items or keys
print(dict(sorted(dict1.items(),reverse=True))) # Descending order sort by items or key
print(dict(sorted(dict1.items(), key=lambda item: item[1]))) # Ascending order sort by values
print(dict(sorted(dict1.items(), key=lambda item: item[1],reverse=True )))   # Descending order sort by values

