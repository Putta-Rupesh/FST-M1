import pandas as pd

# create dataset
data ={
    "Usernames": ["admin", "Charles", "Deku"],
    "Passwords": ["password", "Charl13", "AllMight"]
    }

#convert dataset into dataframe or table
df=pd.DataFrame(data)

# Write the dataframe into csv.file
# df.to_csv("./Activities/sample.csv")       # . --> represents current file,, .. --> reperesents parent folder
#df.to_csv("C:\Users\004PA4744\Desktop\FST\FST Python\sample.csv")
df.to_csv("./Activities/sample.csv", index=False)  # index =false --> don't give row numbers

# to Read the data
input_data = pd.read_csv("./Activities/sample.csv")

# to print only user names
print(input_data["Usernames"])

# to print user name and passwords from 2nd row
print(input_data["Usernames"][1],input_data["Passwords"][1])

#Sort the Usernames column in ascending order
print("====================================")
print("Data sorted in ascending Usernames:")
#print(df.sort_values('Usernames'))
print(input_data.sort_values('Usernames'))
 
#Sort the Passwords column in descending order
print("====================================")
print("Data sorted in descending Passwords:")
print(df.sort_values('Passwords', ascending=False))


