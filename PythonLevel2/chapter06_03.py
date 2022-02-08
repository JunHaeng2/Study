
# 코루틴(Coroutine)

# yield, send : 메인 <-> 서브 상호작용
# 쓰레드 : os 관리, 동시에 여러가지 일을 할수도있고,
# cpu 코어에서 실시간, 시분할 비동기 작업 -> 멀티쓰레드
# 코루틴 : 단일(싱글) 스레드, 스택을 기반으로 동작하는 비동기 작업
# 리소스가 부족한 경우에 단일(싱글) 스레드 환경에서도 여러가지 작업을
# 순차적으로 상호작업을 하면서 블록되지 않으면서 할수있는걸 의미한다.
# 코루틴 제어, 상태, 양방향 전송

# 서브루틴 : 메인루틴에서 호출 -> 서브루틴에서 수행(흐름제어)
# 코루틴 : 루틴을 실행 중 중지 -> 동시성 프로그래밍
# 코루틴 : 스레드에 비해 오버헤드가 감소함(단일 스레드에서 실행하기 때문에)
# 운영체제에 많은 스레드가 필요해 하다는게 없기 때문에.. !
# 스레드 : 싱글스레드 -> 멀티스레드 -> 복잡 -> 공유되는 자원
# -> 데드락(교착상태) 발생 가능성, 컨텍스트 스위칭 비용 발생,
# 자원 소비 가능성이 증가한다.
# def -> async, yield -> await 사용 가능하다.

# 코루틴 Ex1

# 함수를 선언한다 생각하지말고 내용을 확인해야함
# def를 통해 함수, 제너레이터, 코루틴 등을 만들기 때문에
def coroutine1():
    print('>>>> coroutine started.')
    i = yield
    print('>>>> coroutin received : {}'.format(i))

# 메인 루틴
# 제너레이터 선언
cr1 = coroutine1()

print(cr1, type(cr1))

# next(cr1)
# send가 next의 기능도 포함하고있다 보면됨
# cr1.send(100)
# yield 부분에서 i라는 반환값을 받기 때문에 여기서 send가 가능합니다.
# yield 지점까지 서브루틴 수행

# 코루틴 Ex2
# GEN_CREATED : 처음 대기상태
# GEN_RUNNING : 실행 상태
# GEN_SUSPEND : Yield 대기 상태
# GEN_CLOSED : 실행 완료 상태

# CREATED, RUNNING, SUSPEND, CLOSED

def coroutine2(x):
    print('>>> coroutine started : {}'.format(x))
    y = yield x
    print('>>> coroutine received : {}'.format(y))
    z = yield x + y
    print('>>> coroutine received : {}'.format(z))

cr3 = coroutine2(10)

from inspect import getgeneratorstate

print(getgeneratorstate(cr3))

print(next(cr3))

print(getgeneratorstate(cr3))

cr3.send(100)

print(getgeneratorstate(cr3))

print()
print()

# 코루틴 Ex3
# StopIteration 자동 처리(3.5 -> await)
# 중첩 코루틴 처리

def generator1():
    for x in 'AB':
        yield x

    for y in range(1, 4):
        yield y

t1 = generator1()

print(next(t1))
print(next(t1))
print(next(t1))
print(next(t1))
print(next(t1))
# print(next(t1))

t2 = generator1()

# 알아서 next가 호출되면서 알아서 list로 반환이 된다
print(list(t2))

print()
print()

# yield from iterable 데이터 !
def generator2():
    yield from 'AB'
    yield from range(1, 4)

t3 = generator2()

print(next(t3))
print(next(t3))
print(next(t3))
print(next(t3))
print(next(t3))

print()
print()

# 단일 스레드환경에서 동시성 작업을 하기 위한 프로그래밍 기법
# 코루틴 !
