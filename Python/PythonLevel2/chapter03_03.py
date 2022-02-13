#chapter03_03

# 객체 -> 파이썬의 데이터를 추상화 한다.
# 모든 객체 -> id, type -> value로 표현 가능하다.

# 일반적인 튜플
pt1 = (1.0, 5.0)
pt2 = (2.5, 1.5)

from math import sqrt

l_leng1 = sqrt((pt1[0] - pt2[0]) ** 2 + (pt1[1] - pt2[1]) ** 2)

print(l_leng1)

# 네임드 튜플 사용
from collections import namedtuple

# 네임드 튜플 선언
Point = namedtuple('Point', 'x y')

pt3 = Point(1.0, 5.0)
pt4 = Point(2.5, 1.5)

print(pt3[0], pt4[1])
print(pt3.x)
print(pt4.y)
print(pt3, pt4) # 데이터 랩핑을 잘 해서 구조적으로 확인이 가능해진다.

# 인덱스로도 접근가능하고 키로도 접근 가능하다.
l_leng2 = sqrt((pt3.x - pt4.x) ** 2 + (pt3.y - pt4.y) ** 2)

print(l_leng2)

# 네임드 튜플 선언 방법
Point1 = namedtuple('Point', ['x', 'y'])
Point2 = namedtuple('Point', 'x, y')
Point3 = namedtuple('Point', 'x y')
# Default = False..
Point4 = namedtuple('Point', 'x y x class', rename=True)


# 출력
print(Point1, Point2, Point3, Point4)

# Dict to Unpacking
temp_dict = {'x' : 75, 'y' : 55}


# 객체 생성
p1 = Point1(x = 10, y = 35)
p2 = Point2(20, 40)
p3 = Point3(45, y = 20)
p4 = Point4(10, 20, 30, 40)
p5 = Point3(**temp_dict)

print()

print(p1)
print(p2)
print(p3)
print(p4) #rename이 True인 경우에는 _2, _4 이런식으로 난수로 생성이 된다.


temp_dict2 = {'x' : 20, 'y' : 20}
p6 = Point3(**temp_dict2)
print(p6)

print(p1[0] + p2[1])
# 이런식으로 key로 접근하는 형태가 좋다.
print(p1.x + p2.y)

# 언패킹
x, y = p3
print(x, y)

x, y = p2
print(x, y)

# 네임드 튜플 메소드
temp = [52, 38]

# 리스트를 네임드 튜플로 만들어주는 명령어 ._make() / 새로운 객체를 생성
p4 = Point._make(temp)
print(p4)

# _fields : 필드 네임을 확인할수 있음 (key 값 확인)
print(p1._fields, p2._fields)

# _asdict() : OrderedDict 반환
print(p1._asdict())

# ._make ._fields ._asdict !!

# 실 사용 실습
# 반20명 , 4개의 반(A, B, C, D)

Classes = namedtuple('Classes', ['rank', 'number'])

# 그룹 리스트 선언
numbers = [str(n) for n in range(1, 21)]
ranks = 'A B C D'.split()

# list Comprehension
student = [Classes(rank, number) for rank in ranks for number in numbers]

print(student)

# 추천 (가독성)
student2 = [
    Classes(rank, number)
    for rank in 'A B C D'.split()
        for number in [str(n)
            for n in range(1, 21)]
]

print(student2)

# 출력
for s in student2:
    print(s)


    
