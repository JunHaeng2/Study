# 예외, exceptions
# 파이썬 예외 처리의 이해
# 예외 종류
# SyntaxError(문법이 틀렸을때), TypeError, NameError, IndexError, ValueError ..
# 문법적으로는 예외가 없지만, 코드 실행 프로세스(단계) 발생하는 예외도 중요
# 1. 예외는 반드시 처리해야 한다.
# 2. 로그는 반드시 남긴다. (어떤 예외가 발생했는지에 대한 기록을 남기라는 뜻)
# 3. 예외는 던져진다. (다른곳으로 처리를 위임할수 있다)
# 4. 예외를 무시해서 넘어갈수도 있다.

# SyntaxError : 문법 오류
# print('error)
# print('error'))
# if True
#    pass

# NameError : 참조가 없을때 발생하는 에러
# a = 10
# b = 15
# print(c)

# ZeroDivisionError
# print(100 / 0)

# IndexError
# x = [50, 70, 90]
# print(x[3])

# KeyError

# dict1 = {
#    "hi" : "hello",
#    "안녕" : 42
# }

# print(dict1["누구냐"])
# print(dict1.get("누구냐")) get의 경우가 None을 가져오기 때문에 이걸쓰는게 낫다

# 예외가 없는 것을 가정하고 프로그램을 작성 -> 런타임 예외 발생 시 예외 처리 권장(EAFP)

# AttributeError : 모듈, 클래스에 있는 잘못된 속성 사용 예외
# import time
# print(time.time2())

# ValueError

# x = [10, 50, 90]
# x.remove(50)
# print(x)
# x.remove(200)

# FileNotFoundError

# f = open('test.txt')

# TypeError : 자료형에 맞지 않는 연산을 수행 할 경우
# x = [1, 2]
# y = (1, 2)
# z = 'test'

# print(x + y)
# print(x + z)

# print(x + list(y))

# 예외처리
# try : 예외가 발생 할 가능성이 있는 코드를 실행하는 예약어
# execpt 에러명1 : 여러개 가능
# execpt 에러명2 :
# else : try 블록의 에러가 없을 경우 실행되는 부분을 의미함.
# finally : 항상 마지막에 실행한다.

name = ['Kim', 'Lee', 'Park']

# 예제1
# try:
#     z = 'Kim'
#     x = name.index(z)
#     print('{} Found it! {} in name'.format(z, x + 1))
# except ValueError:
#     print('Not found it! - Occurred ValueError!')
# else:
#     print('Ok! else.')

# 예제2
# try:
#     z = 'Cho'
#     x = name.index(z)
#     print('{} Found it! {} in name'.format(z, x + 1))
# except ValueError:
#     print('Not found it! - Occurred ValueError!')
# else:
#     print('Ok! else.')
#
# print('pass')

#예제3
# try:
#     z = 'Cho'
#     x = name.index(z)
#     print('{} Found it! {} in name'.format(z, x + 1))
# except Exception as e:
#     print(e)
#     print('Not found it! - Occurred ValueError!')
# else:
#     print('Ok! else.')
# finally:
#     print('Ok! finally.')

# try -> except -> else -> finally 구조!

#예제4
# 예외를 일부러 발생할수 있음 : raise

try:
    a = 'Park'
    if a == 'Kim':
        print('Ok! Pass!')
    else:
        raise ValueError
except ValueError:
    print('Occured! Exception!')
else:
    print('Ok! else!')
