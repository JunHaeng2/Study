# chapter04_02

# Tuple Advanced
# Unpacking

# b, a = a, b
# 다른 언어는 임시변수를 만들어서 교차해야하는데, 파이썬에서는 이런식으로도 가능

print(divmod(100, 9))
print(divmod(*(100, 9)))
print(*(divmod(100, 9)))

print()

x, y, *rest = range(10)
print(x, y, rest)

x, y, *rest = range(2)
print(x, y, rest)

x, y, z, i, *rest = 1, 2, 3, 4, 5
print(x, y, z, i, rest)

print()
print()

# Mutable(가변) vs Imnutable(불변)

l = (15, 20, 25)
m = [15, 20, 25]

print(l, id(l))
print(m, id(m))

l = l * 2
m = m * 2

print(id(l), id(m))

l *= 2
m *= 2

print(id(l), id(m))

# 튜플은 id가 계속 바뀌게 되고, 리스트 같은경우는 연산자의 활용에 따라 바뀌기도하고
# 안바꾸기기도 한다.

# sort vs sorted
# reverse, key=len, key=str.Lower, key=func...)

# sorted : 정렬 후 새로운 객체 반환 / 원본은 수정 x
# sort : 정렬 후 객체 직접 변경 / 원본이 수정됨

f_list = ['orange', 'apple', 'mango', 'papaya', 'lemon', 'coconut']

print('sorted -', sorted(f_list))
print('sorted -', sorted(f_list, reverse = True))
print('sorted -', sorted(f_list, key = lambda x : x[-1]))
print('sorted -', sorted(f_list, key = lambda x : x[-1]))

# 반환값 확인은 None
# 원본을 직접 변경하는경우 !
print('sort -', f_list.sort())
print(f_list)

print('sort -', f_list.sort(), f_list)
print('sort -', f_list.sort(reverse=True), f_list)
print('sort -', f_list.sort(key = lambda x : x[-1]), f_list)
print('sort -', f_list.sort(key = lambda x : x[-1], reverse = True), f_list)

# List vs Array 적합 한 사용법 설명
# 리스트 기반 : 융통성, 다양한 자료형, 범용적 사용
# 숫자 기반 : numpy 의 고속연산, 데이터가 많은 경우 정도, 배열(리스트와 거의 호환)
# 하나의 숫자로 되어있다. 하면은 array로 하고, 일반적으로 데이터 종류가 많을경우에는 list 사용하는
