A dos ruedas al cielo
==

Proyecto que va dirigido para la administración de volcanes, guías, rutas e información de los volcanes del Ecuador
By Sebastian Galarza and David Pulloquinga
III SOFTWARE ESPEL 2014


###Proceso para Ejecutar El Programa


####Instalacion de  Python
Al ser un framework web escrito en Python, Django requiere Python. Django funciona con cualquier versión de Python de la 2.4 a la 2.7 (por motivos de incompatibilidades hacia atrás en Python 3.0 Django no funciona actualmente con Python 3.0; mira las preguntas frecuentes de Django (FAQ) para obtener más información sobre versiones de Python soportadas y la transición a la versión 3.0), pero recomendamos instalar Pyhton 2.5 o superior. Si lo haces así no tendrás que montar una base de datos todavía: Python 2.5 ó superior incluye una base de datos ligera llamada SQLite.

**Configura una base de datos**
Si tienes instalado Python 2.5 o superior puedes saltarte este paso de momento.

De lo contrario, o si quieres trabajar con un gestor de bases de datos "grande" como PostgreSQL, MySQL u Oracle consulta la información de instalación de bases de datos.

**Elimina cualquier versión antigua de Django**
Si estás actualizando tu instalación de Django desde una versión previa necesitarás desinstalar la versión antigua de Django antes de instalar la nueva versión.

**Instala Django**
Tienes tres sencillas formas de instalar Django:

nstalar una versión de Django provista por la distribución de tu sistema operativo. Ésta es la opción más rápida para aquellos que tienen sistemas operativos que distribuyen Django.

Instalar una versión oficial publicada. Éste es el mejor método para usuarios que quieren una versión estable y no les importa utilizar una versión de Django ligeramente más antigua.

Instalar la última versión de desarrollo. Ésta es la mejor opción para usuarios que quieren las últimas-y-geniales características y que no tienen miedo a utilizar código nuevo.

####Instalar Paquete PIP en de Python en Windows
**Paso 1**: Descargar Setuptools y el script que instalará pip.

Todo lo encontrarán aquí:

http://www.pip-installer.org/en/latest/installing.html

Primero descargamos setuptools (ez_setup.py). Aquí incluyo el enlace por si desean ir directo: ez_setup.py

Se os abrirá en el navegador un archivo de texto, lo único que tienen que hacer es click derecho y seleccionar "Guardar como ... ", y se descargará en vuestro ordenador como ez_setup.py (salvo que le cambiéis el nombre).

Lo mismo lo hacemos con un archivo llamado get-pip.py que viene a ser el script que instalará pip. Se descarga en la misma página en el apartado de: Install or Upgrade pip. El procedimiento es idéntico a setuptools, el enlace os llevará a un archivo de texto y una vez abierto de hacen click derecho y "Guardar como ... ". Se guardará como get-pip.py. Aquí os facilito el enlace directo: get-pip.py. 

**Paso 2**: Abrir cmd.exe como administrador.

En el menú de inicio escriben cmd y cuando aparezca el icono, hace un click derecho sobre el y seleccionan la opción de abrir como administrador. Lo engorroso es que se abre en Windows\system32 y tendréis que navegar hasta el directorio donde están alojados los archivos. (en mi caso Descargas).

**Paso 3**: Instalar setuptools (ez_setup.py)
``` sh
> python  ez_setup.py

```

**Paso 4**: Instalar pip (get-pip.py)
```sh
> python  get-pip.py

```

**Paso 5**: Editar el path de cmd.

Pip se instalará dentro de los archivos de Python. En mi caso C:\Windows\Python33\Scripts\, de forma que si quieren utilizarlo deberían navegar hasta el directorio donde esté instalado con CMD y ejecutarlo. Esto es muy engorroso. Editando el path de CMD se puede hacer que podamos utilizar pip desde cualquier directorio donde esté CMD.

Para ver los directorios en el path solo tienen que escribir path en cmd y os motrará el listado.

> path

Para añadir un directorio han de escribir la siguiente sintaxis.
```sh
>Path Unidad\Directorio;%path%

En mi caso sería:

>Path C:\Python33\Scripts;%path%
```

De esa forma ya podrían lanzar pip desde cualquier sitio.

###Instalar Pil 
Las siguientes instrucciones indican cómo instalar almohada con soporte para la mayoría de los formatos. Ver bibliotecas externas para las características que usted ganar mediante la instalación de las bibliotecas externas primero. 
Puede instalar la almohadilla con pip :
```sh
$ pip install Pillow
```
Or easy_install (for installing Python Eggs, as pip does not support them):
```sh
$ easy_install Pillow
```
Or download the compressed archive from PyPI, extract it, and inside it run:
```sh
$ python setup.py install

```
###Instalar MySql en Windows

Para descargarte MySQL debes dirigirte a la sección de descargas de la página oficial y elegir MySQL Community Server, que es la versión gratuita del producto. Selecciona Windows como plataforma y elige el instalador MSI que mejor se adapte a tu sistema operativo (32 o 64 bits).

El proceso de instalación es muy simple y prácticamente no requiere intervención por parte del usuario.



Comienza el proceso; sólo nos llevará un par de minutos…



Cada vez que veo la pantalla de la GNU GPL me lleno de felicidad. No sólo por las condiciones y el precio: es además, para mí, una garantía de profesionalidad.



Estadísticamente, la instalación típica será la que mejor se adapte a tus necesidades.



Todo listo; presiona Install cuando quieras.



Una vez instalado MySQL, la siguiente fase es la configuración del servidor en sí mismo. Asegúrate de que la marca Launch the MySQL Instance Configuration Wizard esté activa.



Adelante, sin miedo…



Optamos por Detailed Configuration, de modo que se optimice la configuración del servidor MySQL.



Ha llegado un momento crucial. Dependiendo del uso que vayamos a darle a nuestro servidor deberemos elegir una opción u otra, cada una con sus propios requerimientos de memoria. Puede que te guste la opción Developer Machine, para desarrolladores, la más apta para un uso de propósito general y la que menos recursos consume. Si vas a compartir servicios en esta máquina, probablemente Server Machine sea tu elección o, si vas a dedicarla exclusivamente como servidor SQL, puedes optar por Dedicated MySQL Server Machine, pues no te importará asignar la totalidad de los recursos a esta función.



De nuevo, para un uso de propósito general, te recomiendo la opción por defecto, Multifunctional Database.
