# Chapter09-2
# csv 파일 읽기 및 쓰기
# CSV : MEME - text/csv

import csv

# 예제1
with open('./resource/test1.csv', 'r', encoding = 'UTF-8') as f:
    reader = csv.reader(f)
    # next(reader) # Header를 skip

    # 객체 확인
    print(reader)

    # 타입 확인
    print(type(reader))

    # 속성 확인
    print(dir(reader)) #__iter__

    for c in reader:
        # print(c)
        # 타입 확인(리스트로 가져옴)
        print(' : '.join(c))

# 예제2
with open('./resource/test2.csv', 'r') as f:
    reader = csv.reader(f, delimiter= '|')

    for c in reader:
        print(c)

with open('./resource/test1.csv', 'r') as f:
    reader = csv.DictReader(f)

    print(reader)
    print(type(reader))
    print(dir(reader))
    print()

    for c in reader:
        for k, v in c.items():
            print(k, v)
        print('-------------')

# 예제4
w = [[1, 2, 3], [4, 5, 6], [7, 8, 9], [10, 11, 12], [13, 14, 15]
    ,[16, 17, 18], [19, 20, 21]]

with open('./resource/write1.csv', 'w', encoding ='utf-8') as f:
    print(dir(csv))
    wt = csv.writer(f)

    print(dir(wt))

    for v in w:
        wt.writerow(v)

# 예제5
with open('./resource/write2.csv', 'w', encoding ='utf-8') as f:
    fields = ['one', 'two', 'three']

    # Dic writer
    wt = csv.DictWriter(f, fieldnames = fields)
    # Hearder writer
    wt.writeheader()

    for v in w:
        wt.writerow({'one' : v[0], 'two' : v[1], 'three' : v[2]})
