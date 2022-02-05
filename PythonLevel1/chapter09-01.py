# 파일 읽기 및 쓰기
# 읽기 모드 : r 쓰기 모드 : w 추가 모드 a / t, b
# r w a read write append !
# t text b binary
# 상대경로 ../, ./ 절대경로 /user/~

# 파일 읽기(Read)
# 예제1

f = open('./resource/it_news.txt', 'r', encoding = "UTF-8")
# 속성확인
print(dir(f))
# 인코딩 확인
print(f.encoding)
# 파일 이름
print(f.name)
# 모드 확인
print(f.mode)

cts = f.read()
print(cts)
#반드시 close 해야한다. 작업이 끝났다는걸 파이썬에게 말해주어야 하기 때문에
f.close()

with open('./resource/it_news.txt', 'r', encoding = "UTF-8") as f:
    c = f.read(20)
    print(c)
    c = f.read(20)
    print(c)
    #cursor가 있다. 내부적으로 어디까지 읽었는지를 기억하고 있는거임.
    c = f.read(20)
    print(c)
    f.seek(0, 0)
    print(f.read(20))

print()

# 예제3
# read() : 전체 읽기, read(10) : 10Byte read안에 숫자를 넣어주면 byte
# 수만큼 읽어옴

# 예제4
# readline : 한 줄씩 읽기

with open('./resource/it_news.txt', 'r', encoding = "UTF-8") as f:
    line = f.readline()
    print(line)
    line = f.readline()
    print(line)

# 예제5
# readlines : 한줄을 읽어오는게 아니라, 전체를 읽은 후 line 단위로 리스트 저장

with open('./resource/it_news.txt', 'r', encoding = "UTF-8") as f:
    cts = f.readlines()
    print(cts)
    print()

    for c in cts:
        print(c, end='')

# 파일 쓰기(write)

with open('./resource/contents1.txt', 'w') as f:
    f.write('I love python\n')

with open('./resource/contents1.txt', 'wt') as f:
    f.write('I love python2\n')

with open('./resource/contents1.txt', 'at') as f:
    f.write('I love python\n')

#writelines : 리스트로 되어있는걸 파일로 쓸수있다.

with open('./resource/contents2.txt', 'w') as f:
    list = ['Orange\n', 'Apple\n', 'Banna\n', 'Melon\n']
    f.writelines(list)

with open('./resource/contents3.txt', 'wt') as f:
    print('Test Text Write', file=f)
    print('Test Text Write', file=f)
    print('Test Text Write', file=f)
    print('Test Text Write', file=f)
