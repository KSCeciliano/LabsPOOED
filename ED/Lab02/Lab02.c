#include <stdio.h>

/*********************************************
 Estudiante: Kevin Steven Ceciliano Gamboa
 Carnet: 2019023828
 ********************************************/

void main(){

    //Declaración de struct de estudiante
    struct estudiante{
        char nombre[25];
        int carnet;
        struct estudiante *siguiente;
    };

    struct estudiante *raiz=NULL;

    int finLista = 0;

    char nombreIngresado[25];
    int carnetIngresado;

    while(!finLista == 1){
        printf("\n\n Si desea terminar la lista ingrese X");
        printf(" Ingrese el nombre del estudiante: ");
        scanf("%s", &nombreIngresado);

        if(nombreIngresado=="X"){
            finLista = 1;
            break;
        }

        printf("\n Ingrese el carnet del estudiante: ");
        scanf("%d", &carnetIngresado);

        struct estudiante *nuevo;
        nuevo = malloc(sizeof(struct estudiante));
        nuevo->nombre = nombreIngresado;
        nuevo->carnet = carnetIngresado;
        nuevo->estudiante = NULL;

        if(raiz==NULL){
            raiz = nuevo;
        }else{
            struct estudiante *temp = raiz;
            while(!temp->siguiente==NULL){
                temp = temp->siguiente;
            }

            temp->siguiente = nuevo;
        }
    }



    int indice_estudianteIngresado;
    printf("Que posicion de carnet desea validar ?\n");
    scanf("%d",&indice_estudianteIngresado);

    int carnet_usuarioIngresado;
    printf("Cuál es el carnet del estudiante en la pos %d\n",indice_estudianteIngresado);
    scanf("%d",&carnet_usuarioIngresado);


    struct estudiante *temporal = raiz;
    for (int i=0; i<indice_estudianteIngresado; i++){
        temporal = temporal->siguiente;
    }

    if(carnet_usuarioIngresado == temporal->carnet){
        printf("El carnet es correcto\n");
        printf("%d",temporal->carnet);
    }
    else{
        printf("El carnet ingresado no corresponde con la posicion %d", indice_estudianteIngresado);
    }
}
