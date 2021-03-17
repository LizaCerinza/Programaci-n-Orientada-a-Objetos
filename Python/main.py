from car import Car
if __name__ == "__main__":
    print("Hola mundo")
    car = Car()
    car.license = "LKM235"
    car.driver = "Ana Perez"
    print(vars(car))

    car1 = Car()
    car1.license = "LFD474"
    car1.driver = "Pedro Perez"
    print(vars(car1))