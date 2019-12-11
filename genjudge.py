import re
import random
import string
print('# of test cases? (put 0 if problem doesn\'t have number at beginning of )')
cases = int(input('> '))
print('enter format of test case, along with any bounds.')
print('examples:')
print('w{1-100} generates some string between len 1 and 100 inclusive')
print('d{1-100} generates int from 1 to 100, f{1.0-100.0}4 generates double from 1 to 100 inclusive with max 4 decimal places')
print('n generates a newline, s generates a space')
print('please put spaces between each element bc i am stupid')
print('to get a string, 2 ints and 2 doubles on a single line separated by spaces:')
print('w{10-20} s d{1-10000} s d{1-10000} s f{1.0-10000.0}4 s f{1.0-10000.0}4')
gen = input()
print('warning: this is a destructive action and if you put the name of a file that already exists it will be overriden.')
fname = input('name of file to put data in: (ex: problemname\\Judge\\sample.out) ')
gen = gen.split()
with open(fname, 'w') as f:
    if cases is 0:
        cases = 1
    else:
        f.write(str(cases))
        f.write('\n')
    for i in range(cases):
        thing = ''
        for word in gen:
            if word[:1] == 'w':
                ran = re.split('[\{\-\}]', word[1:])
                while '' in ran:
                    ran.remove('')
                a = int(ran[0])
                b = int(ran[1])
                c = random.randint(a, b)
                for j in range(c):
                    thing = thing + str(random.choice(string.ascii_letters))
            elif word[:1] == 'd':
                ran = re.split('[\{\-\}]', word[1:])
                while '' in ran:
                    ran.remove('')
                a = int(ran[0])
                b = int(ran[1])
                thing = thing + str(random.randint(a, b))
            elif word[:1] == 'f':
                ran = re.split('[\{\-\}]', word[1:])
                while '' in ran:
                    ran.remove('')
                a = float(ran[0])
                b = float(ran[1])
                c = int(ran[2])
                thing = thing + str(round(random.uniform(a,b), c))
            elif word[:1] == 'n':
                thing = thing + '\n'
            elif word[:1] == 's':
                thing = thing + ' '
        f.write(thing)
        f.write('\n')