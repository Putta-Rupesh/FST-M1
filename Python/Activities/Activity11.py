fruit_market = {
    "apple": 40,
    "grape": 30,
    "pineapple": 60,
    "mango": 80
}

user_input = input("enter the fruit your looking : ").lower()

if user_input in fruit_market:
    print(user_input +" is available")
else:
    print(user_input +" is not available")
