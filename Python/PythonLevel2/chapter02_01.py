#chapter02_01

# 절차지향 vs 객체지향
# 객체 지향 프로그래밍 장점
# 클래스 기반 코딩 실습

# 객체 지향 프로그래밍(OOP) -> 코드의 재사용, 코드 중복 방지, 유지보수 쉬움
# 규모가 큰 프로젝트(프로그램) -> 함수 중심으로 코딩이 되어있었음.
# 함수중심 -> 데이터 방대 -> 개선이 어려움..
# 그렇기 때문에 코드의 재사용과 코드 중복을 방지하기 위해서는 객체 지향 프로그래밍
# 을 이용하는게 장점이 되었음. class 중심으로
# class 중심 -> 데이터 중심 -> 객체로 관리
# 프로그래밍의 규모에 따라서 결정하는게 좋음..

# 일반적인 코딩
# 차량1
car_company_1 = 'Ferrai'
car_detail_1 = [
    {'color' : 'White'},
    {'horespower' : 400},
    {'price' : 8000}
]

# 차량2
car_company_2 = 'BMW'
car_detail_2 = [
    {'color' : 'Black'},
    {'horespower' : 270},
    {'price' : 5000}
]

# 절차지향의 경우에는 이렇게 예시가 늘어갈때마다 코딩 자체의 길이도 늘어남.

# 리스트 구조
# 관리하기가 불편
# 인덱스 접근시 실수 발생 가능성, 삭제 및 추가 불편하다. (인덱스 번호를 알아야 하기에)
car_company_list = ['Ferrai', 'BMW', 'Audi']
car_detail_list = [
        {'color' : 'White', 'horespower' : 400, 'price' : 8000},
        {'color' : 'Black', 'horespower' : 270, 'price' : 5000},
        {'color' : 'Silver', 'horespower' : 100, 'price' : 4000}
]

del car_detail_list[1]
del car_company_list[1]
print(car_company_list)
print(car_detail_list)

print()
print()


# 딕셔너리 구조
# 코드 반복 지속, 중첩 문제가 있음(key 중복 허용 X), 키 조회 예외 처리 등

car_dicts = [
    {'car_company' : 'Ferrai', 'car_detail' : {'color' : 'White', 'horespower' : 400, 'price' : 8000}},
    {'car_company' : 'BMW', 'car_detail' : {'color' : 'Black', 'horespower' : 400, 'price' : 5000}},
    {'car_company' : 'Audi', 'car_detail' : {'color' : 'Silver', 'horespower' : 400, 'price' : 4000}}
]

print(car_dicts[1]['car_company'])

print()
print()

# 클래스 구조
# 구조 설계 후 재사용성 증가, 코드 반복 최소화, 메소드를 활용
# 복잡하고 규모있는 코딩의 경우 클래스 사용이 좋음

class Car():
    def __init__(self, company, details):
        self.company = company
        self.details = details

    # 매우 중요함, 사용자 입장의 출력을 원할때 사용하는것 (사용자 레벨)
    def __str__(self):
        return 'str : {} - {}'.format(self.company, self.details)

    # 자료형의 객체를 인식할수있는 공식적인 입장..? (개발자 레벨)
    def __repr__(self):
        return 'str : {} - {}'.format(self.company, self.details)

car1 = Car('Ferrai', {'color' : 'White', 'horespower' : 400, 'price' : 8000})
car2 = Car('BMW', {'color' : 'Black', 'horespower' : 400, 'price' : 8000})
car3 = Car('Audi', {'color' : 'Silver', 'horespower' : 400, 'price' : 8000})


print(car1)
print(car2)
print(car3)

# car1에 들어있는 내부 속성들을 한번에 볼수있다.
print(car1.__dict__)

print(dir(car1))

print()
print()

# 리스트 선언
car_list = []
car_list.append(car1)
car_list.append(car2)
car_list.append(car3)

print(car_list)

print()
print()

# 반복(__repr__, __str__) 
for x in car_list:
    print(repr(x))
