# chapter 08-01
# 파이썬 내장(Built-in) 함수
# 자주 사용하는 함수 위주로 실습
# 사용하다보면 자연스럽게 숙달되기 때문에 외울 필요가 없음
# str(), int(), tuple() 형변환 이미 학습하였기 떄문에 !

# 절대값
# abs()

print(abs(-3))

# all : iterable 요소 검사(참, 거짓)
print(all([1,2,3,]))
print(all([0,1,2])) # 모두 만족해야 true
print(any([1,2,0])) # 하나만 만족해도 true
print(any([0,0,0]))

# chr : 아스키 -> 문자, ord : 문자 -> 아스키
print(chr(67))
print(ord('C'))

# enumerate : 인데스 + iterable 객체 생성
for key, value in enumerate(['abc', 'bcd', 'def']):
    print(key, value)

# enumerate 중요하다 ! 인덱스와 값을 한번에 보여줄수 있기 때문에

# filter : 반복가능한 객체 요소를 지정한 함수 조건에 맞는 값 추출

def conv_pos(x):
    return abs(x) > 2

print(list(filter(conv_pos, [-3, -2, 0, 5, 6])))
print(list(filter(lambda x : abs(x) > 2, [-3, -2, 0, 5, 6])))
print(list(filter(lambda x : abs(x) > 3, [-3, -2, 0, 5, 6])))

# id : 객체의 주소값(레퍼런스) 반환

print(id(int(5)))
print(id(4))

# len : 함수의 요소의 길이를 반환한다.
print(len('abcdefg'))
print(len([1,2,3,4,5,6]))

# max, min : 최대값, 최소값

print(max([1, 2, 3]))
print(max('python'))
print(min([1,2,3]))
print(min('python'))

# map : 반복가능한 객체 요소를 지정한 함수 실행 후 추출
def conv_abs(x):
    return abs(x)

print(list(map(conv_abs, [-3, -2, 0, -5, -6])))
print(list(map(lambda x : abs(x), [-3, -2, 0, -5, -6])))

# filter는 걸러주지만 map은 걸러주는게 아니라 반복가능한 객체 요소를 추출

# pow 함수 : 제족값을 반환하는 함수
print(pow(2, 10))

# range : 반복가능한 객체(iterable)을 반환
print(list(range(1, 10)))
print(list(range(0, -15, -1)))

# round : 반올림 함수
print(round(6.445, 1))
print(round(5.6))

#sorted : 반복 가능한 객체(Iterable)를 정렬 후 반환
print(sorted([6, 7, 4, 3, 2, 1]))
print(sorted(['p', 'y', 't', 'h']))

# sum : 반복 가능한 객체(Iterable) 합 변환
print(sum([1, 2, 3, 4, 5]))

# type : 자료형을 보여주는 내장함수 !
print(type(1))
print(type('hi'))
print(type('hello'))
print(type([]))
print(type((1,)))

# zip : 반복 가능한 객체(Iterable)의 요소를 묶어서 반환

print(list(zip([10, 20, 30], [40, 50, 60])))
print(list(zip([10, 20, 30], [40, 50])))
print(type(list(zip([10, 20, 30],[40, 50, 60]))[0]))
