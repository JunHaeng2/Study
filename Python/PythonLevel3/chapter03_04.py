"""
chapter03_04
keyword - Descriptor, set, get, del, property

"""
"""
디스크립터
1. 객체에서 서로다른 객체를 속성값으로 가지는 것.
2. Read, Write, Delete 등을 미리 정의 가능
3. Data descriptor(set, del), non-data Descriptor(get)
4. 읽기 전용 객체 생성 장점, 클래스를 의도하는 방향으로 생성 가능

"""

# Ex1
# 기본적인 Descriptor 예제

class DescriptorEx1(object):
    def __init__(self, name='Default'):
        self.name = name

    def __get__(self, obj, objtype):
        return 'Get method called. -> self : {}, obj : {}, objtype : {}, name : {}'.format(self, obj, objtype, self.name)

    def __set__(self, obj, name):
        print('Set method called.')
        if isinstance(name, str):
            self.name == name
        else:
            raise TypeError('Name should be string.')

    def __delete__(self, obj):
        print('Delete method called.')
        self.name = None

class Sample1(object):
    name = DescriptorEx1()

s1 = Sample1()
# __set__ 호출
s1.name = 'Desciptor Test1'

# 예외 발생
# s1.name = 10

# attr 확인
print('Ex1 > ', s1.name)

# __delete__ 호출
del s1.name

# 재확인
# __get__ 호출
print('Ex1 > ', s1.name)

print()
print()

# Ex2
# Property 클래스 사용 Desciptor 직접 구현
# class property(fget=None, fset=None, fdel=None, doc=None)

class DescriptorEx2(object):
    def __init__(self, value):
        self._name = value

    def getVal(self):
        return 'Get method called. -> self : {}, name : {}'.format(self, self._name)

    def setVal(self, value):
        print('Set method called')
        if isinstance(value, str):
            self._name = value
        else:
            raise TypeError('Name shold be string.')

    def delVal(self):
        print('Delete method called.')
        self._name = None

    # 클래스가 하나가 되는 대신에 property를 통해서
    name = property(getVal, setVal, delVal, 'Property Method Example')

# 최종값 확인

s2 = DescriptorEx2('Descriptor Test2')

print('Ex2 > ', s2.name)

# setVal 호출
s2.name = "Descript Set Method"
print('Ex2 > ', s2.name)

# delVal 호출
del s2.name
print('Ex2 > ', s2.name)

# Doc 확인
# 코멘트를 확인해주는 역할이다.. !
print('Ex2 > ', DescriptorEx2.name.__doc__)
