# chapter03_01
# special = magic 메소드
# 파이썬의 핵심 -> 시퀀스(Sequence), 반복(Iterator), 함수(Functions), 클래스(Class)
# 클래스 안에 정의할 수 있는 특별한(Built-in 되어있는) 메소드
# 좀 더 로우 레벨인 메소드를 의미하는것..

# 기본형
print(int)
print(float)

# 모든 속성 및 메소드 출력
print(dir(int))
print(dir(float))

n = 10

print(type(n))

print(n + 100)
print(n.__add__(100))
# print(n.__doc__)
print(n.__bool__(), bool(n))
print(n * 100)
print(n.__mul__(100))

print()
print()

# 클래스 예제1
class Fruit():
    def __init__(self, name, price):
        self._name = name
        self._price = price

    def __str__(self):
        return 'Fruit Class Info : {} , {}'.format(self._name, self._price)

    def __add__(self, x):
        print('called __add__')
        return self._price + x._price

    def __sub__(self, x):
        print('called __sub__')
        return self._price - x._price

    def __le__(self, x):
        if self._price <= x._price:
            return True
        else:
            return False
    def __ge__(self, x):
        if self._price > x._price:
            return True
        else:
            return False



# 인스턴스 생성
s1 = Fruit('Orange', 7500)
s2 = Fruit('Banna', 3000)

# 코드 양이 늘어나고 가독성이 떨어진다
# print(s1._price + s2._price)

print(s1 + s2)
print(s1 - s2)
print(s1 <= s2)
print(s1 >= s2)

print(dir(s1))  
print(s1.__dict__) #내용물
print(s1.__doc__)  #주석

print(s1)
print(s2)
