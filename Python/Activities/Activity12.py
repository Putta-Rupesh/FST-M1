# Define function to calculate sum
def calculateSum(num):
  if num != 0:
    # Recursive function call
    return num + calculateSum(num-1)
  else:
    return 0

# Call calculateSum() function
res = calculateSum(15)

# Print result
print(res)