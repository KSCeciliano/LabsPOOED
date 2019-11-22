#include <stdio.h>
#include <stdlib.h>

/*********************************************
 Estudiante: Kevin Steven Ceciliano Gamboa
 Carnet: 2019023828
 ********************************************/

//Declaración de struct de estudiante
struct estudiante{
  char nombre;
  int carnet;

  struct estudiante *siguiente;
};

struct estudiante *raiz=NULL;

void insertarInicio(struct estudiante *nodo){
  nodo->siguiente = raiz;

  raiz = nodo;

}

void insertarFinal(struct estudiante *nodo){
  struct estudiante *nodoFinal;
  nodoFinal = malloc(sizeof(struct estudiante));

  nodoFinal = raiz;

  while(nodoFinal->siguiente != NULL){
    nodoFinal = nodoFinal->siguiente;
  }

  nodoFinal->siguiente = nodo;
}

struct estudiante *obtenerPorPosicion(int posicion){
  struct estudiante *nodo;
  nodo = malloc(sizeof(struct estudiante));
  nodo = raiz;

  for(int i=0; i<posicion; i++){
    nodo->siguiente = nodo;
  }
  return nodo;
}

void eliminarPorPosicion(int posicion){
  struct estudiante *nodo;
  nodo = malloc(sizeof(struct estudiante));
  nodo = raiz;

  struct estudiante *nodoAnterior;
  nodo = malloc(sizeof(struct estudiante));

  for(int i=0; i<posicion; i++){
    nodoAnterior = nodo;
    nodo->siguiente = nodo;
  }

  nodoAnterior->siguiente = nodo->siguiente;

  nodo = NULL;
}


void main(){
  int opcion, carnet;
  char nombre;

  struct estudiante *nodo;
  char a;
  int b;

  do{
    printf("\n(0) Salir");
		printf("\n(1) Insertar un estudiante al final de la lista");
    printf("\n(2) Insertar un estudiante al inicio de la lista");
    printf("\n(3) Verificar el carnet de un estudiante en una posición dada");
    printf("\n(4) Eliminar de la lista a un estudiante en una posición dada");

    printf("\n>> Opcion deseada: ");

    
    scanf("%d", &opcion);

    switch(opcion){
      case 0:
        exit(0);
        break;

      case 1:
        printf("Ingrese el nombre:\n");
        scanf(" %c", &a);

        printf("Ingrese el carnet:\n");
        scanf(" %d", &b);

        nodo = malloc(sizeof(struct estudiante));

        nodo->nombre = a;
        nodo->carnet = b;

        insertarFinal(nodo);
        break;

      case 2:
        printf("Ingrese el nombre:\n");
        scanf(" %c", &a);

        printf("Ingrese el carnet:\n");
        scanf(" %d", &b);

        nodo = malloc(sizeof(struct estudiante));

        nodo->nombre = a;
        nodo->carnet = b;

        insertarInicio(nodo);
        break;

      case 3:
        printf("Ingrese la posicion:\n");
        scanf(" %d", &b);

        struct estudiante *nodo = obtenerPorPosicion(b);

        printf("El nombre es: %c", nodo->nombre);
        printf("El carnet es: %d", nodo->carnet);
        break;

      case 4:
        printf("Ingrese la posicion:\n");
        scanf(" %d", &b);

        eliminarPorPosicion(b);

        break;
    }


    }while(opcion != 0);

}

