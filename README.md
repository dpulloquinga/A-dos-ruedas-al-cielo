A dos ruedas al cielo
==

Proyecto que va dirigido para la administración de volcanes, guías, rutas e información de los volcanes del Ecuador
By David Pulloquinga


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
