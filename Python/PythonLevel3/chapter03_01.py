"""
chapter03_01
keyword - Class of class, Type, Meta Class, custom Meta class

"""
"""
메타 클래스
1. 클래스를 만드는 역할 -> 의도하는 방향으로 클래스 커스텀
2. 프레임워크 작성시 필수
3. 동적 생성(Type), 커스텀 생성(Type) 함수
4. 커스텀 클래스 -> 검증 클래스 등
5. 엄격한 Class 사용 요구, 메소드 오버라이드 요구

"""

# Ex1
# type 에제

class SampleA(object):# Class == Object
    pass

obj1 = SampleA() # 변수에 할당, 복사 가능, 새로운 속성 추가, 함수의 인자로
# 넘기기 가능해진다.
obj2 = SampleA()

print('Ex1 > ', obj1.__class__)
print('Ex1 > ', type(obj1))
print('Ex1 > ', obj1.__class__ is type(obj1))

# SampleA의 원형은 뭐냐
# 모든 클래스의 메타, 원형이 되는건 type 이다! 중요 !
# 동적으로 함수도 추가하고, 상속도 하고.. 동적으로 해결할수있게 해줌 type으로 !
print('Ex1 > ', obj1.__class__.__class__ is type(obj1.__class__))

# type의 원형은 type 이다 !
print(type.__class__)

# obj1 --> SampleA instance
# SampleA instance --> Type meta class
# Type --> Type meta class

# Ex2
# type meta(Ex1 증명)

# int, dict

n = 10
d = {}

class SampleB():
    pass

obj2 = SampleB()

for o in (n, d, obj2):
    print('Ex2 > {} {} {}'.format(type(o), type(o) is o.__class__, o.__class__.__class__))

for t in int, float, list, tuple:
    print('Ex2 > ', type(t))

print('Ex2 > ', type(type))
