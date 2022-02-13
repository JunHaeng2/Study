# variable scope

"""
Chapter01_01.py
Python Advanced(1) - Python Variable Scope
Keyword - scope, global, nonlocal, locals, globals
"""

"""
전역변수는 주로 변하지 않는 고정 값에 사용
지역변수 사용 이유 : 지역변수는 함수 내에 로직 해결에 국한
소멸주기 : 함수 실행 해제 시 지역변수는 소멸
-> 그렇기에 전역변수를 지역내에서 수정되는 것은 권장x
"""

# Ex1
a = 10 # Global variable

def foo():
    # Read global variable
    print('Ex1 >', a)

foo()

# Read gloabl Variable
print('Ex1 >', a)

# Ex2
b = 20

def bar():
    b = 30 # Local variable
    # 파이썬은 scope 안에서 먼저 찾고, 없으면 바깥으로 나가서 찾는다.
    print('Ex2 >', b) # Read Local variable

bar()
print('Ex2 >', b) # Gloabal scope 안에 b가 있기에 global 부분을..

# Ex3
c = 40

def foobar():
    # c = c + 10 #전역에 있는 값을 로컬에서 수정 불가
    # c = 10
    # c += 100

    print('Ex3 >', c)

foobar()

# Ex4
d = 50

def barfoo():
    global d #전역 스코프에 선언되어있는 변수는 global을 통해서 읽고 수정가능

    d = 60
    d += 100

    print('Ex4 >', d)

barfoo()

print('Ex4 >', d)

# Ex5 (중요)
# nonlocal

def outer():
    e = 70
    def inner():
        nonlocal e
        e += 10 # e = e + 10
        print('Ex5 >', e)
    return inner

in_test = outer() # Closure

in_test()
in_test()

# Ex6
def func(var):
    x = 10
    def printer():
        print('Ex6 > ',"Printer Func Inner")
    print('Func Inner', locals())

func('Hi')

# Ex7
print('Ex7 > ', globals()) # 전역 전체 출력
globals()['test_variable'] = 100
print('Ex7 > ', globals())

# Ex8(지역 -> 전역 변수 생성)
for i in range(1, 10):
    for k in range(1, 10):
        globals()['plus_{}_{}'.format(i, k)] = i + k

print(globals())

print('EX8 > ', plus_5_5)
