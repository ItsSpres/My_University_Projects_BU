# Ian Spresney
# Module 6 Assignment Redo
# 10/03/2023
 

pcHardware = {
        "CPU": "9700K",
        "GPU": "RTX 4070",
        "CPUSpeed": "5.0Ghz",
        "MonitorRes": "1440p",
        "MemorySpeed": "3200MHz",
        "StorageSizeHDD": "4TB",
        "StorageSizeSSD": "1TB",
        "NumberOfFans": 8,
        "PSURatedWattage": 750,
        "CPUCoolerStyle": "Water",
    }

def main():
    print("Welcome to the PC Hardware!")
    print("Here are some of the items you may view.")
    for hardware in pcHardware:
        print("- " + hardware)
    getAndDisplayHardware()


def getAndDisplayHardware():
    selected_item = input("Select an item to view more about it: ")

    if selected_item in pcHardware:
        detail = pcHardware[selected_item]
        print(f"{selected_item} is/are: {detail}")
        continueOrEnd()
    else:
        print("Sorry, that item is not in our dictionary.")
        continueOrEnd()


def continueOrEnd():
    userInput = input("Do you wish to search again? (y or n): ")
    while True:
        match userInput:
            case "y":
                print("Restarting...")
                main()
                break
            case "n":
                print("...the program has ended...")
                break
            case default:
                print("...your input was invalid...")
                print("Program ended...")
                break

#Program Start
main()