# Jogo de Craps

from random import randrange

def jogoCraps(soma, lanc):
  global ponto
  
  # Possibilidades com a soma dos dados
  if (soma == 7):
    
    # Se for o primeiro lançamento
    if (lanc == 1):
      print("Parabéns!! Você venceu! :D\n")
    else:
       print("Não foi dessa vez, você perdeu :(\n")

    exit(-1)
    
  elif (soma == 11):
    if (lanc == 1):
      print("Parabéns!! Você venceu! :D\n")
      exit(-1)
    
  elif ((soma == 2) or (soma == 3) or (soma == 12)):
    if (lanc == 1):
      print("Não foi dessa vez, você perdeu :(\n")
      exit(-1)

  else:
    if (lanc == 1):
      ponto = soma
      print(f"Ponto: {ponto}\n\nIniciando estágio 2\n      ----")
      
    elif (ponto == soma):
      print("Parabéns!! Você venceu! :D\n")
      exit(-1)


# Programa Principal
lanc = 0

while (1):
  resp = input("Jogue os dados\n\n (1) Jogar\n (0) Sair  ")

  if (resp == 0):
    break

  # Atribuindo valores aos dados e os somando
  dado1 = randrange(1, 7)
  dado2 = randrange(1, 7)
  soma = dado1 + dado2

  print(f"\nDado 1: {dado1}   -   Dado 2: {dado2}")

  lanc += 1
  
  # Se passou de 1 lançamento, então entramos no 2º estágio
  if (lanc > 1):
    print(f"Jogada {lanc-1}: {soma}\n")

  jogoCraps(soma, lanc)
