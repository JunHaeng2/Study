# 해쉬 테이블(Hashtable)
# Dict 생성 고급 예제
# Setdefault 사용법

# 해시 테이블
# key에 value를 저장하는 구조
# 파이선 dict 해쉬 테이블의 예시 : 2324324
# key 값의 연산 결과에 따라서 직접 접근이 가능하기 때문에 !
# key 값을 해싱 함수 -> 해쉬 주소 -> key에 대한 value 참조

# Dict 구조
# print(__builtins__.__dict__)

# Hash 값 확인 => 고유하다

t1 = (10, 20, (30, 40, 50))
t2 = (10, 20, [30, 40, 50])

print(hash(t1))

# mutable 하기 때문에 에러가 발생하게 된다.
# print(hash(t2))

print()
print()

# Dict Setdefault 예제
source = (('k1', 'val1'),
          ('k1', 'val2'),
          ('k2', 'val3'),
          ('k2', 'val4'),
          ('k2', 'val5'))

new_dict1 = {}
new_dict2 = {}

# No use Setdefault
for k, v in source:
    if k in new_dict1:
        new_dict1[k].append(v)
    else:
        new_dict1[k] = [v]

print(new_dict1)

# Use Setdefault
for k, v in source:
    new_dict2.setdefault(k, []).append(v)

print(new_dict2)

# 주의
# key가 중복될 경우에는 이렇게 덮어쓰기가 되버림.. 그렇기에 위의 형태로
new_dict3 = {k : v for k, v in source}
print(new_dict3)
