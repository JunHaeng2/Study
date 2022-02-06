# 클래스 예제2
# 벡터(x, y) (5, 2)
# (5, 2) + (4, 3) = (9, 5)
# (10, 3) * 5 = (50, 15)
# (0, 0) -> (0, 0)
# (5, 10) => max => 10

class Vector(object):

    def __init__(self, *args):
        """
        Create a vector, example : v = Vector(5, 10)
        """
        if len(args) == 0:
            self._x, self._y = 0, 0
        else:
            self._x, self._y = args

    def __repr__(self):
        """"Return the vector informations."""
        return 'Vector(%r, %r)' % (self._x, self._y)

    def __add__(self, other):
        """Return the vector addtion of self and other"""
        return Vector(self._x + other._x, self._y + other._y)

    def __mul__(self, y):
        return Vector(self._x * y, self._y * y)

    def __bool__(self):
        return bool(max(self._x, self._y))

# Vector 인스턴스 생성
v1 = Vector(5, 7)
v2 = Vector(23, 35)
v3 = Vector()

# 매직메소드 출력
print(Vector.__init__.__doc__) #내부까지 접근해야 이렇게 주석이 보인다.
print(Vector.__repr__.__doc__)
print(Vector.__add__.__doc__)
print(v1, v2, v3)
print(v1 + v2)
print(v1 * 3)
print(v2 * 10)
print(bool(v1), bool(v2))
print(bool(v3))

# if bool(v1): 
#     print('ok!')
