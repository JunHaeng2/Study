"""
Chapter01_02 Advanced
lambda, reduce, map, filter
keyword - lambda, reduce, map, filter
"""

"""
lambda 장점 : 익명, 힙 영역에서 사용 즉시 소멸(메모리 아낄수있음)
pythonic한 코드 사용, 파이썬 가비지 컬렉션(count=0)
일반함수 : 재사용성을 위해 메모리 저장
시퀀스형 전처리에 reduce, map, filter를 주로 사용
그때 그때 콜 할때마다 메모리에 올려서 사용하기에, 메모리 용량 아낄수있음
"""

# Ex1
cul = lambda a, b, c : a * b + c
print('Ex1 > ', cul(10, 15, 20))

# Ex2
digits1 = [x * 10 for x in range(1, 11)]
print('Ex2 > ', digits1)

result = map(lambda i : i ** 2, digits1)
# 형변환
print(list(result))
result10 = map(lambda x : x ** 2, [int(i) for i in range(1, 11)])
print(list(result10))

print('Ex2 > ', result)

def also_square(nums):
    def double(x):
        return x ** 2
    # double() : 이 함수를 실행시킨다는 의미이고
    # double : 함수의 반환값을 돌려준다는 의미임
    return map(double, nums)

print('Ex2 > ', list(also_square(digits1)))

# Ex3
digits2 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

# filter는 함수 부분에서 True/False 의 반환값이 필요한거임
# 그렇게 해서 True가 나오면 그 값을 반환해주는거고
# map 같은 경우는 그냥 함수이면 되는거고
# map에 조건을 넣어버리면 이땐 True 혹은 False가 반환되는거고
result2 = filter(lambda x : x % 2 == 0, digits2)
print(list(result2))

result3 = map(lambda x : x % 2 == 0, digits2)
print(list(result3))

def also_evens(nums):
    def is_even(x):
        return x % 2 == 0
    return filter(is_even, nums)

print('Ex3 > ', list(also_evens(digits2)))

# Ex4
from functools import reduce

digit3 = [x for x in range(1, 101)]

# 하나씩 줄여나가면서.. 라고 이해하면 될듯하다..
result4 = reduce(lambda x, y : x + y, digit3)
print('Ex4 > ', result4)

def also_add(nums):
    def add_plus(x, y):
        return x + y
    return reduce(add_plus, nums)

print('Ex4 > ', also_add(digit3))
