 # 파이썬 변수 범위(Scope)
 # Clobal 선언
 # 클로저 사용 이유
 # Class -> Closure

 # thread를 구현하는 부분이 프로그래밍 부분에서 제일 어렵다...

 # 클로저 기초
 # 파이썬의 변수 범위(scope) / global, local 개념을 의미하는것.

 # Ex1
 # def func_v1(a):
 #     print(a)
 #     print(b)

# func_v1(10)
# Ex2
# b = 20
#
# def func_v2(a):
#     print(a)
#     print(b)
#
# func_v2(10)

# Ex3

c = 30

def func_v3(a):
    global c
    print(a)
    print(c)
    c = 40
    # 안에 같은 변수가 있는 경우에는 로컬 변수로 인식을 했다.

print(c)
func_v3(10)
print(c)

# closure 사용 이유
# scope가 닫혀도 로컬변수를 기억하고 있다.
# 서버 프로그래밍 -> 동시성(Concurrency)제어 -> 메모리 공간에 여러 자원이
# 접근하기 때문 -> 교착상태(Dead Lock)
# 메모리를 공유하지 않고 메세지 전달로 처리하기 위해서
# 클로저는 공유하되 변경되지 않는(Immutable, Read Only) 적극적으로 사용
# -> 함수형 프로그래밍과 연계해서 사용
# 클로저는 불변자료구조 및 atom, STM -> 멀티스레드 프로그래밍에 강점 제공
# 코루틴 => 단일 스레드에서도 멀티스레드처럼 운용되게 만들수있음

# 결론 : 클로저는 불변하는 상태를 기억하고 있는다.

a = 100

print(a + 100)
print(a + 1000)

# 결과 누적(함수 사용)
print(sum(range(1, 51)))
print(sum(range(50, 100)))

# 클래스 이용
# 누적할수있게 만들어준거임
# callable 을 통하여 클래스를 함수 호출하듯이 사용하게 만듬
# 매직메소드 이용
class Averager():
    def __init__(self):
        self._series = []

    def __call__(self, v):
        self._series.append(v)
        print('inner >> {} / {}'.format(self._series, len(self._series)))
        return sum(self._series) / len(self._series)

# 인스턴스 생성
averager_cls = Averager()

# print(dir(averager_cls))
# 누적
print(averager_cls(10))
print(averager_cls(30))
print(averager_cls(50))
print(averager_cls(70))
print(averager_cls(193))

# 자유영역의 함수는 종료되어있지만, 이렇게 기억하고있는 형태로 코딩되는걸
# 클로저라고 한다.  !
# 상태를 기억하고 있다 !

# # Ex1
# def outer(num):
#     def inner():
#         print(num)
#
#     return inner
#
# f1 = outer(3)
# f2 = outer(4)
# f1()
# f2()
