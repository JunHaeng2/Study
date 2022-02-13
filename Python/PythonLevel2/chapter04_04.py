# chapter04_04

# 해시 테이블
# immutable Dict 생성
# 지능형 Set
# Set 선언시 최적화 방법 (byte 코드를 직접 실행해서 어떻게 실행되는지)

# 해시테이블(hashtable) -> 적은 리소스로 많은 데이터를 효율적으로 관리
# Dict -> key 중복 허용 x , Set -> 중복 허용 x
# Dict 및 Set 심화

# immutable Dict

from types import MappingProxyType

d = {'key1' : 'value1'}

# Read Only
d_frozen = MappingProxyType(d)

print(d, id(d))
print(d_frozen, id(d_frozen))

# read only 로만 바뀌었을뿐 해시 값은 표기되지 않는다. 내부속성 자체는 안변하는듯
# print(hash(d_frozen))

# 수정 불가
# d_frozen['key2'] ='value2'

print()
print()

s1 = {'Apple', 'Orange', 'Apple', 'Orange', 'Kiwi'}
s2 = set(['Apple', 'Orange', 'Apple', 'Orange', 'Kiwi'])
s3 = {3}
s4 = set() # Not {}
s5 = frozenset({'Apple', 'Orange', 'Apple', 'Orange', 'Kiwi'})

s1.add('Melon')
print(s1)

# frozenset으로 값을 고정시키는거. 추가 혹은 변동 x
# s5.add('Melon')

print(s1, type(s1))
print(s2, type(s2))
print(s3, type(s3))
print(s4, type(s4))
print(s5, type(s5))

# 선언 최적화
# 바이트 코드 실행 -> 파이썬 인터프리터 실행
from dis import dis

print('-----')
print(dis('{10}'))
print('-----')
print(dis('set(10)'))

# 지능형 집합(Comprehending Set)

print('-----')

from unicodedata import name

print({name(chr(i), '') for i in range(0, 256)})
