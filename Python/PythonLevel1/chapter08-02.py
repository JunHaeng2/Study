# Chapter 08-02
# 파이썬 외장(External) 함수
# 실제 프로그램 개발 중 자주 사용하게 된다.
# 종류 : sys, pockle, shutil, temfile, time, random 등

# 예제1
import sys
print(sys.argv)

# 예제2(강제 종료)
# sys.exit()

# 예제3(파이썬 패키지 위치)
print(sys.path)

# pickle : 객체 파일 쓰기
import pickle

# 예제4(쓰기)

f = open("test.obj", 'wb')
obj = {
    1 : 'python',
    2 : 'study',
    3 : 'basic'
}
pickle.dump(obj, f)
f.close()

# 예제5(읽기)
f = open("test.obj", 'rb')
data = pickle.load(f)
print(data, type(data))
f.close()

# os : 환경 변수 , 운영체제에서 사용할수있는 기능을 제공함
# 디렉토리(파일) 처리 관련, 운영체제 작업에 관련이 되어있습니다.
# mkdir, rmdir, rename

# 예제6
import os
# print(os.environ)

# 예제7 현재 경로를 보여주는
print(os.getcwd())

# 예제8 time : 시간 관련 처리할때 사용하는 외장함수
import time

print(time.time())
print(time.localtime(time.time()))
# 현재 시간을 읽을수있도록 변환시켜서 보여준다

print(time.ctime())

#에제11 형식 표현
print(time.strftime('%Y-%m-%d %H:%M:%S', time.localtime(time.time())))
# 중요하다.. 형식표현에 대해서 외워두고 사용하는게 조음 !

# 예제12 시간 간격을 발생
# for i in range(5):
#     print(i)
#     time.sleep(1)

# random : 난수 리턴
import random

# 예제13
print(random.random())
print(random.randint(1, 45))
print(random.randrange(1, 45, 3))

# shuffle (섞기)
d = [1, 2, 3, 4, 5]
random.shuffle(d)
print(d)

# 예제16 (무작위 선택)
c = random.choice(d)
print(c)

# # webbrowser : 본인 os의 웹 브라우저를 실행한다.
# import webbrowser
#
# webbrowser.open("http://google.com")
# webbrowser.open_new("http://google.com")
