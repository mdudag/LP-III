# Questão 1: Multímetro quebrado?

from random import randrange
from math import sqrt

# Imprime uma linha do modo especificado (apenas para estética)
def linha():
  print("{}{}{}" .format('+', ('-' * 50), '+'))
  

# Programa Principal
linha()
print("|{:^50}|" .format("MULTÍMETRO OPERACIONAL"))
linha()

# Array para guardar os valores medidos para usar no cálculo do desvio padrão posteriormente
valMed = []

media = 0
desvPadr = 0
N = 10

print("|  Medições de Voltagem{:>29}" .format('|'))
linha()

# Atribuindo valores aleatórios as posições do array e os somando na variável media
for i in range(0, N):
  valMed.append(randrange(0, 10001))
  media += valMed[i]
  print(f"  {i+1}º V: {valMed[i]}")

media /= N
print(f"\n  MEDIA: {media}")

# Cálculo do desvio padrão
for i in range(0, N):
  desvPadr += (valMed[i] - media) * (valMed[i] - media)

desvPadr = sqrt((desvPadr/N))
print(f"  DESVIO PADRÃO: {desvPadr}")
linha()

# Se o desvio padrão for maior que 10% da média, temos um multímetro defeituoso
if (desvPadr > (media * 0.1)):
  print("  O multímetro encontra-se defeituoso")
else:
  print("  O multímetro encontra-se operacional")

linha()
