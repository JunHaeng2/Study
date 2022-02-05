class Car():
    """
    Car class
    Author : Heo
    Date : 2022.02.05
    Description : Class, Static, Instance Method
    """

    # 클래스 변수 (모든 인스턴스가 공유한다)
    price_per_raise = 1.0

    def __init__(self, company, details):
        self.company = company
        self.details = details

    # 매우 중요함, 사용자 입장의 출력을 원할때 사용하는것 (사용자 레벨)
    def __str__(self):
        return 'str : {} - {}'.format(self.company, self.details)

    # 자료형의 객체를 인식할수있는 공식적인 입장..? (개발자 레벨)
    def __repr__(self):
        return 'str : {} - {}'.format(self.company, self.details)

    # Instance Method
    # self : 객체의 고유한 속성 값을 사용한다.
    def detail_info(self):
        print('Current ID : {}'.format(id(self)))
        print('Car Detail Info : {} {}'.format(self.company, self.details.get('price')))

    # Instance Method
    def get_price(self):
        return 'Before Car Price -> company {}, price {}'.format(self.company, self.details.get('price'))

    # Instance Method
    def get_price_calc(self):
        return 'After Car Price -> company {}, price {}'.format(self.company, self.details.get('price') * Car.price_per_raise)

    # class Method
    @classmethod
    def raise_price(cls, per):
        if per <= 1:
            print('Please Enter 1 or More')
            return
        cls.price_per_raise = per
        print('Succeed! price increased.')

    # Static Method
    @staticmethod
    # 인스턴스는 self, 틀래스는 cls, 정적은 아무것도
    def is_bmw(inst):
        if inst.company == 'BMW':
            return 'OK! This car is {}'.format(inst.company)
        return 'Sorry This car is not BMW'


# self의 의미
# 각자 고유의 id 값을 가지고 있음 self가 있어야 클래스는 하나지만, 각자 아이디에 맞는
# 값을 개별적으로 저장하고 관리할수 있다는 말.

car1 = Car('Ferrai', {'color' : 'White', 'horespower' : 400, 'price' : 8000})
car2 = Car('BMW', {'color' : 'Black', 'horespower' : 270, 'price' : 5000})

# 전체정보
print(car1.detail_info)
print(car2.detail_info)

# 가격정보(직접접근)
print(car1.details.get('price'))
print(car2.details['price'])

# 가격정보(인상 전)
print(car1.get_price())
print(car2.get_price())

# 가격정보(클래스 메소드 미사용) / 직접접근해서 수정하는건 바람직하지 않다.
Car.price_per_raise = 1.4

# 가격정보(인상 후)
print(car1.get_price_calc())
print(car2.get_price_calc())

Car.raise_price(1.8)
print(car1.get_price_calc())
print(car2.get_price_calc())

print(car1.is_bmw(car1))
print(car2.is_bmw(car2))

# 당연히 이럴수밖에 없는게, self 나 cls 둘다 인자를 안받기 때문에
# 이런식으로 유연하게 호출해도 상관이 없음.
print(Car.is_bmw(car1))
