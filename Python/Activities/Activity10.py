#inp_val = input("enter 5 input values: ") #--> by default it will take list with strings as input
#num_list = inp_val.split(",")             #--> here we are seperating string with ','
#num_tuple = tuple(num_list)               #--> since input is list we are converting into tuple

num_tuple = tuple(input("Enter 5 values: ").split(","))

print("Numbers divisible by 5 is : ")
for number in num_tuple:
    if int(number) % 5 == 0:
        print(number)