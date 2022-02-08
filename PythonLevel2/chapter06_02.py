# chapter06_02
# 병행성 !
# 제너레이터 실습
# yield 실습
# itertools 실습

# 병행성 / 병렬성
# 병행성 : 한 컴퓨터가 여러일을 동시에 수행하는걸 의미
# => 내가 어디까지 했는지 마지막 지점을 기억하고 있어야함
# => 단일 프로그램 안에서 여러일을 쉽게 해결하기 위해서 사용
# 병렬성 : 여러 컴퓨터가 여러 작업을 동시에 수행하는걸 의미
# => 속도 !

# Generator Ex1

def generator_ex1():
    print('Start')
    yield 'A Point' # return의 역할을 한다 ! 그 위치를 기억하면1
    print('Continue')
    yield 'B Point'
    print('End')

temp = iter(generator_ex1())

# print(temp)
# 그 위치를 기억하고 있는거임. 여러 일을 동시에 수행할수 있게 해주는
# 메커니즘이라는 소리입니다. !
# print(next(temp))
# print(next(temp))
# print(next(temp))

for v in generator_ex1():
    pass
    # print(v)

# Generator Ex2
temp2 = [x * 3 for x in generator_ex1()]
temp3 = (x * 3 for x in generator_ex1())

print(temp2)

for i in temp3:
    print(i)

for i in temp2:
    print(i)

print()
print()

# Generator Ex3(중요 함수)
# filterFalse, accumulate, chain, product, groupby....

import itertools

gen1 = itertools.count(1, 2.5)

print(next(gen1))
print(next(gen1))

# while True:
#     print(next(gen1))
# .... 무한

# 조건

gen2 = itertools.takewhile(lambda n : n < 1000, itertools.count(1, 2.5))

for v in gen2:
    pass
    # print(v)

print()
print()


# 필터의 반대 역할 filterfalse
gen3 = itertools.filterfalse(lambda n : n < 3, [1, 2, 3, 4, 5])

for v in gen3:
    print(v)

print()
print()

# 누적 합계
gen4 = itertools.accumulate([x for x in range(1, 101)])

for v in gen4:
    print(v)

# 연결1
# 앞에 것과 뒤에것을 하나로 합쳐서 chain 해주는 함수
# 서로 다른 iterable 한게 있을때 이렇게 연결해주는것
gen5 = itertools.chain('ABCDE', range(1, 11, 2))

print(list(gen5))

# 연결2
# 짝을 맞추어서 튜플형태로 연결하여 출력해주는 enumerate
gen6 = itertools.chain(enumerate('ABCDE'))

print(list(gen6))

# 개별
# 개별적으로 분리해주는 함수 product
gen7 = itertools.product('ABCDE')

print(list(gen7))

# 연산(경우의 수)
gen8 = itertools.product('ABCDE', repeat = 2)

print(list(gen8))

# 그룹화
gen9 = itertools.groupby('AAABBBCCCDDDEEE')

# print(list(gen9))

for chr, group in gen9:
    print(chr, ' : ' ,list(group))

# yield 키워드가 가장 중요하다! 이해하면됨 병행성에 대해서
