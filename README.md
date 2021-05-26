# SI_lab2_193136
# Втора лабораториска вежба по Софтверско инженерство

## Симеона Чичева, бр. на индекс 193136

###  Control Flow Graph

![Control Flow Graph](CFG1.png)

### Цикломатска комплексност

Цикломатската комплексност на овој код е 8, истата ја добив преку формулата P+1, каде што P е бројот на предикатни јазли. Во случајoв P=7, па цикломатската комплексност изнесува 8.

### Тест случаи според критериумот  Multiple Condition

statement:  
37 `if (hr < 0 || hr > 24)`

| Combination | Test time |
| ----------- | --------- |
| TF | Time(-5, 1, 1) |
| FT | Time(30, 1, 1) |
| FF | Time(10, 1, 1) |



statement:
46 `if (min < 0 || min > 59)`

| Combination | Test time |
| ----------- | --------- |
| TF | Time(1, -10, 1) |
| FT | Time(1, 60, 1) |
| FF | Time(1, 1, 1) |


statement:
49 `if (sec >= 0 && sec <= 59)`

| Combination | Test time |
| ----------- | --------- |
| TF | Time(1, 1, -10) |
| FT | Time(1, 1, 60) |
| FF | Time(1, 1, 1) |



statement:
55 `if (hr == 24 && min == 0 && sec == 0)`

| Combination | Test time |
| ----------- | --------- |
| TTT | Time(24, 0, 0) |
| TTF | Time(24, 0, 1) |
| TFT | Time(24, 1, 0) |
| TFF | Time(24, 1, 1) |

### Тест случаи според критериумот Every branch

Следнава низа тестови ги покрива сите рамки од графот: 
1. гранката 33-36 се тестира кога влезната листа е празна
2. гранката 37-38 ја тестираме со Тime(25,0,0)
3. гранката 37-45 ја тестираме со Time(0,0,0) 
4. гранката 45-55 ја тестираме со Time(25,0,0)
5. гранката 45-46 ја тестираме со Time(0,0,0)
6. гранката 46-48-49 ја тестираме со Time(0,0,0)
7. гранката 55-59-63 ја тестираме со Time(24,1,1)
8. гранката 55-56-61 ја тестираме со Time(24,0,0)
9. гранката 48-49-51-63 ја тестираме со Time(0,0,60)
10. гранката 48-49-50-61 ја тестираме со Time(0,0,0)
11. гранката 46-47-63 ја тестираме со Time(0,60,0)
12. гранката 38-41-63 ја тестираме со Time(25,0,0)
13. гранката 38-39-63 ја тестираме со Time(-1,0,0)

Со следниве тестни времиња ги поминуваме сите гранки: Time(-1,0,0), Time(0,0,0), Time(25,0,0), Time(24,1,1), Time(24,0,0), Time(0,0,60), Time(0,60,0), Time(-1,0,0) и со празна листа

### Објаснување на напишаните unit tests

Тест случаите кои што генерираат RuntimeException ги тестирам со assertThrows функцијата, а тест случаите кој што генерираат излезна листа ги добивам добиените времиња со assertEquals функцијата, при што вредноста треба да одговара на бројот на секундите во тест времето. 
