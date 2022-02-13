# 일급함수
# 익명함수(Lambda)
# Callable
# Partial

# 함수형 프로그래밍 강의 한번 찾아보기.
# 함수 기반으로 부품별로 모듈화가 되어서 기능위주로 구성가능

# 일급함수(First Class)
# 파이썬 함수 특징
# 1. 런타임 초기화
# 2. 변수 할당 가능
# 3. 함수 인수 전달 가능
# 4. 함수를 결과로 반환 가능(return)

# 함수 객체

def factorial(n):
    """
    Factorial Function -> n : int
    """
    if n == 1: # n < 2
        return 1
    else:
        return n * factorial(n-1)

class A:
    pass

print(factorial(5))
print(factorial.__doc__)
print(type(factorial), type(A))
print(set(sorted(dir(factorial))) - set(sorted(dir(A))))
print(factorial.__name__)
print(factorial.__code__)

print()
print()

# 변수 할당
var_func = factorial
print(var_func)
print(var_func(10))
print(list(map(var_func, range(1, 11))))

# 함수 인수 전달 및 함수로 결과 반환 -> 고위 함수(Higher-order Function)
# map, filter, reduce

print(list(map(var_func, filter(lambda x : x % 2, range(1, 6)))))
print([var_func(i) for i in range(1, 6) if i % 2])

print()
print()

# reduce
from functools import reduce
from operator import add

# 인수를 하나하나 줄여가면서 function을 해주는 함수
print(reduce(add, range(1, 11)))
print(sum(range(1, 11)))

# 익명함수(lambda)
# 가급적 주석을 작성해라. 익명함수는 알아먹기가 힘들기 때문에 주석이 필요함
# 가급적 함수 작성 !
# 일반 함수 형태로 리팩토리을 권장한다.

print(reduce(lambda x, t : x + t, range(1, 11)))

print()
print()

# Callable : 호출 연산자 -> 메소드 형태로 호출 가능한지 확인
# 호출 가능한지 확인
print(callable(str))
print(callable(factorial))
print(callable(A), callable(var_func))
print(callable(3.14))

# partial 사용법 : 인수 한쪽을 고정 -> 콜백 함수에 사용한다
from operator import mul
from functools import partial

print(mul(10, 10))
print(add(10, 10))
print()

# 한쪽의 인수를 고정해버리고 싶다.
five = partial(mul, 5)
print(dir(five))
print(five(10))

# five 에서 하나가 고정되어있기에, 남은 부분에 6이 들어가게 된다.
# 호출만 하면되는것. 고정되어있는 값을 원할때 partial
six = partial(five, 6)
print(six())

print([five(i) for i in range(1, 11)])

abc = partial(mul, 10)
print(list(map(five, range(1, 11))))
