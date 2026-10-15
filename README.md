# Palácio dos Espelhos
Trabalho da disciplina Projeto e Otimização de Algoritmos (PUCRS).

O programa calcula de quantas formas um raio de luz pode atravessar uma pilha de n placas de vidro sofrendo k reflexões.
## Para executar

Compile:
```
javac mirrorsPalace.java
```
Execute passando o número de placas e o número de reflexões:
```
java espelhos 6 4
```
## Resultados de 16 combinações de (n, k)
| Placas (n) | Reflexões (k) | Possibilidades |
|---:|---:|---|
| 3 | 10 | 144 |
| 3 | 30 | 2178309 |
| 4 | 11 | 8997 |
| 5 | 10 | 48620 |
| 6 | 4 | 190 |
| 9 | 10 | 27604798 |
| 8 | 12 | 181033035  |
| 10 | 6 | 62349 |
| 17 | 12 | 2303702741354 |
| 12 | 15 | 11938642758854 |
| 23 | 10 | 463420218404 |
| 46 | 20 | 220325119537305147629513200783 |
| 31 | 14 | 1379944172254713141 |
| 52 | 57 | 316201974245618260839218082699490550388424074211077672430862734135192935138806247824921 |
| 100 | 30 | 1432580309379894166896896894564471597979149930758581288 |
| 1000 | 1000 | 58597085137494150123… (2804 dígitos) |
