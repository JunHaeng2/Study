# chapter02_02.py
#

class Car():
    """
    Car class
    Author : Heo
    Date : 2022.02.05
    """

    # 클래스 변수 (모든 인스턴스가 공유한다)
    car_count = 0

    def __init__(self, company, details):
        # 인스턴스 변수
        # 인스턴스 변수를 만들때에도 self._company 이런식으로 해서 클래스 변수와
        # 구분지어주는게 좋음.. !
        self.company = company
        self.car_count = 10
        self.details = details
        self.car_count += 1

    # 매우 중요함, 사용자 입장의 출력을 원할때 사용하는것 (사용자 레벨)
    def __str__(self):
        return 'str : {} - {}'.format(self.company, self.details)

    # 자료형의 객체를 인식할수있는 공식적인 입장..? (개발자 레벨)
    def __repr__(self):
        return 'str : {} - {}'.format(self.company, self.details)

    def __del__(self):
        Car.car_count -= 1

    def detail_info(self):
        print('Current ID : {}'.format(id(self)))
        print('Car Detail Info : {} {}'.format(self.company, self.details.get('price')))

# self의 의미
# 각자 고유의 id 값을 가지고 있음 self가 있어야 클래스는 하나지만, 각자 아이디에 맞는
# 값을 개별적으로 저장하고 관리할수 있다는 말.

car1 = Car('Ferrai', {'color' : 'White', 'horespower' : 400, 'price' : 8000})
car2 = Car('BMW', {'color' : 'Black', 'horespower' : 400, 'price' : 8000})
car3 = Car('Audi', {'color' : 'Silver', 'horespower' : 400, 'price' : 8000})

# ID 확인
print(id(car1))
print(id(car2))
print(id(car3))

print(car1.company == car2.company)
print(car1 is car2)

# dir & __dict__
print(dir(car1))
print(dir(car2))

print()
print()

# dir로 접근하면 상위 오버라이딩 된 부분도 다 보여주고, __dict__경우는 안에 있는 정보를 다 보여줌
print(car1.__dict__)
print(car2.__dict__)

# Doctring => 내부에 들어있는 주석파일을 확인할수있음.
print(Car.__doc__)
print()

car1.detail_info()
car2.detail_info()

print(car1.__class__, car2.__class__)
# 클래스 자체의 id 값을 본거기 때문에 같은 id 값이 나오는거임
print(id(car1.__class__), id(car2.__class__))

# 클래서 접근할 경우에는 self에 명시적으로 보고싶은 인자를 전달해주어야 한다.
Car.detail_info(car1)
Car.detail_info(car2)

# 공유 확인
print(car1.__dict__)
print(car2.__dict__)
print(car1.car_count)
print(car2.car_count)
print(dir(car1))

# 접근
print(car1.car_count)
print(Car.car_count)

del car2
# 삭제 확인
print(Car.car_count)

# 인스턴스 네임스페이스에 없으면 상위에서 자동으로 검색
# 즉, 동일한 이름으로 변수 생성 가능(인스턴스 검색 후 -> 클래스 변수 검색)
print(car1.car_count)
print(Car.car_count)
