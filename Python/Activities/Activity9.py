list1 = [2,5,7,9,6]
list2 = [1,5,9,6]

list3 =[]

for num in list1 :
    if num % 2 != 0:
        list3.append(num)

for num in list2 :
    if num % 2 == 0:
        list3.append(num)

print("Values in list 3 is :\n",list3)

