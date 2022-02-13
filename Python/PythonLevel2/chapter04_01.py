# chapter04_01
# 시퀀스형
# 컨테이너(Container : 서로다른 자료형을 담을수 있음)
# ex : list, tuple, collections, deque
# 플랫(Flat : 한개의 자료형[str, bytes, bytearray, array.array
# memoryview])
# 가변형 (list, bytearray, array.array, memoryview, deque)
# 불변형 (tuple, str, bytes)

# 리스트 및 튜플 고급

# 지능형 리스트(Comprehending Lists)
chars = '+_(*&$&$*@)'
# chars[2] ='h' # 불변형이기 때문에 수정이 불가

code_list1 = []

for s in chars:
    # 유니코드 리스트
    code_list1.append(ord(s))

print(code_list1)

# Comprehending Lists
# 이런식으로 list 바로 생성하는게 속도면으로 좀 더 빨리진다.. !
# 나중에 한번 찾아보기
code_list2 = [ord(s) for s in chars]
print(code_list2)

# Comprehending Lists  + Map, Filter
# Filter

code_list3 = [ord(s) for s in chars if ord(s) > 40]
print(code_list3)
code_list4 = list(filter(lambda x : x > 40, map(ord, chars)))
print(code_list4)

print([chr(s) for s in code_list3])
print([chr(s) for s in code_list1])

print()
print()

# Generator 생성
import array

# Generator : 한 번에 한 개의 항목을 생성(메모리 유지 x)
tuple_g = (ord(s) for s in chars)
array_g = array.array('I', (ord(s) for s in chars))
print(array_g)

# next : 반복가능한 객체에서 다음 값을 반환
print(array_g.tolist())

print()
print()

# 제너레이터 예제
print(('%s' % c + str(n) for c in ['A', 'B', 'C', 'D'] for n in range(1, 21)))

for s in ('%s' % c + str(n) for c in ['A', 'B', 'C', 'D'] for n in range(1, 21)):
    print(s)

# 제너레이터의 정확한 의미좀 공부해야할듯 !
# 이터레이터와 제너레이터 구분하는거도..

# 리스트 주의
print()
print()

marks1 = [['~'] * 3 for _ in range(4)]
marks2 = [['~'] * 3] * 4

print(marks1)
print(marks2)

# 수정
marks1[0][1] = 'X'
print(marks1)

# 의도하지 않는 값이 수정되는 결과가 나타난다..
marks2[0][1] = 'X'
print(marks2)

# 1번 같은 경우는 4개의 id값이 나온거고, 2번같은 경우는 하나의 id값이 4개로 복사된거임
print([id(i) for i in marks1])
print([id(i) for i in marks2])
