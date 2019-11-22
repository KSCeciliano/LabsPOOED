class lista_enlazada:
  def __init__(self):
    self.cabeza = None

  def agregar_inicio(self, valor):
    temp = Nodo(valor)
    temp.actualizar_siguiente(self.cabeza)
    self.cabeza = temp
    del temp

  def agregar_final(self, valor):
    temp = Nodo(valor)
    nodo_lista = self.cabeza
    while(nodo_lista.siguiente!=None):
      nodo_lista = nodo_lista.siguiente
    nodo_lista.actualizar_siguiente(temp)
    del temp

  def imprimir_contenido(self):
    temp = self.cabeza
    while(temp!=None):
      print(temp.valor)
      temp = temp.siguiente
    del temp

  def tamano_de_lista(self):
    temp = self.cabeza
    if temp==None:
      contador = 0
    else:
      contador = 1
      while(temp.siguiente!=None):
        temp = temp.siguiente
        contador+=1
    del temp
    return contador

  def indice(self, indice):
    if (indice>self.tamano_de_lista() ):
      return None
    else:
      temp = self.cabeza
      contador = 0
      while(contador!=indice):
        temp = temp.siguiente
        contador+=1
      return temp

  def limpiar(self):
    if (self.cabeza==None):
      return
    else:
      temp = self.cabeza
      while(self.cabeza.siguiente!=None):
        temp = self.cabeza.siguiente
        self.cabeza.actualizar_siguiente(temp.siguiente)
        del temp
      self.cabeza = None
      return


  def reverse(self, indice=0):
    if (self.cabeza==None):
      return
    else:
      while(indice!=self.tamano_de_lista()-1):

        ultimo_nodo = self.indice(self.tamano_de_lista()-1)
        penultimo_nodo = self.indice(self.tamano_de_lista()-2)

        ultimo_nodo.actualizar_siguiente(self.indice(indice))
        penultimo_nodo.actualizar_siguiente(None)

        if (indice==0):
          self.cabeza = ultimo_nodo
        else:
          nodo = self.indice(indice-1)
          nodo.actualizar_siguiente(ultimo_nodo)
          del nodo
        del ultimo_nodo
        del penultimo_nodo
        indice+=1
      return


class Nodo:
  def __init__(self, valor=None, siguiente=None):
    self.valor = valor
    self.siguiente = siguiente
    return

  #SETTERS
  def actualizar_valor(self, valor):
    self.valor = valor
    return

  def actualizar_siguiente(self, siguiente):
    self.siguiente = siguiente
    return


####################PRUEBAS####################
#Inicialización de lista
miLista = lista_enlazada()

#AGREGAR INICIO
miLista.agregar_inicio(1)
miLista.agregar_inicio(2)
miLista.agregar_inicio(3)
miLista.agregar_inicio(4)
miLista.agregar_inicio(5)

#AGREGAR FINAL
miLista.agregar_final(6)

#IMPRIMIR CONTENIDO
print("Contenido de la lista")
miLista.imprimir_contenido()
print("Fin del contenido")

#TAMAÑO DE LISTA
print("\nEl tamaño de la lista es: ",miLista.tamano_de_lista())

#INDICE
indice = 1
nodo = miLista.indice(indice)
valor_nodo = str(nodo.valor)
indice = str(indice)

print("\nValor del nodo en indice " + indice + " es: " + valor_nodo )

#REVERSE
print("\n\nLlamada a función reverse")
miLista.reverse()

print("\nContenido de la lista luego de reverse")
miLista.imprimir_contenido()
print("Fin del contenido")

#LIMPIAR
print("\n\nLlamada a función limpiar")
miLista.limpiar()

print("\nContenido de la lista luego de limpiar")
miLista.imprimir_contenido()
print("Fin del contenido")
####################PRUEBAS####################