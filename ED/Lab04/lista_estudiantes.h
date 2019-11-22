/**********************************************************************
    Instituto Tecnológico de Costa Rica
    Estructuras de Datos IC-2001
    II Semestre 2019
    Profesora: Samanta Ramijan Carmiol
    Ejemplos Prácticos: Lista de Estudiantes
    Estudiante:
**********************************************************************/
//Definición de Macros
#define LONGITUD_MAXIMA_NOMBRE 50 
#define LONGITUD_MAXIMA_CARNET 12

//Definición de Estructuras
typedef struct nodo_estudiante
{
	int carnet;
	char *nombre;

	struct nodo_estudiante *ref_siguiente;
}nodo_estudiante;

typedef struct lista_estudiantes
{
	nodo_estudiante *ref_inicio;
	int cantidad;
}lista_estudiantes;

//Definición de Funciones
/*-----------------------------------------------------------------------
	crear_nodo
	Entradas: No recibe parámetros
	Salidas: Retorna un puntero de tipo nodo_estudiante al nodo creado
	Funcionamiento: 
		- Solicita al usuario ingresar Nombre y Carnet.
		- Crea un puntero de tipo nodo_estudiante
		- Le asigna al nodo el nombre y carnet ingresados.
		- El nodo apunta a NULL.
		- retorna el puntero al nuevo nodo.
-----------------------------------------------------------------------*/
nodo_estudiante* crear_nodo();
/*-----------------------------------------------------------------------
	inicializar_lista
	Entradas: No recibe parámetros
	Salidas: No retorna nada
	Funcionamiento: 
		- Crea un objeto tipo lista_estudiantes
		- Establece el atributo de lista_estudiantes llamado cantidad el valor de 0
		- Establece el atributo de lista_estudiantes llamado ref_inicio el valor NULL
-----------------------------------------------------------------------*/
void inicializar_lista();
/*-----------------------------------------------------------------------
	insertar_inicio
	Entradas: 
	Salidas: No retorna nada
	Funcionamiento: 
-----------------------------------------------------------------------*/
void insertar_inicio(nodo_estudiante* nuevo);
/*-----------------------------------------------------------------------
	insertar_final
	Entradas: Puntero de tipo nodo_estudiante llamado nuevo
	Salidas: No retorna nada
	Funcionamiento: 
		- Asigna al valor ref_siguiente del puntero entrado el valor del puntero ref_inicio en ref_lista
		- Asigna al valor del puntero ref_inicio en ref_lista el valor del nodo llamado nuevo
		- A la cantidad en ref_lista le suma 1 
-----------------------------------------------------------------------*/
void insertar_final(nodo_estudiante* nuevo);
/*-----------------------------------------------------------------------
	borrar_por_indice
	Entradas: Un entero llamado indice
	Salidas: No retorna nada
	Funcionamiento: 
		- Se crea un puntero de tipo nodo_estudiante NULL
		- Si la lista está vacia la función retorna
		- Si el indice es mayor a el tamaño de la lista la función retorna
		- Se crea un puntero de tipo nodo_estudiante llamado temporal el valor es del primer nodo de la lista
		- Si el indice es igual a 0 retorna el puntero
		- Si no, inicializa un contador en 0
		- Se recorre la lista hasta que el contador sea igual al indice y el puntero pasa al siguiente nodo
		- Si el contador es igual al indice se resta 1 a la cantidad en ref_lista y se retorna el puntero
-----------------------------------------------------------------------*/
void borrar_por_indice(int indice);
 /*-----------------------------------------------------------------------
	buscar_por_indice
	Entradas: Recibe un int el cual indica el indice en la lista del estudiante que se retorna
	Salidas: Retorna un puntero de tipo nodo_estudiante al nodo en el indice ingresado
	Funcionamiento: 
		- Se crea un puntero de tipo nodo_estudiante NULL
		- Si la lista está vacia retorna NULL
		- Si el indice es mayor a el tamaño de la lista retorna NULL
		- Si no, inicializa un contador en 0
		- Se crea un puntero de tipo nodo_estudiante
		- El puntero apunta al primer nodo de la lista
		- Se recorre la lista hasta que el contador sea igual al indice y el puntero pasa al siguiente nodo
		- Se retorna el puntero
-----------------------------------------------------------------------*/
nodo_estudiante* buscar_por_indice(int indice);

 /*-----------------------------------------------------------------------
	validar_carnets
	Entradas: Entero llamado carnet_almacenado, Entero llamado carnet_ingresado
	Salidas: No retorna nada
	Funcionamiento: 
		- Si el Entero carnet_almacenado es igual al Entero carnet_inreesado
		  se imprime un mensaje que dice "El carnet ingresado es correcto"
		- Si no
		  se imprime un mensaje que dice "El carnet ingresado es incorrecto"
-----------------------------------------------------------------------*/
void validar_carnets(int carnet_almacenado, int carnet_ingresado);
 /*-----------------------------------------------------------------------
	menu
	Entradas: No recibe parametros
	Salidas: No retorna nada
	Funcionamiento: 
		- Imprime la lista de estudiantes
		- Imprime las opciones del menu
		- Recibe una opcion
		- Hace las acciones a realizar segun el caso de la opcion seleccionada
-----------------------------------------------------------------------*/
void menu();
 /*-----------------------------------------------------------------------
	main
	Entradas: No recibe parametros
	Salidas: Entero con valor de 0
	Funcionamiento: 
		- Llama a la función menu()
		- Retorna 0
-----------------------------------------------------------------------*/
int main();
 /*-----------------------------------------------------------------------
	get_user_input
	Entradas: Tipo size_t llamado max_size
	Salidas: Retorna un puntero a un char 
	Funcionamiento: 
		- Declara un buffer del tamaño del puntero a buffer
		- Si el buffer es igual a NULL imprime un error de reserva de memoria
		- Lee los caracteres ingresados en la linea y los guarda en buffer
		- Retorna el buffer
-----------------------------------------------------------------------*/
char* get_user_input(size_t max_size);
 /*-----------------------------------------------------------------------
	get_user_numerical_input
	Entradas: Tipo size_t llamado max_size
	Salidas: Retorna un Entero
	Funcionamiento: 
		- Declara una variable tipo int llamada numerical_input
		  a la misma vez llama y cambia el tipo de variable que retorna la funcion 
		  get_user_input a int
		- Retorna el Entero llamado numerical_input
-----------------------------------------------------------------------*/
int get_user_numerical_input(size_t max_size);