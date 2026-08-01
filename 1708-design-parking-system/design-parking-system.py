class ParkingSystem:

    def __init__(self, big: int, medium: int, small: int):
        self.bigC= big
        self.mediumC = medium
        self.smallC = small
    def addCar(self, carType: int) -> bool:
        if(carType == 1 and self.bigC>0):
            self.bigC -= 1
            return True

        elif(carType == 2 and self.mediumC>0):
            self.mediumC -= 1
            return True
        elif(carType == 3 and self.smallC>0):
            self.smallC -= 1
            return True   
        return False     


# Your ParkingSystem object will be instantiated and called as such:
# obj = ParkingSystem(big, medium, small)
# param_1 = obj.addCar(carType)