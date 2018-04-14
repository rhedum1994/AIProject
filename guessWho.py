print("Hello and welcome to the marvelous game of Guess Who!")
print("Choose a character from the list I give you, and I'll try to guess what character you picked by asking you a series of questions about them.")

print("Do you wish to continue? y or n?")
val = raw_input()
if val == "y":
    print("")
    print("Lets play! Enter 'q' to quit")
    print("Pick any character from this list:")
    print("Jill, Sean, Becky, Tom, Caroline, Curtis, Steph")
    print("")
    while True:
        print("Jill: female, red hair, brown eyes, green shirt")
        print("Sean: male, red hair, green eyes, green shirt")
        print("Becky: female, brown hair, brown eyes, blue shirt")
        print("Tom: male, brown hair, green eyes, blue shirt")
        print("Caroline: female, blonde hair, blue eyes, blue shirt")
        print("Curtis: male, brown hair, blue eyes, red shirt")
        print("Steph: female, brown hair, brown eyes, red shirt")
        value = raw_input()
        if value == "q":
            print("aight. bye")
            break
        print("You typed: ", value)

else:
    print("aight. bye")


