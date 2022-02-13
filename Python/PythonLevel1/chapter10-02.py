# chapter 10-1
# hangman(행맨) 미니게임 제작
# 추가기능 포함

import time
import csv
import random

# 처음 인사
name = input("what is your name? :")
print("Hi, " + name, "Time to play Hangman Game")
print()
time.sleep(1)

print("Start Loading...")
print()
time.sleep(0.5)

# csv 단어의 list
words = []

with open('./resource/word_list.csv', 'r') as f:
    reader = csv.reader(f)
    next(reader) # 헤더 스킵
    for c in reader:
        words.append(c)

# 리스트 섞기
random.shuffle(words)

q = random.choice(words)

# 정답 단어
word = q[0].strip()

# 추측 단어
guesses = ''

# 기회
turns = 10

# 핵심 while loop
# 찬스 카운트가 남아 있을 경우
while turns > 0:
    # 실패 횟수(단어 매치 수)
    failed = 0

    # 정답 단어 반복
    for char in word:
        # 정답 단어 내에 추측 문자가 포함되어 있는 경우
        if char in guesses:
            # 추측 단어 출력
            print(char, end = '')
        else:
            # 틀린 경우
            print('_', end = '')
            failed += 1
    # 단어 추측이 성공한 경우
    if failed == 0:
        print()
        print()
        print('Congratulations! the Guesses is correct')
        # while 구문 중단
        break
    print()

    # 추측 단어 문자 단위 입력
    print()
    print('Hint : {}'.format(q[1].strip()))
    guess = input("guess a character.")

    # 단어 더하기
    guesses += guess

    # 정답 단어에 추측한 문자가 포함되어 있지 않으면
    if guess not in word:
        turns -= 1
        # 오류 메세지
        print("Ooops! Wrong")
        # 남은 기회 출력
        print("You have", turns, 'more guesses')

        if turns == 0:
            print("You Hangman game failed")
