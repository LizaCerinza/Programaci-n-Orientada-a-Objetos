from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola mundo")
    car = Car("LKM235", Account("Ana Perez","124345"))
    print(vars(car))
    print(vars(car.driver))

   