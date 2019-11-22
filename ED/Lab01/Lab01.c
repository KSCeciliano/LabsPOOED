/*******************************************************
  Instituto Tecnológico de Costa Rica
  2019 II Semestre
  Profesora: Samanta Ramijan Carmiol
  Estudiante: Kevin Steven Ceciliano Gamboa - 2019023828
 *******************************************************/
#include <stdio.h>

struct estudiante{
    char nombre[25];
    int carnet;
};

//Declaración de arreglo de struct de estudiante
struct estudiante estudiantes[10];

void main(){

    for (int indice = 0; indice < 10; indice++) {
      //Se va llenando el arreglo <estudiantes> con informacion que ingresa el usuario
        printf("%d",indice);
        printf(" Ingrese el nombre del estudiante: ");
        scanf("%s", &estudiantes[indice].nombre);

        printf(" Ingrese el carnet del estudiante: ");
        scanf("%d", &estudiantes[indice].carnet);
    }


    int indice_estudianteIngresado;
    printf("Que posicion de carnet desea validar ?\n");
    scanf("%d",&indice_estudianteIngresado);

    int carnet_usuarioIngresado;
    printf("Cuál es el carnet del estudiante en la pos %d\n",indice_estudianteIngresado);
    scanf("%d",&carnet_usuarioIngresado);

    if(carnet_usuarioIngresado == estudiantes[indice_estudianteIngresado].carnet){
        printf("El carnet es correcto\n");
        printf("%d",estudiantes[indice_estudianteIngresado].carnet);
    }
    else{
        printf("El carnet ingresado no corresponde con la posicion %d", indice_estudianteIngresado);
    }
}
