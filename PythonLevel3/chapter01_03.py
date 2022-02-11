
"""
chapter01_03
keyword - Shallow copy & Deep copy
"""

"""
객체의 복사 종류 : copy, shallow copy, deep copy
정확한 이해 후 사용 -> 프로그래밍 개발 중요(문제 발생 요소)

가변 : list, set, dict

"""

#Ex1 - Copy
# Call by value, Call by Refference, Call by share

# Call by Refference 주소값을 전달하였기 때문에 이런식으로 같이 바뀜
a_list = [1, 2, 3, [4, 5, 6], [7, 8, 9]]
b_list = a_list

print('Ex1 > ', id(a_list))
print('Ex1 > ', id(b_list))

b_list[2] = 100

print('Ex1 > ', a_list)
print('Ex1 > ', b_list)

b_list[3][2] = 100

print('Ex1 > ', a_list)
print('Ex1 > ', b_list)

# list는 mutable형 이기 때문에 조심해야함
# immutable : int, str, float, bool, unicode...

#Ex2 - Shallow copy
# 주소를 참조만 한것을 얕은 복사라고 한다.
# 이때 immutable한 객체들은 얕은복사/깊은 복사가 의미가 없다.
# 값을 수정하게되먄, 즉 새롭게 할당하는 경우에는 참조가 변경되기 때문에
# 이 경우는 id 자체가 바뀌는 경우라고 생각하면 된다.

import copy

c_list = [1, 2, 3, [4, 5, 6], [7, 8, 9]]
d_list = copy.copy(c_list)

print('Ex2 > ', id(c_list))
print('Ex2 > ', id(d_list))

d_list[1] = 100

print('Ex2 > ', c_list)
print('Ex2 > ', d_list)

# 세부 안에 있는 리스트는 그대로 주소를 복사해서 가져가버림
d_list[3].append(1000)
d_list[4][1] = 10000

print('Ex2 > ', c_list)
print('Ex2 > ', d_list)

# Ex3 - Deep copy

e_list = [1, 2, 3, [4, 5, 6], [7, 8, 9]]
f_list = copy.deepcopy(e_list)

print('Ex3 > ', id(e_list))
print('Ex3 > ', id(f_list))

f_list[3].append(10000)
f_list[4][1] = 10000

print('Ex3 > ', e_list)
print('Ex3 > ', f_list)


# import copy
# copy.copy(), copy.deepcopy
