result = 'play'
while True:
    input1 = input("Enter player1 choice : ").lower()
    input2 = input("Enter player2 choice : ").lower()
    if input1 == 'rock' and input2 == 'paper':
        print("player2 wins!!")
    elif input1 =='paper' and input2 =='rock':
        print("Player1 wins!!") 
    elif input1 =='sissor' and input2 =='paper':
        print("Player1 wins!!")
    elif input1 == input2:
        print("It's Draw")
    else:
        print("Enter valid options")
    user_input =input("Enter 'yes' if you want to play again : ").lower()
    if user_input == 'yes':
        pass
    else:
        break
print("Thanks for playing!!")


    
