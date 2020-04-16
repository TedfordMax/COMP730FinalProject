def user_interface():
    menu_list = {
        "MENU": print_menu, "TEST": test_1, "OPTIONS": options,
        "ALL": call_all, "LOOP": [print_menu, test_1, options]
        }
    print("Please choose an operation:")
    print("MENU")
    run_program = True
    while run_program is True:
        user_response = input("Input: ")
        if user_response.upper() in menu_list:
            if type(menu_list[user_response.upper()]) is list:
                for to_do in menu_list[user_response.upper()]:
                    to_do()
            else:
                menu_list[user_response.upper()]()
        elif user_response.upper() in ["EXIT", "QUIT"]:
            print("Goodbye.")
            run_program = False
        else:
            print("Not a valid command.")


def print_menu():
    print("print_menu()")


def test_1():
    print("test_1()")


def options():
    print("options()")


def call_all():
    print("call_all()")
    print_menu()
    test_1()
    options()


user_interface()
