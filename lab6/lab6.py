import string


class TestClass:

    osChoice = ""

    def __init__(self, sys_choice):
        self.osChoice = sys_choice

    @staticmethod
    def choice(system: string):
        if system.upper() != "WINDOWS" or system.upper() != "LINUX":
            return system + "  is bad parameter, pick windows or linux"

    def name(self, os_name):
        os_name = os_name + self.osChoice
        return os_name

    def method(self):
        return self.name(1)


print(TestClass(1).method())

# {
#     'wartosc': 'parametr1',
#     'wartosc2': ['parametr2', 'parametr3'],
#     'ls':{
#         '-l': 'wyswietlanie szczegolowe',
#         '-la': 'asd asd'
#     }
# }