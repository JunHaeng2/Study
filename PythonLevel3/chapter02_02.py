"""
chapter02_02
keyowrd - access modifier(접근지정자), underscore

"""

"""
다양한 언더스코어 활용
파이썬 접근지정자 설명

"""

# Ex 1
# Use underscore
# 1. 인터프리터, 2. 값 무시, 네이밍(국제화, 자리수)

# Unpacking
x, _, y = (1, 2, 3)
print(x, y)

a, *i, b = (1, 2, 3, 4, 5)
print(a, b, i)

print('Ex1 > ', x, y, a, b)

for _ in range(10):
    pass

for _, val in enumerate(range(10)):
    print(val)

# Ex2
# 접근지정자 !
# name : public
# _name : protected # 자식클래스에서 활용하자는 암묵적인 약속
# __name : private
# 파이썬 -> Public 강제 x, 약속된 규약에 따라 고딩 장려(자유도, 책임감 장려)
# 타 클래스(클래스 변수, 인스턴스 변수 값 쓰기 장려 안함) -> Naming Mangling
# 타 클래스 __ 접근하지 않는 것이 원칙

# No use Property

class SampleA(object):
    def __init__(self):
        self.x = 0
        self.__y = 0
        self._z = 0

a = SampleA()

a.x = 1

print('Ex2 > x : {}'.format(a.x))
# print('Ex2 > y : {}'.format(a.__y))
print('Ex2 > z : {}'.format(a._z))

print('Ex2 > ', dir(a))

# 억지로 이렇게 변경은 가능하다. 약속된 규약이기 때문에 변경하지 말자는것.. !
a._SampleA__y = 2
print('Ex2 > y : {}'.format(a._SampleA__y))

# Ex3
# 직접접근하지 않고 값을 가져오던가 수정하는 메소드
# 메소드 활용 Getter, Setter

class SampleB(object):
    def __init__(self):
        self.x = 0
        self.__y = 0 # _SampleB__y
        self._z = 0

    def get_y(self):
        return self.__y

    def set_y(self, value):
        self.__y = value

b = SampleB()

b.x = 1
b.set_y(2)

print('Ex3 > x : {}'.format(b.x))
print('Ex3 > x : {}'.format(b.get_y()))

# 이런식으로 코딩하는 습관을 갖는게 좋다.
# 변수 접근 후 수정 부분에서 일관성 및 가독성이 하락
# b._SampleB__y = 10

print('Ex3 > ', dir(b))


class SampleC(object):
    def __init__(self):
        self.x = 0
        self.__y = 0
        self._z = 0

    def get_y(self):
        return self.__y

    def set_y(self, value):
        self.__y = value
        return self.__y

c = SampleC()

print(c.x, c.get_y(), c.set_y(10))
